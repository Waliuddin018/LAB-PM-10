package com.example.tugasprak4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements PostAdapter.ClickListener, ConfirmDialogFragment.DialogListener {
    public static String EXTRA_POST = "extra_post";
    private TextView noDataTv;
    PostAdapter postAdapter;
    private RecyclerView postRecyclerView;
    private ArrayList<Post> posts = new ArrayList<>();

    //method utk membuat tampilan fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //kalau ada activitynya, judul action bar nya "barbie"
        if (!(getActivity() == null || ((AppCompatActivity) getActivity()).getSupportActionBar() == null)) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Barbie");
        }

        this.postRecyclerView = view.findViewById(R.id.recyclerView);
        this.noDataTv = (TextView) view.findViewById(R.id.textViewNoPosts);

        //ambil data postingan
        this.posts = DataSource.posts;

        //buat objek PostAdapter baru dgn menggunakan data postingan yg tlh ditetapkan sebelumnya dan aktivitas yg terkait
        this.postAdapter = new PostAdapter(this.posts, getActivity());

        //handle klik tombol hapus pd adapter
        this.postAdapter.setOnDeleteButtonClickedListener(this);

        if (getArguments() != null) {
            Post post = getArguments().getParcelable(EXTRA_POST);
            if (post != null) {
                this.posts.add(0, post);
                Toast.makeText(getActivity(), "Post Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
                MainActivity mainActivity = (MainActivity) getActivity();
                if (mainActivity != null) {
                    mainActivity.isActiveHomeMenu(true);
                    mainActivity.isActivePostMenu(false);
                    mainActivity.isActiveProfileMenu(false);
                }
            }
        }
        checkDataEmpty();

        //atur tampilan item secara linear
        this.postRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //ukuran recyclerView konstan
        this.postRecyclerView.setHasFixedSize(true);

        //Menetapkan adapter postAdapter ke RecyclerView untuk menampilkan data.
        this.postRecyclerView.setAdapter(this.postAdapter);
    }

    //Metode yang diimplementasikan dari antarmuka PostAdapter.ClickListener, dipanggil ketika tombol hapus pada postingan diklik.
    @Override
    public void onDeleteButtonClicked(Post post) {
        HomeFragment3(post);
    }

    @Override
    public void setOnClickDeleteButton() {
        if (this.posts != null) {
            HomeFragment2(this.posts);
        }
    }

    //Metode yang memanggil dialog konfirmasi penghapusan postingan.
    public void HomeFragment3(Post post) {
        ConfirmDialogFragment confirmDialogFragment = new ConfirmDialogFragment();
        confirmDialogFragment.show(getChildFragmentManager(), ConfirmDialogFragment.class.getSimpleName());
        Bundle bundle = new Bundle();
        bundle.putParcelable("post", post);
        confirmDialogFragment.setArguments(bundle);
        confirmDialogFragment.setOnClickDeleteButtonListener(this);
    }


    //Metode hpus postingan dari daftar dan memberi tahu adapter utk memperbarui tampilan RecyclerView.
    public void HomeFragment2(ArrayList<Post> post) {
        this.posts.remove(post);
        this.postAdapter.notifyDataSetChanged();
        Toast.makeText(getActivity(), "Data Berhasil Dihapus", Toast.LENGTH_SHORT).show();
        checkDataEmpty();
    }

    public void checkDataEmpty() {
        System.out.println(this.posts.isEmpty());

        //jika dftr postingan kosong, pesan diatur jadi terlihat(visible)
        if (this.posts.isEmpty()) {
            this.noDataTv.setVisibility(View.VISIBLE);

        } else {
            this.noDataTv.setVisibility(View.GONE);
        }
    }
}
