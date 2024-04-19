package com.example.praktikum3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {
    private final ArrayList<Account> accounts;
    private ClickListener clickListener;
    public AccountAdapter(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account account = accounts.get(position);
        holder.setData(account);
    }

    @Override
    public int getItemCount() {
        return accounts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView li1_iv_profile;
        TextView li1_tv_username;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            li1_iv_profile = itemView.findViewById(R.id.li1_iv_profile);
            li1_tv_username = itemView.findViewById(R.id.li1_tv_username);

        }

        public void setData(Account account) {
            li1_tv_username.setText(account.getUsername());
            li1_iv_profile.setImageResource(account.getProfile());
            li1_iv_profile.setOnClickListener(view -> {
                clickListener.onItemClicked(account);
            });
        }
    }
    interface ClickListener {
        void onItemClicked(Account account);
    }
}
