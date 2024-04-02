//package com.example.tugaspratikum3;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import android.widget.ImageView;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//import de.hdodenhof.circleimageview.CircleImageView;
//
//import java.util.ArrayList;
//
//public class InstagramAdapter  extends RecyclerView.Adapter<InstagramAdapter.ViewHolder> {
//
//    private ArrayList<Instagram> instagrams;
//
//    public InstagramAdapter(ArrayList<Instagram> instagrams) {
//        this.instagrams = instagrams;
//    }
//
//    @NonNull
//    @Override
//    public InstagramAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.linear_item, parent, false);
//
//        View view2 = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.grid_item, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Instagram instagram = instagrams.get(position);
//
//        holder.profil.setImageResource(instagram.getProfil());
//        holder.name.setText(instagram.getName());
//        holder.tvdesc.setText(instagram.getDesc());
//        holder.post.setImageResource(instagram.getPost());
//        holder.story.setImageResource(instagram.getStory());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return instagrams.size();
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
