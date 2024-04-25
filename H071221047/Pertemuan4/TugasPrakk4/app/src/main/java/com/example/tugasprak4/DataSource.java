package com.example.tugasprak4;

import android.net.Uri;
import com.example.tugasprak4.Post;
import com.example.tugasprak4.User;
import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Post> posts = generatePosts();
    public static User user = new User("Blair Willows", "blairwillows", R.drawable.pp_barbie_charm);

    public static ArrayList<Post> generatePosts() {
        User blair = new User("Blair Willows", "blair_willows", R.drawable.pp_barbie_charm);
        User annika = new User("Princess Annika", "princess_annika", R.drawable.pp_barbie_annika);
        User eden = new User("Eden Starling", "eden_starling", R.drawable.pp_barbie_eden);
        User thumbelina = new User("Thumbelina", "barbie_thumbelina", R.drawable.pp_thumbelina);
        User merliah = new User("Merliah Summers", "merliah_summers", R.drawable.pp_merliah);
        User kara = new User("Kara Thornton", "kara_thornton", R.drawable.pp_kara);
        ArrayList<Post> dump = new ArrayList<>();
        dump.add(new Post(Uri.parse("android.resource://com.example.tugasprak4/drawable/" + "pp_barbie_charm"), "Barbie stars as Blair, a kind-hearted girl who is chosen to attend Princess Charm School. In this magical place, she makes new friends and discovers that there's a princess in every girl!", blair));
        dump.add(new Post(Uri.parse("android.resource://com.example.tugasprak4/drawable/" + "pp_barbie_annika"), "Princess Annika is brave, loving, optimistic, hopeful, and determined. She had a habit of sneaking out of her home to skate, which made her parents worried. She could be quite impulsive and sometimes behaved rashly if she was angry or upset, though she came to realize that lashing out at people in anger didn't solve anything and only made things worse", annika));
        dump.add(new Post(Uri.parse("android.resource://com.example.tugasprak4/drawable/" + "pp_barbie_eden"), "Initially, Eden was shown to be rude, selfish, bad-tempered, bratty, bossy and reluctant to change. But as the plot thickens, her attitude is proved justifiable. As a kid, Eden wasn't so selfish or rude. ", eden));
        dump.add(new Post(Uri.parse("android.resource://com.example.tugasprak4/drawable/" + "pp_thumbelina"), "Thumbelina is assertive and stands up for what she believes in. She is described by Barbie as being the bravest of all the Twillerbees. Thumbelina is a determined girl and easy to get along with. She is sassy and spunky, always in search of adventure. She doesn't have much fear.", thumbelina));
        dump.add(new Post(Uri.parse("android.resource://com.example.tugasprak4/drawable/" + "pp_merliah"), "Princess Merliah is competitive, proud, and brave. She loves to surf more than anything, and she sometimes puts herself before the needs of other people--but she always does the right thing in the end. Although she has come to embrace her mermaid heritage, she loves to spend time with her friends above and below the waves.", merliah));
        dump.add(new Post(Uri.parse("android.resource://com.example.tugasprak4/drawable/" + "pp_kara"), "She is a modern princess who wished to do more important things for her kingdom, and one day is kissed by a magical butterfly. She soon realized that the kiss gave her super powers, and she developed a secret crime-fighting alter ego named Super Sparkle. ", kara));
        return dump;
    }
}
