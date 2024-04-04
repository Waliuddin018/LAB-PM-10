package com.example.praktikum_3;

import java.util.ArrayList;

public class Datasources {

    public static ArrayList<Postingan> postingans = generateDummyPostingans();

    private static ArrayList<Postingan> generateDummyPostingans() {
        ArrayList<Postingan> postingans = new ArrayList<>();
        postingans.add(new Postingan(R.drawable.voldemort,"voldemort678", R.drawable.gambar1, "Hogwarts night"));
        postingans.add(new Postingan(R.drawable.harry,"harrypotter", R.drawable.gambar2, "Ronnie with his sorting hat"));
        postingans.add(new Postingan(R.drawable.malfoy,"dracomalfoy", R.drawable.gamabr3, "Slyherin pride"));
        postingans.add(new Postingan(R.drawable.minerva,"minervamcgonagall", R.drawable.gambar4, "piertotum locomotor"));
        postingans.add(new Postingan(R.drawable.dumbledore,"prof.dumbledore", R.drawable.gambar5, "never be so clever you forget to be kind"));
        postingans.add(new Postingan(R.drawable.hermoni,"ms.granger", R.drawable.gambar6, "just a hogwarts"));
        postingans.add(new Postingan(R.drawable.ron,"ronniegonnie", R.drawable.gambar7, "that should be me"));
        postingans.add(new Postingan(R.drawable.neville,"nevlongbottom", R.drawable.gambar8, "warm kisses"));
        postingans.add(new Postingan(R.drawable.sirius,"siriusblack", R.drawable.gambar9, "poor bellatrix"));
        postingans.add(new Postingan(R.drawable.snape,"prof.snape", R.drawable.gambar10, "plan to fail"));
        return postingans;
    }

    public static ArrayList<Story> stories = generateDummyStorys();

    private static ArrayList<Story> generateDummyStorys() {
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("voldemort678",R.drawable.voldemort));
        stories.add(new Story("harrypotter",R.drawable.harry));
        stories.add(new Story("dracomalfoy",R.drawable.malfoy));
        stories.add(new Story("minervamcgonagall",R.drawable.minerva));
        stories.add(new Story("prof.dumbledore",R.drawable.dumbledore));
        stories.add(new Story("ms.granger",R.drawable.hermoni));
        stories.add(new Story("ronniegonnie",R.drawable.ron));
        stories.add(new Story("nevlongbottom",R.drawable.neville));
        stories.add(new Story("siriusblack",R.drawable.sirius));
        stories.add(new Story("prof.snape",R.drawable.snape));
        return stories;
    }
}
