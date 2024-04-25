package com.example.tugaspraktikum3;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Posting> postings = generateDummyPostings();

    private static ArrayList<Posting> generateDummyPostings() {
        ArrayList<Posting> postings = new ArrayList<>();
        postings.add(new Posting(R.drawable.logoenha,"Enhypen", R.drawable.ethan, "Stay tuned, guys!!"));
        postings.add(new Posting(R.drawable.logozb,"Zerobaseone", R.drawable.ricky, "Good night, bestie!!"));
        postings.add(new Posting(R.drawable.logodoun,"Dowoon.drum", R.drawable.doun, "Habis jalan-jalan keliling komplek nih, cape banget"));
        postings.add(new Posting(R.drawable.logokazuha,"Kazuha", R.drawable.kazuha, "Malming di rumah bosen banget euy"));
        postings.add(new Posting(R.drawable.logokarina,"Karina", R.drawable.karina, "Jalan - jalan ke negara tetangga dulu, hihi"));
        postings.add(new Posting(R.drawable.eajlogo,"eajpark", R.drawable.eaj, "Thank you HITC, You were amazing!!"));
        postings.add(new Posting(R.drawable.logoian,"dprian", R.drawable.ian, "First time in Milan but certainly not going to be my last"));
        postings.add(new Posting(R.drawable.logoyuna,"Yuna", R.drawable.yuna, "Sekolah dulu guys!! Belajar yang rajin, jangan suka bolos ya"));
        postings.add(new Posting(R.drawable.logonj,"Newjeans", R.drawable.nj, "Yuhuu akhirnya bisa full team lagi!! Udah lama ga nongki berlima"));
        postings.add(new Posting(R.drawable.logoyeonjun,"Yeonjun", R.drawable.yeonjun, "Karena gue merasa ganteng banget disini, jadi mirror selfie dulu ga sih?"));
        return postings;
    }

    public static ArrayList<Story> stories = generateDummyStorys();

    private static ArrayList<Story> generateDummyStorys() {
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("Enhypen",R.drawable.logoenha));
        stories.add(new Story("Zerobaseone",R.drawable.logozb));
        stories.add(new Story("Dowoon.drum",R.drawable.logodoun));
        stories.add(new Story("Kazuha",R.drawable.logokazuha));
        stories.add(new Story("Karina",R.drawable.logokarina));
        stories.add(new Story("eajpark",R.drawable.eajlogo));
        stories.add(new Story("dprian",R.drawable.logoian));
        stories.add(new Story("Yuna",R.drawable.logoyuna));
        stories.add(new Story("Newjeans",R.drawable.logonj));
        stories.add(new Story("Yeonjun",R.drawable.logoyeonjun));
        return stories;
    }
}

