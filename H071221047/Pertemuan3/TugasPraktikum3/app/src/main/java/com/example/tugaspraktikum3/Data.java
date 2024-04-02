package com.example.tugaspraktikum3;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Instagram> instagrams = generateInstagrams();

    private static ArrayList<Instagram> generateInstagrams() {
        ArrayList<Instagram> instagrams = new ArrayList<>();
        instagrams.add(new Instagram("milliebobbiebrown", "my forever prince", R.drawable.profil_millie,  R.drawable.post_millie, R.drawable.story_millie,220, 73));
        instagrams.add(new Instagram("finnwolfhardofficial", "Best spring break ever…right?", R.drawable.profil_finn,  R.drawable.post_finn, R.drawable.story_finn,478, 378));
        instagrams.add(new Instagram("winonaryderofficial", "have you seen new season? \uD83D\uDC40", R.drawable.profil_winona,  R.drawable.post_winona, R.drawable.story_winona,112, 27));
        instagrams.add(new Instagram("gatenm123", "Thanks for all of the support so far for season 3! July 4th is almost here \uD83D\uDCA5", R.drawable.profil_gaten,  R.drawable.post_gaten, R.drawable.story_gaten,592, 15));
        instagrams.add(new Instagram("nattyiceofficial", "\uD83D\uDC9B\uD83D\uDC9A\uD83D\uDC9C this @dior the other night at the #strangerthings3 premiere #3moredays", R.drawable.profil_natty,  R.drawable.post_natty, R.drawable.story_natalia,568, 72));
        instagrams.add(new Instagram("calebmclaughlin", "Vecna \uD83D\uDE08", R.drawable.profil_caleb, R.drawable.post_caleb, R.drawable.story_caleb, 2000, 12));
        instagrams.add(new Instagram("noahschnapp", "ST4 Premiere", R.drawable.profil_noah,  R.drawable.post_noah, R.drawable.story_noah,3000, 12));
        instagrams.add(new Instagram("sadiesink_", "Stranger Things 4 is here! Congrats to the entire ST team ❤\uFE0F ENJOY!!", R.drawable.profil_sadie, R.drawable.story_sadie, R.drawable.post_sadie, 1000, 348));
        instagrams.add(new Instagram("dkharbour", "Best. Season. Yet.\n" +
                "#strangerthings3 #winonaforever #jopper #july4th", R.drawable.profil_david,  R.drawable.post_david, R.drawable.story_david,530, 68));
        instagrams.add(new Instagram("charlie.r.heaton", "ST3 Premier \uD83D\uDD74 @netflix @dior #strangerthings3 \uD83D\uDD1C\uD83D\uDCFA", R.drawable.profil_charlie, R.drawable.post_charlie,R.drawable.story_charlie,  547, 168));
        return instagrams;


    }
}