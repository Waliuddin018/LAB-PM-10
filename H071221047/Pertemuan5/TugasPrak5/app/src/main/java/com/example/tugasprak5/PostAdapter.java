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
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private ArrayList<Post> posts;
    private Context context;

    public PostAdapter(ArrayList<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_post, parent, false);

        return new PostAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        Post post = posts.get(position);
        holder.tv_nama.setText(post.getNama());
        holder.tv_username.setText(post.getUsername());
        holder.tv_konten.setText(post.getCaption());
        holder.iv_profile.setImageResource(post.getProfile());
        if (post.getPostingan() != null) {
            holder.iv_post.setImageResource(post.getPostingan());
        }
        if (post.getSelectedImage() != null) {
            holder.iv_post.setImageURI(post.getSelectedImage());
        }


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


    public void setData(ArrayList<Post> posts) {
        this.posts = posts;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_username, tv_konten;
        ImageView iv_profile, iv_post;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.text_view1);
            tv_username = itemView.findViewById(R.id.text_view2);
            tv_konten = itemView.findViewById(R.id.text_view3);
            iv_profile = itemView.findViewById(R.id.image_view);
            iv_post = itemView.findViewById(R.id.image_view2);
            context = itemView.getContext();
        }
    }
}
