package Opgaver;

import java.util.Random;
import java.util.Scanner;
//formålet med opgaven er at lave et black jack dice game
public class BlackJackDiceGame {
    public static void main (String[] args) {
        //først starter spillet med at byde velkommen og forklare reglerne
        System.out.println("Velkommen til Black Jack spillet med terning!");
        System.out.println("Du skal slå med terningen så mange gange, at du rammer tallet 21.");
        System.out.println("Hvor mange gange du ønsker at slå med terningen er op til dig. Dog taber du, hvis du overstiger 21. Held og lykke!");

        //Random bruges altid når der skal bruge et tilfædigt nummer. Scanner er for at få input fra spiller
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Spilleren spørges om han/hun er klar til at spille, de får et choice
        System.out.println("Er du klar til at starte? Tryk på Enter");
        String choice = scanner.nextLine();

        if (choice.isEmpty()) {
            System.out.println("Spillet starter nu");
        }

        int sum = 0; //holder styr på samlet sum
        boolean continuePlaying = true; //skal spillet fortsætte?

        //while loop, da vi ikke ved hvor længe loopet skal køre
        while (continuePlaying) {
            int roll = random.nextInt(6) + 1; //der kan slås fra 1 op til 6
            sum += roll;
            System.out.println("Du slog en " + roll + "´er. Din samlede sum er nu " + sum);

            if (sum == 21) {
                System.out.println("Tillykke, du har vundet spillet, da du præcis har ramt 21!");
                break;
            } else if (sum > 21) {
                System.out.println("Desværre, din sum er mere end 21. Du har tabt");
                break;
            }

            System.out.println("Vil du slå igen? Ja eller nej?");
            choice = scanner.nextLine(); //igen får spiller et valg om at prøve at slå igen

            if (choice.equalsIgnoreCase("nej")) {
                continuePlaying = false;
                System.out.println("Spillet er slut. Din endelige sum er: " + sum);
            }
        }
        scanner.close();
    }
}
