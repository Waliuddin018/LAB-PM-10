package com.example.tugasprak4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import com.example.tugasprak4.DataSource;
import com.example.tugasprak4.R;
import com.example.tugasprak4.Post;

public class ConfirmDialogFragment extends DialogFragment {
    private Button btnBatal;
    private Button btnHapus;
    DialogListener dialogListener;
    Post post;

    //menetapkan listener yang akan menangani aksi klik tombol dalam dialog.
    interface DialogListener {
        void setOnClickDeleteButton();
    }

    //menetapkan listener DialogListener yang akan menangani aksi klik tombol dalam dialog.
    public void setOnClickDeleteButtonListener(DialogListener dialogListener2) {
        this.dialogListener = dialogListener2;
    }

    //membuat tampilan dialog
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_confirm_dialog, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.btnBatal = view.findViewById(R.id.button_cancel);
        this.btnHapus = view.findViewById(R.id.button_delete);
        if (getArguments() != null) {
            this.post = getArguments().getParcelable("post");
        }

        //Ketika tombol "Batal" diklik, dialog akan dibatalkan dan ditutup.
        this.btnBatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().cancel();
            }
        });


        //postingan dihapus dari data source
        //jika dialogListener tdk null, setOnClickDeleteButton() pada listener tersebut akan
        // dipanggil untuk memberitahukan bahwa tombol "Hapus" telah diklik.
        // Setelah itu, dialog akan ditutup.
        this.btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataSource.posts.remove(post);
                if (dialogListener != null) {
                    dialogListener.setOnClickDeleteButton();
                }
                getDialog().dismiss();
            }
        });
    }
}
