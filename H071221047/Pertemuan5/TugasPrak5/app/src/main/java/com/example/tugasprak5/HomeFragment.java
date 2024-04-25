package com.example.tugasprak4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

    private RecyclerView rv_post;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv_post = view.findViewById(R.id.rv_feed);
        rv_post.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_post.setHasFixedSize(true);
        PostAdapter postAdapter = new PostAdapter(DataSource.posts);
        rv_post.setAdapter(postAdapter);

        //memastikan bahwa postAdapter menerima dan menampilkan data yang valid dari DataSource.posts,
        // asalkan data tersebut ada dan tidak kosong.
        if (DataSource.posts != null && !DataSource.posts.isEmpty()) {
            postAdapter.setData(DataSource.posts);
        }
    }
}