package com.example.myapplication;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyUniversities();

    private static ArrayList<Instagram> generateDummyUniversities() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        // foto pertama untuk profile, postingan , story
        instagrams1.add(new Instagram("rrq_kylar", "Season 13!", R.drawable.skylarx, R.drawable.skylarx, R.drawable.skylarx,"1.5 JT", "5"));
        instagrams1.add(new Instagram("rrq_r7", "Offlaner terkuat di muka bumi!!", R.drawable.r7st, R.drawable.r7st, R.drawable.r7st, "13.5 JT", "6452"));
        instagrams1.add(new Instagram("rrq_xinn", "Goldlaner gacorr!!", R.drawable.xinnpf, R.drawable.xinnpf, R.drawable.xinnpf, "1.3 JT", "172"));
        instagrams1.add(new Instagram("ikhsan_lemon", "Alienn!!", R.drawable.lemon, R.drawable.lemon, R.drawable.lemon, "6.9 JT", "1"));
        instagrams1.add(new Instagram("rrq_vyn", "Captainn!!!", R.drawable.vyn, R.drawable.vyn, R.drawable.vyn, "9.9 JT", "5"));
        instagrams1.add(new Instagram("rrq_clayy", "Lagi pap miror nih", R.drawable.clayy, R.drawable.clayy, R.drawable.clayy, "17.6 JT", "0"));
        instagrams1.add(new Instagram("rrq_banana", "Murid ersepengg!!", R.drawable.banana, R.drawable.banana, R.drawable.banana, "8.6 JT", "4"));
        instagrams1.add(new Instagram("rrq_irrad", "Hyperr anti indomaret!", R.drawable.irrad, R.drawable.irrad, R.drawable.irrad, "3.4 JT", "0"));
        instagrams1.add(new Instagram("rrq_brusko", "Roamer idaman!!", R.drawable.brusko, R.drawable.brusko, R.drawable.brusko, "5.4 JT", "3"));
        instagrams1.add(new Instagram("rrq_syalma", "Brand Ambassador na anak-anak ka tawwa", R.drawable.syalma, R.drawable.syalma, R.drawable.syalma, "2.4 JT", "1"));
        return instagrams1;
    }
}
