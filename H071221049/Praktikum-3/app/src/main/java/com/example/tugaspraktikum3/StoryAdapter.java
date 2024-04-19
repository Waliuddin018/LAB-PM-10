package com.example.tugaspraktikum3;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    private final ArrayList<Story> stories;

    private Context context;

    public StoryAdapter(ArrayList<Story> stories, Context context) {
        this.context = context;
        this.stories = stories;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_story,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        Story story = stories.get(position);
        holder.setData(story);

        holder.imageView.setOnClickListener(v -> {
            Log.i("tesss", "stories "+ story.getNama());
            if(stories.get(position).getImage().equals(R.drawable.logoenha)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoenha);
                intent.putExtra("NAMA PROFILE", "Enhypen");
                intent.putExtra("STORY",R.drawable.ethan);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.logozb)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logozb);
                intent.putExtra("NAMA PROFILE", "Zerobaseone");
                intent.putExtra("STORY",R.drawable.ricky);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.logodoun)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logodoun);
                intent.putExtra("NAMA PROFILE", "Dowoon.drum");
                intent.putExtra("STORY",R.drawable.doun);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.logokazuha)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logokazuha);
                intent.putExtra("NAMA PROFILE", "Kazuha");
                intent.putExtra("STORY",R.drawable.kazuha);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.logokarina)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logokarina);
                intent.putExtra("NAMA PROFILE", "Karina");
                intent.putExtra("STORY",R.drawable.karina);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.eajlogo)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.eajlogo);
                intent.putExtra("NAMA PROFILE", "eajpark");
                intent.putExtra("STORY",R.drawable.eaj);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.logoian)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoian);
                intent.putExtra("NAMA PROFILE", "dprian");
                intent.putExtra("STORY",R.drawable.ian);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.logoyuna)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoyuna);
                intent.putExtra("NAMA PROFILE", "Yuna");
                intent.putExtra("STORY",R.drawable.yuna);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.logonj)){
                Log.i("tesss", "storiess nj "+ story.getNama());
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logonj);
                intent.putExtra("NAMA PROFILE", "Newjeans");
                intent.putExtra("STORY",R.drawable.nj);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.logoyeonjun)){
                Log.i("tesss", "storiess yeon "+ story.getNama());
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoyeonjun);
                intent.putExtra("NAMA PROFILE", "Yeonjun");
                intent.putExtra("STORY",R.drawable.yeonjun);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;

        private final TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_nama);
            imageView = itemView.findViewById(R.id.iv_story);
        }

        public void setData(Story story) {
            textView.setText(story.getNama());
            imageView.setImageResource(story.getImage());

        }

    }
}

