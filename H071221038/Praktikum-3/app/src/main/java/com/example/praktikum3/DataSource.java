package com.example.praktikum3;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Account> accounts = generateDummyAccounts();

    private static ArrayList<Account> generateDummyAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("ussfeeds",
                R.drawable.ussfeed,
                R.drawable.ussfeed_story,
                R.drawable.ussfeed_image,
                758908,
                79,
                "After winning 1-0 in the first leg, Indonesia secured another win at My Dinh Stadium in Vietnam with a 3-0 score, thanks to a header from Jay Idzes, a brilliant performance by Ragnar Oratmangoen, who made his debut tonight, and last minute goal from Sananta.\n" +
                        "\n" +
                        "This result extends Indonesia’s winning streak over Vietnam to 3 consecutive victories. Furthermore, the Indonesian national team will continue their World Cup 2026 qualifying match in June. Let’s go boys! \uD83C\uDDEE\uD83C\uDDE9\uD83D\uDCA5❤\uFE0F\u200D\uD83D\uDD25\n" +
                        "\n" +
                        "[\uD83D\uDCF8via @timnas.indonesia]\n" +
                        "-\n" +
                        "#USSFeed"));
        accounts.add(new Account("cristiano",
                R.drawable.ronaldo,
                R.drawable.ronaldo_story,
                R.drawable.ronaldo_image,
                6000000,
                180,
                "Muchas felicidades por estos 122 años de historia, familia madridista! ¡Hala Madrid!"));
        accounts.add(new Account("valorant",
                R.drawable.valo_logo,
                R.drawable.valo_story,
                R.drawable.valo_image,
                647389,
                78,
                "a cluttered desk = a cluttered mind? yea, actually. that kinda tracks."));
        accounts.add(new Account("realmadrid",
                R.drawable.realmadrid,
                R.drawable.realmadrid_story,
                R.drawable.realmadrid_image,
                7654867,
                31,
                "⏳ Last time out \uD83C\uDD9A Athletic Club\n" +
                        "El último encuentro \uD83C\uDD9A Athletic Club\n" +
                        "#RealMadridAthletic"));
        accounts.add(new Account("433",
                R.drawable.pat33,
                R.drawable.pat33_story,
                R.drawable.pat33_image,
                561471,
                21,
                "6\uFE0F⃣4\uFE0F⃣ career hat-tricks for @cristiano \uD83D\uDE2E\u200D\uD83D\uDCA8"));
        accounts.add(new Account("manchesterunited",
                R.drawable.mu,
                R.drawable.mu_story,
                R.drawable.mu_image,
                8714635,
                43,
                "Unrivalled commitment ❤\uFE0F\n" +
                        "\n" +
                        "#MUFC #ManUtd #UnitedForTheFans"));
        accounts.add(new Account("mobilelegendsgame",
                R.drawable.ml,
                R.drawable.ml_story,
                R.drawable.ml_image,
                341113,
                12,
                "\uD83D\uDCE3 suara-mu menentukan hadiahmu!\n" +
                        "\n" +
                        "Pendaftaran MICC Season 2 akan dibuka Mei ini, saatnya unjuk skill & jadilah pro player! #ESPORTS4EVERYONE #MICCs2\n" +
                        "\n" +
                        "Untuk merayakannya, MLBB ID telah menyiapkan sebuah event in-game spesial \uD83D\uDE0D ayo pilih hadiah skin yang ingin kamu dapatkan!\n" +
                        "\n" +
                        "#MICCS2 #EsportsForEveryone\n" +
                        "\n" +
                        "Cukup komen skin pilihan dari opsi di atas, kami tunggu pilihan skin kalian yaa~"));
        accounts.add(new Account("leomessi",
                R.drawable.messi,
                R.drawable.messi_story,
                R.drawable.messi_image,
                1967483,
                22,
                "1 año de la locura más hermosa de mi carrera…\n" +
                        "\n" +
                        "Recuerdos inolvidables que quedarán para toda la vida.\n" +
                        "\n" +
                        "Feliz aniversario para todos!!! \uD83C\uDDE6\uD83C\uDDF7\uD83C\uDFC6\uD83D\uDE4C"));
        accounts.add(new Account("folkative",
                R.drawable.folkative,
                R.drawable.folkative_story,
                R.drawable.folkative_image,
                451145,
                42,
                "☺\uFE0F☺\uFE0F☺\uFE0F☺\uFE0F☺\uFE0F☺\uFE0F☺\uFE0F☺\uFE0F☺\uFE0F\n" +
                        "[ib/ Tiktok: simanisskansn]"));
        accounts.add(new Account("dagelan",
                R.drawable.dagelan,
                R.drawable.dagelan_story,
                R.drawable.dagelan_image,
                2453542,
                322,
                "Editor dikejar deadline be like:"));
        accounts.add(new Account("playapex",
                R.drawable.apex2,
                R.drawable.apex_story,
                R.drawable.apex_image,
                1451455,
                90,
                "Tune in Feb 5th at 8 am PT for the launch trailer of Apex Legends: Breakout!\n" +
                        "\n" +
                        "Check it out at the link in our bio"));
        return accounts;
    }
}
