package com.example.tugaspratikum3;

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

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    private ArrayList<Story> storys;

    private Context context;

    public StoryAdapter(Context context, ArrayList<Story> storys) {
        this.context = context;
        this.storys = storys;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.linear_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        Story story = storys.get(position);

        holder.profil.setImageResource(story.getProfil());
        holder.name.setText(story.getName());

        holder.name.setOnClickListener(v -> {
            String name = storys.get(position).getName();
            Intent intent = new Intent(context, activity_story.class);
            intent.putExtra("profil_pic", name);

            switch (name) {
                case "lifeatgojek":
                    intent.putExtra("foto_profil", R.drawable.lifeatgojekprofil);
                    intent.putExtra("name_sg", "lifeatgojek");
                    intent.putExtra("story_sg", R.drawable.lifeatgojekstory);
                    break;
                case "lifeatkalla":
                    intent.putExtra("foto_profil", R.drawable.lifeatkallaprofil);
                    intent.putExtra("name_sg", "lifeatkalla");
                    intent.putExtra("story_sg", R.drawable.lifeatkallastory);
                    break;
                case "lifeatfmcg":
                    intent.putExtra("foto_profil", R.drawable.lifeatfmcgprofil);
                    intent.putExtra("name_sg", "lifeatfmcg");
                    intent.putExtra("story_sg", R.drawable.lifeatfmcgstory);
                    break;
                case "lifeatruangguru":
                    intent.putExtra("foto_profil", R.drawable.lifeatrgprofil);
                    intent.putExtra("name_sg", "lifeatruangguru");
                    intent.putExtra("story_sg", R.drawable.lifeatrgstory);
                    break;
                case "lifeatshopee":
                    intent.putExtra("foto_profil", R.drawable.lifeatshoopeprofil);
                    intent.putExtra("name_sg", "lifeatshoope");
                    intent.putExtra("story_sg", R.drawable.lifeatshoopestory);
                    break;
                case "Hasanuddin_Univ":
                    intent.putExtra("foto_profil", R.drawable.unhasprofil);
                    intent.putExtra("name_sg", "Hasanuddin_Univ");
                    intent.putExtra("story_sg", R.drawable.unhasstory);
                    break;
                case "uicyonsei":
                    intent.putExtra("foto_profil", R.drawable.yonseiprofil);
                    intent.putExtra("name_sg", "uicyonsei");
                    intent.putExtra("story_sg", R.drawable.yonseistory);
                    break;
                case "harvard":
                    intent.putExtra("foto_profil", R.drawable.harvardprofil);
                    intent.putExtra("name_sg", "harvard");
                    intent.putExtra("story_sg", R.drawable.harvardstory);
                    break;
                case "univ_indonesia":
                    intent.putExtra("foto_profil", R.drawable.uiprofil);
                    intent.putExtra("name_sg", "univ_indonesia");
                    intent.putExtra("story_sg", R.drawable.uistory);
                    break;
                case "itb1920":
                    intent.putExtra("foto_profil", R.drawable.itbprofil);
                    intent.putExtra("name_sg", "itb1920");
                    intent.putExtra("story_sg", R.drawable.itbstory);
                    break;

            }

            context.startActivity(intent);
        });

        holder.profil.setOnClickListener(v -> {
//            int profil = fotoprofil;
//            Intent intent4 = new Intent(activity_story.this, activity_story.class);
//            intent4.putExtra("profil_pic", profil);

            int profil = storys.get(position).getProfil();
            Intent intent4 = new Intent(context, activity_story.class);
            intent4.putExtra("profil_pic", profil);

            if (profil == R.drawable.lifeatgojekprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatgojekprofil);
                intent4.putExtra("name_sg", "lifeatgojek");
                intent4.putExtra("story_sg", R.drawable.lifeatgojekstory);
            } else if (profil == R.drawable.lifeatkallaprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatkallaprofil);
                intent4.putExtra("name_sg", "lifeatkalla");
                intent4.putExtra("story_sg", R.drawable.lifeatkallastory);
            } else if (profil == R.drawable.lifeatfmcgprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatfmcgprofil);
                intent4.putExtra("name_sg", "lifeatfmcg");
                intent4.putExtra("story_sg", R.drawable.lifeatfmcgstory);
            } else if (profil == R.drawable.lifeatrgprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatrgprofil);
                intent4.putExtra("name_sg", "lifeatruangguru");
                intent4.putExtra("story_sg", R.drawable.lifeatrgstory);
            } else if (profil == R.drawable.lifeatshoopeprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatshoopeprofil);
                intent4.putExtra("name_sg", "lifeatshoope");
                intent4.putExtra("story_sg", R.drawable.lifeatshoopestory);
            } else if (profil == R.drawable.unhasprofil) {
                intent4.putExtra("foto_profil", R.drawable.unhasprofil);
                intent4.putExtra("name_sg", "Hasanuddin_Univ");
                intent4.putExtra("story_sg", R.drawable.unhasstory);
            } else if (profil == R.drawable.yonseiprofil) {
                intent4.putExtra("foto_profil", R.drawable.yonseiprofil);
                intent4.putExtra("name_sg", "uicyonsei");
                intent4.putExtra("story_sg", R.drawable.yonseistory);
            } else if (profil == R.drawable.harvardprofil) {
                intent4.putExtra("foto_profil", R.drawable.harvardprofil);
                intent4.putExtra("name_sg", "harvard");
                intent4.putExtra("story_sg", R.drawable.harvardstory);
            } else if (profil == R.drawable.uiprofil) {
                intent4.putExtra("foto_profil", R.drawable.uiprofil);
                intent4.putExtra("name_sg", "univ_indonesia");
                intent4.putExtra("story_sg", R.drawable.uistory);
            } else if (profil == R.drawable.itbprofil) {
                intent4.putExtra("foto_profil", R.drawable.itbprofil);
                intent4.putExtra("name_sg", "itb1920");
                intent4.putExtra("story_sg", R.drawable.itbstory);
            }

            context.startActivity(intent4);
        });
    }

    @Override
    public int getItemCount() {
        return storys.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView profil;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profil = itemView.findViewById(R.id.profil);
            name = itemView.findViewById(R.id.tv_name);
        }
    }
}
