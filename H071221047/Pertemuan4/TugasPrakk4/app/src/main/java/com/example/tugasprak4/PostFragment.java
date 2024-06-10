package com.example.tugasprak4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import com.example.tugasprak4.DataSource;
import com.example.tugasprak4.R;
import com.example.tugasprak4.Post;

public class PostFragment extends Fragment {
    private EditText descriptionEt;
    private ImageView imgContentIv;

    //callback openGallery
    //jika pilih gambar berhasil, gambar tsb ditampilkan di ImageView
    private ActivityResultLauncher<Intent> openGallery = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if (result.getResultCode() == -1) {
                Intent data = result.getData();
                if (data != null) {
                    selectedImg = data.getData();
                    imgContentIv.setImageURI(selectedImg);
                    return;
                }
                Toast.makeText(getActivity(), "Data Kosong", Toast.LENGTH_LONG).show();
            }
        }
    });
    private Button postingBtn;
    private Uri selectedImg;

    //membuat tata letak fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_post, container, false);
    }

    //metode setelah tampilan telah dibuat
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!(requireActivity() == null || ((AppCompatActivity) requireActivity()).getSupportActionBar() == null)) {
            ((AppCompatActivity) requireActivity()).getSupportActionBar().setTitle("Add Post");
        }
        descriptionEt = view.findViewById(R.id.descriptionEt);
        imgContentIv = view.findViewById(R.id.imgContentIv);
        postingBtn = view.findViewById(R.id.postingBtn);
        imgContentIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });
        postingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postContent();
            }
        });
    }

    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        openGallery.launch(intent);
    }

    //method ketika tekan tombol posting
    private void postContent() {
        if (descriptionEt.getText().toString().isEmpty()) {
            Toast.makeText(getActivity(), "Konten Masih Kosong", Toast.LENGTH_LONG).show();
        } else if (selectedImg == null) {
            Toast.makeText(getActivity(), "Pilih Gambar Terlebih Dahulu", Toast.LENGTH_LONG).show();
        } else {
            HomeFragment homeFragment = new HomeFragment();
            Post newPost = new Post(selectedImg, descriptionEt.getText().toString(), DataSource.user);
            Bundle bundle = new Bundle();
            bundle.putParcelable(HomeFragment.EXTRA_POST, newPost);
            homeFragment.setArguments(bundle);
            getParentFragmentManager().beginTransaction().replace(((ViewGroup) getView().getParent()).getId(), homeFragment, HomeFragment.class.getSimpleName()).commit();
        }
    }
}
