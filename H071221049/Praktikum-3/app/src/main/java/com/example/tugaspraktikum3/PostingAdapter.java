package com.example.tugaspraktikum3;

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

public class PostingAdapter extends RecyclerView.Adapter<PostingAdapter.ViewHolder> {

    private ArrayList<Posting> postings;

    private Context context;

    public PostingAdapter(ArrayList<Posting> postings, Context context) {
        this.context = context;
        this.postings = postings;
    }

    @NonNull
    @Override
    public PostingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostingAdapter.ViewHolder holder, int position) {
        Posting posting = postings.get(position);
        holder.setData(posting);

        holder.tvUser.setOnClickListener(v -> {
            if(postings.get(position).getUsername().equals("Enhypen")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoenha);
                intent.putExtra("NAMA PROFILE","Enhypen");
                intent.putExtra("FOLLOWERS","16 M");
                intent.putExtra("FOLLOWING","2");
                intent.putExtra("POSTINGAN", R.drawable.ethan);
                context.startActivity(intent);
            }  if(postings.get(position).getUsername().equals("Zerobaseone")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logozb);
                intent.putExtra("NAMA PROFILE","Zerobaseone");
                intent.putExtra("FOLLOWERS","3 M");
                intent.putExtra("FOLLOWING","2");
                intent.putExtra("POSTINGAN", R.drawable.ricky);
                context.startActivity(intent);
            } if(postings.get(position).getUsername().equals("Dowoon.drum")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logodoun);
                intent.putExtra("NAMA PROFILE","Dowoon.drum");
                intent.putExtra("FOLLOWERS","1.1 M");
                intent.putExtra("FOLLOWING","114");
                intent.putExtra("POSTINGAN", R.drawable.doun);
                context.startActivity(intent);
            } if(postings.get(position).getUsername().equals("Kazuha")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logokazuha);
                intent.putExtra("NAMA PROFILE","Kazuha");
                intent.putExtra("FOLLOWERS","7.2 M");
                intent.putExtra("FOLLOWING","5");
                intent.putExtra("POSTINGAN", R.drawable.kazuha);
                context.startActivity(intent);
            }if(postings.get(position).getUsername().equals("Karina")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logokarina);
                intent.putExtra("NAMA PROFILE","Karina");
                intent.putExtra("FOLLOWERS","13.8 M");
                intent.putExtra("FOLLOWING","4");
                intent.putExtra("POSTINGAN", R.drawable.karina);
                context.startActivity(intent);
            } if(postings.get(position).getUsername().equals("eajpark")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.eajlogo);
                intent.putExtra("NAMA PROFILE","eajpark");
                intent.putExtra("FOLLOWERS","1.4 M");
                intent.putExtra("FOLLOWING","84");
                intent.putExtra("POSTINGAN", R.drawable.eaj);
                context.startActivity(intent);
            } if(postings.get(position).getUsername().equals("dprian")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoian);
                intent.putExtra("NAMA PROFILE","dprian");
                intent.putExtra("FOLLOWERS","4.1 M");
                intent.putExtra("FOLLOWING","22");
                intent.putExtra("POSTINGAN", R.drawable.ian);
                context.startActivity(intent);
            } if(postings.get(position).getUsername().equals("Yuna")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoyuna);
                intent.putExtra("NAMA PROFILE","Yuna");
                intent.putExtra("FOLLOWERS","2.2 M");
                intent.putExtra("FOLLOWING","5");
                intent.putExtra("POSTINGAN", R.drawable.yuna);
                context.startActivity(intent);
            } if(postings.get(position).getUsername().equals("Newjeans")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logonj);
                intent.putExtra("NAMA PROFILE","Newjeans");
                intent.putExtra("FOLLOWERS","11.8 M");
                intent.putExtra("FOLLOWING","2");
                intent.putExtra("POSTINGAN", R.drawable.nj);
                context.startActivity(intent);
            } if(postings.get(position).getUsername().equals("Yeonjun")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoyeonjun);
                intent.putExtra("NAMA PROFILE","Yeonjun");
                intent.putExtra("FOLLOWERS","17.5 M");
                intent.putExtra("FOLLOWING","3");
                intent.putExtra("POSTINGAN", R.drawable.yeonjun);
                context.startActivity(intent);
            }
        });
        holder.imageView2.setOnClickListener(v -> {
            if(postings.get(position).getImage().equals(R.drawable.ethan)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoenha);
                intent.putExtra("NAMA PROFILE", "Enhypen");
                intent.putExtra("STORY",R.drawable.ethan);
                context.startActivity(intent);
            } if(postings.get(position).getImage().equals(R.drawable.ricky)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logozb);
                intent.putExtra("NAMA PROFILE", "Zerobaseone");
                intent.putExtra("STORY",R.drawable.ricky);
                context.startActivity(intent);
            } if(postings.get(position).getImage().equals(R.drawable.doun)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logodoun);
                intent.putExtra("NAMA PROFILE", "Dowoon.drum");
                intent.putExtra("STORY",R.drawable.doun);
                context.startActivity(intent);
            }if(postings.get(position).getImage().equals(R.drawable.kazuha)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logokazuha);
                intent.putExtra("NAMA PROFILE", "Kazuha");
                intent.putExtra("STORY",R.drawable.kazuha);
                context.startActivity(intent);
            }if(postings.get(position).getImage().equals(R.drawable.karina)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logokarina);
                intent.putExtra("NAMA PROFILE", "Karina");
                intent.putExtra("STORY",R.drawable.karina);
                context.startActivity(intent);
            }if(postings.get(position).getImage().equals(R.drawable.eaj)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.eajlogo);
                intent.putExtra("NAMA PROFILE", "eajpark");
                intent.putExtra("STORY",R.drawable.eaj);
                context.startActivity(intent);
            }if(postings.get(position).getImage().equals(R.drawable.ian)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoian);
                intent.putExtra("NAMA PROFILE", "dprian");
                intent.putExtra("STORY",R.drawable.ian);
                context.startActivity(intent);
            }if(postings.get(position).getImage().equals(R.drawable.yuna)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logoyuna);
                intent.putExtra("NAMA PROFILE", "Yuna");
                intent.putExtra("STORY",R.drawable.yuna);
                context.startActivity(intent);
            }if(postings.get(position).getImage().equals(R.drawable.nj)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.logonj);
                intent.putExtra("NAMA PROFILE", "Newjeans");
                intent.putExtra("STORY",R.drawable.nj);
                context.startActivity(intent);
            }if(postings.get(position).getImage().equals(R.drawable.yeonjun)){
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
        return postings.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView, imageView2;

        private final TextView tvUser, tvDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.iv_profile);
            imageView = itemView.findViewById(R.id.iv_post);
            tvUser = itemView.findViewById(R.id.tv_user);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }

        public void setData(Posting posting) {
            imageView2.setImageResource(posting.getImage2());
            imageView.setImageResource(posting.getImage());
            tvUser.setText(posting.getUsername());
            tvDesc.setText(posting.getDesc());
        }
    }
}

