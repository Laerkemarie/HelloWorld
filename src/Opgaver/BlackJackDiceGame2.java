package Opgaver;

import java.util.Random;
import java.util.Scanner;
//dette spil er med en funktion til start
public class BlackJackDiceGame2 {
    public static boolean rollAgain(int sum) {
        System.out.println("Vil du slå igen? Ja eller nej?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        boolean continuePlaying;

        if (choice.equalsIgnoreCase("Ja")) {
            continuePlaying = true;
        } else {
            continuePlaying = false;
            System.out.println("Spillet er slut. Din endelige sum er: " + sum);
        }

        return continuePlaying;

    }

    public static void main(String[] args) {
        System.out.println("Velkommen til Black Jack spillet med terning!");
        System.out.println("Du skal slå med terningen så mange gange, at du rammer tallet 21.");
        System.out.println("Hvor mange gange du ønsker at slå med terningen er op til dig. Dog taber du, hvis du overstiger 21. Held og lykke!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

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
            continuePlaying = rollAgain(sum);
        }
    }
}
