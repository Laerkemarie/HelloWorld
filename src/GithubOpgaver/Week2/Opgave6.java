package GithubOpgaver.Week2;

import java.util.Random;

public class Opgave6 {
    // throw dice opgave

    public static void main(String[] args) {
        // Random objGenerator bruges altid når noget skal bruge et random nummer
        Random objGenerator = new Random();

        //her skrives 6 i objGeneratoren, da man kan slå op til 6, + 1
            int randomNumber = objGenerator.nextInt(6) + 1;
            System.out.println("Du har slået en " + randomNumber + "'er");

        if (randomNumber ==6) {
            System.out.println("Lucky you");
        }
        }
    }

