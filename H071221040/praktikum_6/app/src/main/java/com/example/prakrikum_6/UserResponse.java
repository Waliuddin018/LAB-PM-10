package com.example.prakrikum_6;

import java.util.List;

public class UserResponse {

    private List<User> data; // daftar yang diterima oleh API yang berupa objek2 user
    public List<User> getData() {
        return data;
    }
    public void setData(List<User> data) {
        this.data = data;
    }
}
