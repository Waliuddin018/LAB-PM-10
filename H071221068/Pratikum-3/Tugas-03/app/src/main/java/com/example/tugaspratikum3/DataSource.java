package com.example.tugaspratikum3;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Postingan> postingans = generateDummypostingans();

    private static ArrayList<Postingan> generateDummypostingans() {

        ArrayList<Postingan> postingans = new ArrayList<>();

        postingans.add(new Postingan("lifeatgojek", "Welcome to life at gojek! discover stories about our key learnings, culture, opportunities, and GoTroops around the globe. Come along for the ride!", R.drawable.lifeatgojekpost, R.drawable.lifeatgojekprofil));
        postingans.add(new Postingan("lifeatkalla", "Great place to work, Good place to start with kalla group", R.drawable.lifeatkallapost, R.drawable.lifeatkallaprofil));
        postingans.add(new Postingan("lifeatfmcg", "Empowering FMCG careers in indonesia, skill development, networking, and opportunities", R.drawable.lifeatfmcgpost, R.drawable.lifeatfmcgprofil));
        postingans.add(new Postingan("lifeatruangguru", "Yuk intip kehidupan di start up edutech terbesar di Indonesia dan Asia Tenggara", R.drawable.lifeatrgpost, R.drawable.lifeatrgprofil));
        postingans.add(new Postingan("lifeatshopee", "make online shopping easy & enjoyable with our greatest assest", R.drawable.lifeatshoopepost, R.drawable.lifeatshoopeprofil));
        postingans.add(new Postingan("Hasanuddin_Univ", "Perguruan Tinggi & Universitas, Unhasku Bersatu, Unhasku kuat", R.drawable.unhaspost, R.drawable.unhasprofil));
        postingans.add(new Postingan("uicyonsei", "Underwood International College, Yonsei University Official Instagram Account", R.drawable.yonseipost, R.drawable.yonseiprofil));
        postingans.add(new Postingan("harvard", "Sharing photos of hardvard on campus and around the world", R.drawable.harvardpost, R.drawable.harvardprofil));
        postingans.add(new Postingan("univ_indonesia", "Lets share your campus life using universitas indonesia", R.drawable.uipost, R.drawable.uiprofil));
        postingans.add(new Postingan("itb1920", "the official account of Institut Teknologi Bandung", R.drawable.itbpost, R.drawable.itbprofil));

        return postingans;
    }

    public static ArrayList<Story> storys = generateDummystorys();

    private static  ArrayList<Story> generateDummystorys() {
        ArrayList<Story> storys = new ArrayList<>();

        storys.add(new Story(R.drawable.lifeatgojekprofil,"lifeatgojek"));
        storys.add(new Story(R.drawable.lifeatkallaprofil,"lifeatkalla"));
        storys.add(new Story(R.drawable.lifeatfmcgprofil,"lifeatfmcg"));
        storys.add(new Story(R.drawable.lifeatrgprofil,"lifeatrg"));
        storys.add(new Story(R.drawable.lifeatshoopeprofil,"lifeatshopee"));
        storys.add(new Story(R.drawable.unhasprofil,"Hasanuddin_Univ"));
        storys.add(new Story(R.drawable.yonseiprofil,"uicyonsei"));
        storys.add(new Story(R.drawable.harvardprofil,"harvard"));
        storys.add(new Story(R.drawable.uiprofil,"univ_indonesia"));
        storys.add(new Story(R.drawable.itbprofil,"itb1920"));

        return  storys;
    }
}
