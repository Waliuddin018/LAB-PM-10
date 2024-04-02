//package com.example.tugaspratikum3;
//
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//import de.hdodenhof.circleimageview.CircleImageView;
//
//public class PostinganAdapter1 extends RecyclerView.Adapter<PostinganAdapter.ViewHolder> {
//
//    private final ArrayList<Postingan> postingans;
//    private Context context;
//
//    public PostinganAdapter1(Context context, ArrayList<Postingan> postingans) {
//        this.context = context;
//        this.postingans = postingans;
//    }
//
//    @NonNull
//    @Override
//    public PostinganAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view1 = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.grid_item, parent, false);
//
//        return new ViewHolder(view);
//
//    }
//
//    @SuppressLint("NonConstantResourceId")
//    @Override
//    public void onBindViewHolder(@NonNull PostinganAdapter.ViewHolder holder, int position) {
//        Postingan postingan = postingans.get(position);
//
//        holder.profil.setImageResource(postingan.getProfil());
//        holder.name.setText(postingan.getName());
//        holder.tvdesc.setText(postingan.getDesc());
//        holder.post.setImageResource(postingan.getPost());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return postingans.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        CircleImageView profil;
//        TextView name;
//        TextView tvdesc;
//        ImageView post, story;
//
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            name = itemView.findViewById(R.id.tv_name);
//            tvdesc= itemView.findViewById(R.id.desc);
//            profil = itemView.findViewById(R.id.profil);
//            post = itemView.findViewById(R.id.post);
//            story = itemView.findViewById(R.id.stories);
//        }
//    }
//}
