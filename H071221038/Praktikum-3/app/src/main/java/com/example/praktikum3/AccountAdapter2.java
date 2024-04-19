package com.example.praktikum3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AccountAdapter2 extends RecyclerView.Adapter<AccountAdapter2.ViewHolder> {
    private final ArrayList<Account> accounts;
    private ClickListener clickListener;

    public AccountAdapter2(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }


    @NonNull
    @Override
    public AccountAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Account account = accounts.get(position);
        holder.setData(account);
    }

    @Override
    public int getItemCount() {
        return accounts.size();
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView li2_iv_profile;
        TextView li2_tv_username;
        ImageView li2_iv_post;
        TextView li2_tv_caption;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            li2_iv_profile = itemView.findViewById(R.id.li2_iv_profile);
            li2_tv_username = itemView.findViewById(R.id.li2_tv_username);
            li2_iv_post = itemView.findViewById(R.id.li2_iv_post);
            li2_tv_caption = itemView.findViewById(R.id.li2_tv_caption);

        }

        public void setData(Account account) {
            li2_iv_profile.setImageResource(account.getProfile());
            li2_tv_username.setText(account.getUsername());
            li2_iv_post.setImageResource(account.getPost());
            li2_tv_caption.setText((account.getCaption()));

            li2_iv_profile.setOnClickListener(view -> {
                clickListener.onItemClicked(account);
            });
            li2_tv_username.setOnClickListener(view -> {
                clickListener.onItemClicked(account);
            });

        }
    }
    interface ClickListener {
        void onItemClicked(Account account);
    }
}
