package com.example.tugasprak2;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Mahasiswa implements Parcelable {
    private String nama;
    private String nim;
    private String prodi;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    protected Mahasiswa(Parcel in) {
        nama = in.readString();
        nim = in.readString();
        prodi = in.readString();
    }

    public static final Creator<Mahasiswa> CREATOR = new Creator<Mahasiswa>() {
        @Override
        public Mahasiswa createFromParcel(Parcel in) {
            return new Mahasiswa(in);
        }

        @Override
        public Mahasiswa[] newArray(int size) {
            return new Mahasiswa[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(nim);
        parcel.writeString(prodi);
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }
}