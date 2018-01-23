package com.example.couldthisbelove;

import java.util.Random;

public class LoveCalc {
    public static void main(String[] args) {
        int loveScore = ifYouHadMyLove("Mr X.", "Miss Y.");
        System.out.println("Your love score is " + loveScore );
    }

    public static int ifYouHadMyLove(String yourName, String theirName){

        Random randomObj = new Random();
        int loveScore = randomObj.nextInt(101);

        if (loveScore > 80){
            System.out.println("You love each other like Kanye loves Kanye");
        } else if (loveScore > 40){
            System.out.println("You go together like coke and mentos");
        } else {
            System.out.println("No love possible. You'il be forever alone...");
        }

        return loveScore;
    }
}
