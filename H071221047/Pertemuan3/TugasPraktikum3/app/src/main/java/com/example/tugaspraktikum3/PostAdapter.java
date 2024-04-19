package com.example.tugaspraktikum3;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private ArrayList<Instagram> instagrams;

    public PostAdapter(ArrayList<Instagram> instagrams){this.instagrams = instagrams;}

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post, parent, false);
        return new PostAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {

        Instagram instagram = instagrams.get(position);

        holder.tv_namaProfile.setText(instagram.getNama());
        holder.ivProfile.setImageResource(instagram.getImageprofile());
        holder.ivFeed.setImageResource(instagram.getImagefeed());
        holder.tv_caption.setText(instagram.getCaption());
    }

    @Override
    public int getItemCount() {
        return instagrams.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFeed, ivProfile;
        TextView tv_caption, tv_namaProfile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFeed = itemView.findViewById(R.id.iv_feed);
            ivProfile = itemView.findViewById(R.id.iv_profile);
            tv_namaProfile = itemView.findViewById(R.id.tv_namaprofile);
            tv_caption = itemView.findViewById(R.id.tv_caption);

            ivProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition(); // Mendapatkan posisi item yang diklik
                    if (position != RecyclerView.NO_POSITION) { // Memastikan posisi item valid

                        Instagram clickedInstagram = Data.instagrams.get(position); // Mendapatkan objek instagram dari ArrayList berdasarkan posisi

                        // Membuat intent
                        Intent intent = new Intent(itemView.getContext(), StoryActivity.class);
                        // Mengirim data melalui intent
                        intent.putExtra("nama", clickedInstagram.getNama());
                        intent.putExtra("imageprofile", clickedInstagram.getImageprofile());
                        intent.putExtra("imagestory", clickedInstagram.getImagestory());
                        intent.putExtra("imagefeed", clickedInstagram.getImagefeed());
                        intent.putExtra("followers", clickedInstagram.getFollowers());
                        intent.putExtra("following", clickedInstagram.getFollowing());
                        intent.putExtra("caption", clickedInstagram.getCaption());
                        intent.putExtra("position", position);
                        // Memulai MainActivity2
                        itemView.getContext().startActivity(intent);
                    }
                }
            });

            tv_namaProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition(); // Mendapatkan posisi item yang diklik
                    if (position != RecyclerView.NO_POSITION) { // Memastikan posisi item valid
                        Instagram clickedInstagram = Data.instagrams.get(position); // Mendapatkan objek instagram dari ArrayList berdasarkan posisi

                        // Membuat intent
                        Intent intent = new Intent(itemView.getContext(), ProfileActivity.class);
                        // Mengirim data melalui intent
                        intent.putExtra("nama", clickedInstagram.getNama());
                        intent.putExtra("imageprofile", clickedInstagram.getImageprofile());
                        intent.putExtra("imagestory", clickedInstagram.getImagestory());
                        intent.putExtra("imagefeed", clickedInstagram.getImagefeed());
                        intent.putExtra("followers", clickedInstagram.getFollowers());
                        intent.putExtra("following", clickedInstagram.getFollowing());
                        intent.putExtra("caption", clickedInstagram.getCaption());
                        intent.putExtra("position", position);
                        // Memulai StoryActivity
                        itemView.getContext().startActivity(intent);
                    }
                }
            });
        }
    }
}
