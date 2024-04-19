package com.example.praktikum_4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("katyperry","Katy Perry"
                ,"You can’t eclipse #idol tonight \uD83D\uDE0F☀\uFE0F"
                ,R.drawable.katty_profil,R.drawable.katy_post));

        instagrams1.add(new Instagram("selenagomez", "Selena Gomez"
                ,"A @petrafcollins appreciation post \uD83D\uDE4C\uD83C\uDFFD\uD83E\uDD0D"
                ,R.drawable.selena_profil,R.drawable.selena_post));

        instagrams1.add(new Instagram("ladygaga", "Lady Gaga"
                ,"#pfizersponsored Our new @nurtecodt commercial is out today and I’m grateful to shine a light on the migraine community"
                ,R.drawable.ladygaga_profil, R.drawable.ladygaga_post));

        instagrams1.add((new Instagram("theroyalfamily","The Royal Family"
                ,"Wishing all Mothers, and those who are missing their Mums today, a peaceful Mothering Sunday. 🌸"
                ,R.drawable.queen_profil,R.drawable.queen_post)));

        instagrams1.add(new Instagram("vogue", "Vogue"
                ,"Curious what Vogue Shopping’s Madeline Fass is wearing for spring? Browse her shopping wish list filled with the season’s best finds, from elevated white tees and relaxed denim to of-the-moment bags from Bottega Veneta and Khaite."
                ,R.drawable.vogue_profil,R.drawable.vogue_post));

        instagrams1.add(new Instagram("kimkardashian","Kim Kardashian"
                ,"On my way to go find Kate"
                ,R.drawable.kim_profil, R.drawable.kim_post));

        instagrams1.add(new Instagram("adrianalima","Adriana Lima"
                , "Sometimes you have to go beyond the clouds to achieve your goals! Thank you @Goodwill_private_aviation for making it possible for me to arrive in time for my commitments\n" +
                "\n" +
                "This was a necessary logistical work flight! Goodwill and I worked together with @StandForTrees to offset the carbon foot print done by this trip! Thank you @forbes_fr, @Goodtravel.paris, @standfortrees, @dogpound for working together and helping me make it in time️"
                ,R.drawable.adriana_profil,R.drawable.adriana_post));

        instagrams1.add(new Instagram("lilycollins","Lily Collins"
                ,"As I step back into Emily’s shoes, reminiscing on some of my favorite S3 looks and moments. Cannot wait for you all to see this year’s style evolution…"
                ,R.drawable.lily_profil, R.drawable.lily_post));

        instagrams1.add(new Instagram("celinedion", "Céline Dion"
                ,"Lead us to a place, Guide us with your grace, Give us faith so we’ll be safe \uD83C\uDFB6\n" +
                "\n" +
                "“The Prayer” by Andrea Bocelli and Celine Dion is now available to stream on ‘My Easter’, a compilation of all the best Easter songs by Andrea Bocelli. Listen now on your favorite streaming platform!"
                ,R.drawable.celine_profil, R.drawable.celine_post));

        instagrams1.add(new Instagram("harrystyles", "Harry Styles"
                ,"Love On Tour. Barcelona. July, 2023."
                ,R.drawable.harry_profil, R.drawable.harry_post));
        return instagrams1;
    }
}

