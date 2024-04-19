package com.example.praktikum_3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostinganAdapter extends RecyclerView.Adapter<PostinganAdapter.ViewHolder> {

    private final ArrayList<Postingan> postingans;//final artinya tidak dapat diubah

    private Context context; //digunakan untuk menyimpan konteks dari aplikasi. Konteks ini nantinya akan digunakan oleh adapter untuk mengakses sumber daya aplikasi, seperti tata letak, string, dan lain-lain.

    public PostinganAdapter(ArrayList<Postingan> postingans, Context context) {
        this.context =context;//menyimpan konteks aplikasi tersebut agar dapat diakses di seluruh kelas PostinganAdapter
        this.postingans = postingans;// Ini dilakukan untuk menyimpan daftar postingan yang akan ditampilkan dalam RecyclerView adapter tersebut.
    }

    @NonNull
    @Override
    public PostinganAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post,parent, false);
        return new ViewHolder(view);
    }//membuat viewholder untuk menampilkanitem dari RV dgn meng-inflate tata etak dan mengembalikan viewholder yg sesuai

    @Override
    public void onBindViewHolder(@NonNull PostinganAdapter.ViewHolder holder, int position) {
        Postingan postingan = postingans.get(position);
        holder.setData(postingan);
        //mengatur data dari objek tersebut ke ViewHolder yang sesuai agar data tersebut dapat ditampilkan dalam RecyclerView.

        holder.tvUser.setOnClickListener(v -> {
            if(postingans.get(position).getUsername().equals("voldemort678")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.voldemort);
                intent.putExtra("NAMA PROFILE","Lord Voldemort");
                intent.putExtra("FOLLOWERS","1,5 JT");
                intent.putExtra("FOLLOWING","2");
                intent.putExtra("POSTINGAN", R.drawable.gambar1);
                context.startActivity(intent);
            }  if(postingans.get(position).getUsername().equals("harrypotter")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.harry);
                intent.putExtra("NAMA PROFILE","Harry Potter");
                intent.putExtra("FOLLOWERS","8,6 JT");
                intent.putExtra("FOLLOWING","9");
                intent.putExtra("POSTINGAN", R.drawable.gambar2);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("dracomalfoy")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.malfoy);
                intent.putExtra("NAMA PROFILE","Draco Malfoy");
                intent.putExtra("FOLLOWERS","13,5 JT");
                intent.putExtra("FOLLOWING","51");
                intent.putExtra("POSTINGAN", R.drawable.gamabr3);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("minervamcgonagall")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.minerva);
                intent.putExtra("NAMA PROFILE","Prof. Minerva Macgonagall");
                intent.putExtra("FOLLOWERS","1,3 JT");
                intent.putExtra("FOLLOWING","172");
                intent.putExtra("POSTINGAN", R.drawable.gambar4);
                context.startActivity(intent);
            }if(postingans.get(position).getUsername().equals("prof.dumbledore")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.dumbledore);
                intent.putExtra("NAMA PROFILE","Prof. Dumbledore");
                intent.putExtra("FOLLOWERS","6,9 JT");
                intent.putExtra("FOLLOWING","1");
                intent.putExtra("POSTINGAN", R.drawable.gambar5);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("ms.granger")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.hermoni);
                intent.putExtra("NAMA PROFILE","Hermonie Granger");
                intent.putExtra("FOLLOWERS","9,9 JT");
                intent.putExtra("FOLLOWING","18");
                intent.putExtra("POSTINGAN", R.drawable.gambar6);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("ronniegonnie")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.ron);
                intent.putExtra("NAMA PROFILE","Ron Weasley");
                intent.putExtra("FOLLOWERS","17,6 JT");
                intent.putExtra("FOLLOWING","6");
                intent.putExtra("POSTINGAN", R.drawable.gambar7);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("nevlongbottom")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.neville);
                intent.putExtra("NAMA PROFILE","Neville Longbottom");
                intent.putExtra("FOLLOWERS","3,4 JT");
                intent.putExtra("FOLLOWING","76");
                intent.putExtra("POSTINGAN", R.drawable.gambar8);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("siriusblack")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.sirius);
                intent.putExtra("NAMA PROFILE","The Sirius Black");
                intent.putExtra("FOLLOWERS","5,4 JT");
                intent.putExtra("FOLLOWING","3");
                intent.putExtra("POSTINGAN", R.drawable.gambar9);
                context.startActivity(intent);
            } if(postingans.get(position).getUsername().equals("prof.snape")){
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.snape);
                intent.putExtra("NAMA PROFILE","Professor Snape");
                intent.putExtra("FOLLOWERS","2,4 JT");
                intent.putExtra("FOLLOWING","1");
                intent.putExtra("POSTINGAN", R.drawable.gambar10);
                context.startActivity(intent);
            }
        });
        holder.imageView2.setOnClickListener(v -> {
            if(postingans.get(position).getImage().equals(R.drawable.gambar1)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.voldemort);
                intent.putExtra("NAMA PROFILE", "voldemort678");
                intent.putExtra("STORY",R.drawable.snap1);
                context.startActivity(intent);
            } if(postingans.get(position).getImage().equals(R.drawable.gambar2)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.harry);
                intent.putExtra("NAMA PROFILE", "harrypotter");
                intent.putExtra("STORY",R.drawable.snap2);
                context.startActivity(intent);
            } if(postingans.get(position).getImage().equals(R.drawable.gamabr3)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.malfoy);
                intent.putExtra("NAMA PROFILE", "dracomalfoy");
                intent.putExtra("STORY",R.drawable.snap3);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.gambar4)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.minerva);
                intent.putExtra("NAMA PROFILE", "minervamcgonagall");
                intent.putExtra("STORY",R.drawable.snap4);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.gambar5)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.dumbledore);
                intent.putExtra("NAMA PROFILE", "prof.dumbledore");
                intent.putExtra("STORY",R.drawable.snap5);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.gambar6)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.hermoni);
                intent.putExtra("NAMA PROFILE", "ms.granger");
                intent.putExtra("STORY",R.drawable.snap6);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.gambar7)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.ron);
                intent.putExtra("NAMA PROFILE", "ronniegonnie");
                intent.putExtra("STORY",R.drawable.snap7);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.gambar8)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.neville);
                intent.putExtra("NAMA PROFILE", "nevlongbotton");
                intent.putExtra("STORY",R.drawable.snap8);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.gambar9)){
                Intent intent = new Intent(context, StoryActivity.class);
                intent.putExtra("FOTO PROFILE",R.drawable.sirius);
                intent.putExtra("NAMA PROFILE", "siriusblack");
                intent.putExtra("STORY",R.drawable.snap9);
                context.startActivity(intent);
            }if(postingans.get(position).getImage().equals(R.drawable.gambar10)){
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
        return postingans.size();
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

        public void setData(Postingan postingan) {
            imageView2.setImageResource(postingan.getImage2());
            imageView.setImageResource(postingan.getImage());
            tvUser.setText(postingan.getUsername());
            tvDesc.setText(postingan.getDesc());
        }
    }
}
