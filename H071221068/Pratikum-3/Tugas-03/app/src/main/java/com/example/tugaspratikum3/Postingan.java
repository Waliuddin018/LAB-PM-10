package com.example.tugaspratikum3;

public class Postingan {
    private String name;

    private  String desc;

    private Integer post, profil;


    public Postingan(String name, String desc, Integer post, Integer profil) {
        this.name = name;
        this.desc = desc;
        this.post = post;
        this.profil = profil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getProfil() {
        return profil;
    }

    public void setProfil(Integer profil) {
        this.profil = profil;
    }
}
