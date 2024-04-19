package com.example.tugaspraktikum4;

import java.util.ArrayList;

//  Menyediakan data dummy dalam bentuk ArrayList dari objek Instagram,
//  yang dapat digunakan untuk menampilkan konten Instagram

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Mike Wazowski","Mikee"
                ,"Feeling blue",R.drawable.post2,R.drawable.post2));

        instagrams1.add(new Instagram("Kowalski Mdgc", "Kowalski"
                ,"Mirror selfie"
                ,R.drawable.post3,R.drawable.post3));

        instagrams1.add(new Instagram("Pororo Seon", "Pororo"
                ,"Happy happy happy~"
                ,R.drawable.post4, R.drawable.post4));

        instagrams1.add((new Instagram("Snowy Bunny","Snowy"
                ,"Don't know what to do"
                ,R.drawable.post5,R.drawable.post5)));

        instagrams1.add(new Instagram("Snoopy Beagle", "Snoopy"
                ,"Tolong ini cara keluarnya gimana hadeh"
                ,R.drawable.post6,R.drawable.post6));

        instagrams1.add(new Instagram("Cutie Pie","cutee"
                ,"Wink wink~"
                ,R.drawable.post7, R.drawable.post7));

        instagrams1.add(new Instagram("Sylvester","Sylveee"
                , "Now playing Illit - Magnetic"
                ,R.drawable.post8,R.drawable.post8));

        instagrams1.add(new Instagram("Tobeli Abel","tobeli"
                ,"Dapat topi baru dari angkel"
                ,R.drawable.post9, R.drawable.post9));

        instagrams1.add(new Instagram("Peter Penguin", "Peter"
                ,"Mam coklat dulu"
                ,R.drawable.post10, R.drawable.post10));

        instagrams1.add(new Instagram("Mola & Moli", "molamoli"
                ,"Skincare sebelum bobo"
                ,R.drawable.post11, R.drawable.post11));
        return instagrams1;
    }
}
