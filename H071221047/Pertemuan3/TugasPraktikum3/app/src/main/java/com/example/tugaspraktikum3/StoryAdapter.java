package com.example.tugaspraktikum3;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    private ArrayList<Instagram> instagrams;

    public StoryAdapter(ArrayList<Instagram> instagrams) {
        this.instagrams = instagrams;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        Instagram instagram = instagrams.get(position);

        holder.ivStoryProfile.setImageResource(instagram.getImageprofile());
        holder.tv_name.setText(instagram.getNama());

    }

    @Override
    public int getItemCount() {
        return instagrams.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivStoryProfile;
        TextView tv_name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivStoryProfile = itemView.findViewById(R.id.iv_storyprofile);
            tv_name = itemView.findViewById(R.id.tv_nama);

            ivStoryProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition(); // Mendapatkan posisi item yang diklik
                    if (position != RecyclerView.NO_POSITION) { // Memastikan posisi item valid
                        Instagram clickedInstagram = Data.instagrams.get(position); // Mendapatkan objek dari ArrayList berdasarkan posisi

                        // Membuat intent
                        Intent intent = new Intent(itemView.getContext(), StoryActivity.class);
                        // Mengirim data melalui intent
                        intent.putExtra("nama", clickedInstagram .getNama());
                        intent.putExtra("imageprofile", clickedInstagram .getImageprofile());
                        intent.putExtra("imagestory", clickedInstagram .getImagestory());
                        intent.putExtra("imagefeed", clickedInstagram .getImagefeed());
                        intent.putExtra("followers", clickedInstagram .getFollowers());
                        intent.putExtra("following", clickedInstagram .getFollowing());
                        intent.putExtra("caption", clickedInstagram .getCaption());
                        intent.putExtra("position", position);
                        // Memulai StoryActivity
                        itemView.getContext().startActivity(intent);
                    }
                }
            });
        }
    }
}