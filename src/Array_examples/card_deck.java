package Array_examples;

import java.util.Arrays;
import java.util.Random;

public class card_deck {

    public static String [] shuffle(String [] aos){
        Random rng = new Random();
        for (int i = 0; i < aos.length-1; i++){
            int r = rng.nextInt(i,(aos.length));
            String temp = aos[i];
            aos[i] = aos[r];
        }
        return aos;
    }
    public static String [] build_deck(){
        //String [] suits = {"♠️","♣️",️"♥️","♦️"️};
        String [] suits = {"\u2660","\u2665","\u2666","\u2663"};

        String [] ranks = {"2","3","4","5","6","7","8","9","10",
        "jack", "Queen", "King", "Ace"};
        String [] deck = new String [suits.length * ranks.length];
        int i  = 0;
        for (String suit : suits) // for each suit in the suits array
            for (String rank : ranks)
                deck[i++] = suit + rank;
        return deck;
    }

    public static void main(String[] args) {
        String [] deck = build_deck();
        System.out.println(Arrays.toString(deck));
        shuffle(deck);
        System.out.println(Arrays.toString(deck));
    }
}
