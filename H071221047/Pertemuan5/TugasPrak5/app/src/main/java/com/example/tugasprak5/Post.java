package com.example.tugasprak4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;


public class Post implements Parcelable {

    private String nama, username, caption;
    private Integer profile, postingan;
    private Uri selectedImage;

    public Post(String nama, String username, String caption, Integer profile, Uri selectedImage) {
        this.nama = nama;
        this.username = username;
        this.caption = caption;
        this.profile = profile;
        this.selectedImage = selectedImage;
    }

    public Post(String nama, String username, String caption, Integer profile, Integer postingan) {
        this.nama = nama;
        this.username = username;
        this.caption = caption;
        this.profile = profile;
        this.postingan = postingan;
    }

    protected Post(Parcel in) {
        nama = in.readString();
        username = in.readString();
        caption = in.readString();
        if (in.readByte() == 0) {
            profile = null;
        } else {
            profile = in.readInt();
        }
        if (in.readByte() == 0) {
            postingan = null;
        } else {
            postingan = in.readInt();
        }
        selectedImage = in.readParcelable(Uri.class.getClassLoader());
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        @Override
        public Post createFromParcel(Parcel in) {
            return new Post(in);
        }

        @Override
        public Post[] newArray(int size) {
            return new Post[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getProfile() {
        return profile;
    }

    public void setProfile(Integer profile) {
        this.profile = profile;
    }

    public Integer getPostingan() {
        return postingan;
    }

    public void setPostingan(Integer postingan) {
        this.postingan = postingan;
    }

    public Uri getSelectedImage() {
        return selectedImage;
    }

    public void setSelectedImage(Uri selectedImage) {
        this.selectedImage = selectedImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(username);
        dest.writeString(caption);
        if (profile == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(profile);
        }
        if (postingan == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(postingan);
        }
        dest.writeParcelable(selectedImage, flags);
    }

}
