package Opgaver;

import java.util.Random;
import java.util.Scanner;

public class BlackJackGame {

    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(11) + 2;
    }

    public static void main(String[] args) {
        System.out.println("Velkommen til Black Jack spillet med terninger!");
        System.out.println("Du skal spille mod en computer. Den der først rammer tallet 21 har vundet! Slå så mange gange du tør.");

        System.out.println("Er du klar til at starte? Tryk på Enter");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.isEmpty()) {
            System.out.println("Spillet starter nu");

            Scanner scan = new Scanner(System.in);
            String rollAgain = "ja";

            while (rollAgain.equalsIgnoreCase("ja")) {
                int playerSum = rollDice();
                int computerSum = rollDice();

                System.out.println("Du har slået " + playerSum);
                System.out.println("Vil du slå igen? Ja eller nej?");
                String playerSvar = scan.nextLine();

                while (playerSvar.equalsIgnoreCase("Ja")) {
                    playerSum += rollDice();
                    if (computerSum <= 16) {
                        computerSum += rollDice();
                    }
                    System.out.println("Din samlede værdig er nu " + playerSum);

                    if (playerSum == 21) {
                        System.out.println("Du har slået " + playerSum);
                        System.out.println("Du har ramt BlackJack og har dermed vundet spillet!");
                        break;
                    } else if (playerSum > 21) {
                        System.out.println("Du har slået over 21 og har dermed tabt spillet!");
                        break;
                    }
                    System.out.println("Vil du slå igen? Ja eller nej?");
                    playerSvar = scan.nextLine();
                }
                if (playerSum <= 21) {
                    System.out.println("Computerens værdi er " + computerSum);
                    if (computerSum > playerSum && computerSum <= 21) {
                        System.out.println("Computeren vinder");
                    } else if (computerSum == playerSum) {
                        System.out.println("Uafgjort! Computeren vinder, sådan er reglerne");
                    } else if (computerSum > 21) {
                        System.out.println("Computeren har tabt! Du har vundet!");
                    } else {
                        System.out.println("Du vinder!");
                    }
                }
                System.out.println("Vil du prøve igen? Ja eller nej?");
                rollAgain = scan.nextLine();
            }
            scanner.close();
        }
    }
}