package com.example.tugasprak4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Post> posts = generateDummyModels();

    private static ArrayList<Post> generateDummyModels() {
        ArrayList<Post> posts1 = new ArrayList<>();
        posts1.add(new Post("Blair Willows", "blair_willows", "Despite being a teenage girl, Blair is a very loving, caring, optimistic, selflessly, and hardworking. She is notably intelligent, but also somewhat clumsy. While elegant and regal, she nevertheless has a great sense of humor and likes to have fun.", R.drawable.pp_barbie_charm, R.drawable.post_blair));
        posts1.add(new Post("Merliah Summers", "merliah_summers", "Merliah is a teenage girl with long blonde hair, blue eyes, and light skin. When Merliah was 16, pink streaks appeared in her hair when it came into contact with water. She has a heart shaped face, and naturally tanned skin from spending most of her time in the sun. ", R.drawable.pp_merliah, R.drawable.post_merliah));
        posts1.add(new Post("Thumbellina", "barbie_thumbelinna", "Thumbelina is assertive and stands up for what she believes in. She is described by Barbie as being the bravest of all the Twillerbees. ", R.drawable.pp_thumbelina, R.drawable.post_thumbelina));
        posts1.add(new Post("Princess Kara", "princess_kara", "She is a modern princess who wished to do more important things for her kingdom, and one day is kissed by a magical butterfly", R.drawable.pp_kara, R.drawable.post_kara));

        return posts1;
    }
}
