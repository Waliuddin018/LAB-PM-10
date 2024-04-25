package com.example.tugaspratikum3;

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

import de.hdodenhof.circleimageview.CircleImageView;

public class PostinganAdapter extends RecyclerView.Adapter<PostinganAdapter.ViewHolder> {

    private final ArrayList<Postingan> postingans;
    private Context context;

    public PostinganAdapter(Context context, ArrayList<Postingan> postingans) {
        this.context = context;
        this.postingans = postingans;
    }

    @NonNull
    @Override
    public PostinganAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_item, parent, false);

        return new ViewHolder(view);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onBindViewHolder(@NonNull PostinganAdapter.ViewHolder holder, int position) {
        Postingan postingan = postingans.get(position);

        holder.profil.setImageResource(postingan.getProfil());
        holder.name.setText(postingan.getName());
        holder.tvdesc.setText(postingan.getDesc());
        holder.post.setImageResource(postingan.getPost());

        holder.name.setOnClickListener(v -> {
            String name = postingans.get(position).getName();
            Intent intent = new Intent(context, profile_activity.class);
            intent.putExtra("nama_profil", name);

            switch (name) {
                case "lifeatgojek":
                    intent.putExtra("foto_profil", R.drawable.lifeatgojekprofil);
                    intent.putExtra("followers", "11JT");
                    intent.putExtra("following", "300K");
                    intent.putExtra("postingan", R.drawable.lifeatgojekpost);
                    break;
                case "lifeatkalla":
                    intent.putExtra("foto_profil", R.drawable.lifeatkallaprofil);
                    intent.putExtra("followers", "15JT");
                    intent.putExtra("following", "200K");
                    intent.putExtra("postingan", R.drawable.lifeatkallapost);
                    break;
                case "lifeatfmcg":
                    intent.putExtra("foto_profil", R.drawable.lifeatfmcgprofil);
                    intent.putExtra("followers", "5JT");
                    intent.putExtra("following", "700K");
                    intent.putExtra("postingan", R.drawable.lifeatfmcgpost);
                    break;
                case "lifeatruangguru":
                    intent.putExtra("foto_profil", R.drawable.lifeatrgprofil);
                    intent.putExtra("followers", "5JT");
                    intent.putExtra("following", "700K");
                    intent.putExtra("postingan", R.drawable.lifeatrgpost);
                    break;
                case "lifeatshopee":
                    intent.putExtra("foto_profil", R.drawable.lifeatshoopeprofil);
                    intent.putExtra("followers", "2JT");
                    intent.putExtra("following", "700K");
                    intent.putExtra("postingan", R.drawable.lifeatshoopepost);
                    break;
                case "Hasanuddin_Univ":
                    intent.putExtra("foto_profil", R.drawable.unhasprofil);
                    intent.putExtra("followers", "23JT");
                    intent.putExtra("following", "700K");
                    intent.putExtra("postingan", R.drawable.unhaspost);
                    break;
                case "uicyonsei":
                    intent.putExtra("foto_profil", R.drawable.yonseiprofil);
                    intent.putExtra("followers", "53JT");
                    intent.putExtra("following", "500K");
                    intent.putExtra("postingan", R.drawable.yonseipost);
                    break;
                case "harvard":
                    intent.putExtra("foto_profil", R.drawable.harvardprofil);
                    intent.putExtra("followers", "9JT");
                    intent.putExtra("following", "570K");
                    intent.putExtra("postingan", R.drawable.harvardpost);
                    break;
                case "univ_indonesia":
                    intent.putExtra("foto_profil", R.drawable.uiprofil);
                    intent.putExtra("followers", "10JT");
                    intent.putExtra("following", "200K");
                    intent.putExtra("postingan", R.drawable.uipost);
                    break;
                case "itb1920":
                    intent.putExtra("foto_profil", R.drawable.itbprofil);
                    intent.putExtra("followers", "10JT");
                    intent.putExtra("following", "205K");
                    intent.putExtra("postingan", R.drawable.itbpost);
                    break;

            }

            context.startActivity(intent);
        });

        holder.profil.setOnClickListener(v -> {
            int profil = postingans.get(position).getProfil();
            Intent intent = new Intent(context, activity_story.class);
            intent.putExtra("profil_pic", profil);

            if (profil == R.drawable.lifeatgojekprofil) {
                intent.putExtra("foto_profil", R.drawable.lifeatgojekprofil);
                intent.putExtra("name_sg", "lifeatgojek");
                intent.putExtra("story_sg", R.drawable.lifeatgojekstory);
            } else if (profil == R.drawable.lifeatkallaprofil) {
                intent.putExtra("foto_profil", R.drawable.lifeatkallaprofil);
                intent.putExtra("name_sg", "lifeatkalla");
                intent.putExtra("story_sg", R.drawable.lifeatkallastory);
            } else if (profil == R.drawable.lifeatfmcgprofil) {
                intent.putExtra("foto_profil", R.drawable.lifeatfmcgprofil);
                intent.putExtra("name_sg", "lifeatfmcg");
                intent.putExtra("story_sg", R.drawable.lifeatfmcgstory);
            } else if (profil == R.drawable.lifeatrgprofil) {
                intent.putExtra("foto_profil", R.drawable.lifeatrgprofil);
                intent.putExtra("name_sg", "lifeatruangguru");
                intent.putExtra("story_sg", R.drawable.lifeatrgstory);
            } else if (profil == R.drawable.lifeatshoopeprofil) {
                intent.putExtra("foto_profil", R.drawable.lifeatshoopeprofil);
                intent.putExtra("name_sg", "lifeatshoope");
                intent.putExtra("story_sg", R.drawable.lifeatshoopestory);
            } else if (profil == R.drawable.unhasprofil) {
                intent.putExtra("foto_profil", R.drawable.unhasprofil);
                intent.putExtra("name_sg", "Hasanuddin_Univ");
                intent.putExtra("story_sg", R.drawable.unhasstory);
            } else if (profil == R.drawable.yonseiprofil) {
                intent.putExtra("foto_profil", R.drawable.yonseiprofil);
                intent.putExtra("name_sg", "uicyonsei");
                intent.putExtra("story_sg", R.drawable.yonseistory);
            } else if (profil == R.drawable.harvardprofil) {
                intent.putExtra("foto_profil", R.drawable.harvardprofil);
                intent.putExtra("name_sg", "harvard");
                intent.putExtra("story_sg", R.drawable.harvardstory);
            } else if (profil == R.drawable.uiprofil) {
                intent.putExtra("foto_profil", R.drawable.uiprofil);
                intent.putExtra("name_sg", "univ_indonesia");
                intent.putExtra("story_sg", R.drawable.uistory);
            } else if (profil == R.drawable.itbprofil) {
                intent.putExtra("foto_profil", R.drawable.itbprofil);
                intent.putExtra("name_sg", "itb1920");
                intent.putExtra("story_sg", R.drawable.itbstory);
            }

            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return postingans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profil;
        TextView name;
        TextView tvdesc;
        ImageView post, story;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_name);
            tvdesc= itemView.findViewById(R.id.desc);
            profil = itemView.findViewById(R.id.profil);
            post = itemView.findViewById(R.id.post);
            story = itemView.findViewById(R.id.stories);
        }
    }
}
