package com.example.pertemuan5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams =generateDummyInstagram();

    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("rrq_syalma","Syalma"
                ,"jantung kalian aman kan?"
                ,R.drawable.syalma,R.drawable.syalma));

        instagrams1.add(new Instagram("rrq_xinnn", "Xin"
                ,"Dah cocok belum jadi BOTAK ???"
                ,R.drawable.xinnpf,R.drawable.xinnpf));

        instagrams1.add(new Instagram("rrq_skylar", "Skylar"
                ,"REX REGUM QEON !!!"
                ,R.drawable.skylarx, R.drawable.skylarx));

        instagrams1.add(new Instagram("rrq_r7","R7"
                ,"We lost dek we lost"
                ,R.drawable.r7st,R.drawable.r7st));

        instagrams1.add(new Instagram("rrq_lemon", "Lemon"
                ,"Biasa aja"
                ,R.drawable.lemon,R.drawable.lemon));

        instagrams1.add(new Instagram("rrq_irrad","Irrad"
                ,"Thankyou RSG, Lets go RRQ"
                ,R.drawable.irrad, R.drawable.irrad));

        instagrams1.add(new Instagram("rrq_clayy","Deden"
                , "MVP!!!"
                ,R.drawable.clayy,R.drawable.clayy));

        instagrams1.add(new Instagram("rrq_brusko","Brusko"
                ,"We are @teamrrq !"
                ,R.drawable.brusko, R.drawable.brusko));

        instagrams1.add(new Instagram("rrq_banana", "Banana"
                ,"HOLIDAY!!"
                ,R.drawable.banana, R.drawable.banana));

        instagrams1.add(new Instagram("rrq_vynnn", "Vyn"
                ,"Konsisten, Konsisten, Konsisten!"
                ,R.drawable.vyn, R.drawable.vyn));
        return instagrams1;

    }

}
