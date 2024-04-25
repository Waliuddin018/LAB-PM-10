package com.example.praktikum_3;

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

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder>{

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
            if(stories.get(position).getImage().equals(R.drawable.voldemort)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.voldemort);
                intent.putExtra("NAMA PROFILE", "voldemort678");
                intent.putExtra("STORY",R.drawable.snap1);
                context.startActivity(intent);
            } if(stories.get(position).getImage().equals(R.drawable.harry)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.harry);
                intent.putExtra("NAMA PROFILE", "harrypotter");
                intent.putExtra("STORY",R.drawable.snap2);
                context.startActivity(intent);
            } if(stories.get(position).getImage().equals(R.drawable.malfoy)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.malfoy);
                intent.putExtra("NAMA PROFILE", "dracomalfoy");
                intent.putExtra("STORY",R.drawable.snap3);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.minerva)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.minerva);
                intent.putExtra("NAMA PROFILE", "minervamcgonagall");
                intent.putExtra("STORY",R.drawable.snap4);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.dumbledore)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.dumbledore);
                intent.putExtra("NAMA PROFILE", "prof.dumbledore");
                intent.putExtra("STORY",R.drawable.snap5);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.hermoni)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.hermoni);
                intent.putExtra("NAMA PROFILE", "ms.granger");
                intent.putExtra("STORY",R.drawable.snap6);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.ron)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.ron);
                intent.putExtra("NAMA PROFILE", "ronniegonnie");
                intent.putExtra("STORY",R.drawable.snap7);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.neville)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.neville);
                intent.putExtra("NAMA PROFILE", "nevlongbotton");
                intent.putExtra("STORY",R.drawable.snap8);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.sirius)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.sirius);
                intent.putExtra("NAMA PROFILE", "siriusblack");
                intent.putExtra("STORY",R.drawable.snap9);
                context.startActivity(intent);
            }if(stories.get(position).getImage().equals(R.drawable.snape)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.snape);
                intent.putExtra("NAMA PROFILE", "prof.snape");
                intent.putExtra("STORY",R.drawable.snap10);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

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
        };

    }
}
