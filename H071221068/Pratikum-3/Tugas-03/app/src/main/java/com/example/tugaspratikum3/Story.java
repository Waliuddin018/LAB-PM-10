package com.example.tugaspratikum3;

public class Story {

    private Integer profil;

    private String name;


    public Story(Integer profil, String name) {
        this.profil = profil;
        this.name = name;
    }

    public Integer getProfil() {
        return profil;
    }

    public void setProfil(Integer profil) {
        this.profil = profil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
