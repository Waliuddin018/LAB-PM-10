package com.example.tugasprak4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {
    private ArrayList<Post> posts;
    private Context context;

    public SearchAdapter(ArrayList<Post> models) {
        this.posts = models;
    }

    public void setFilteredList(ArrayList<Post> filteredList){
        this.posts = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SearchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search, parent, false);

        return new SearchAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        Post post = posts.get(position);
        holder.tv_nama.setText(post.getNama());
        holder.tv_username.setText(post.getUsername());
        holder.iv_profile.setImageResource(post.getProfile());


        holder.tv_nama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, ProfileActivity.class);
                intent.putExtra("post", post);
                holder.context.startActivity(intent);
            }
        });

        holder.iv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, ProfileActivity.class);
                intent.putExtra("post", post);
                holder.context.startActivity(intent);
            }
        });

        holder.tv_username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, ProfileActivity.class);
                intent.putExtra("post", post);
                holder.context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }


    public void setData(ArrayList<Post> models) {
        this.posts = models;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_username;
        ImageView iv_profile, iv_post;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.tv_nama1);
            tv_username = itemView.findViewById(R.id.tv_username1);
            iv_profile = itemView.findViewById(R.id.iv_profile1);
            context = itemView.getContext();
        }
    }
}
