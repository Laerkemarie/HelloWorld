package GithubOpgaver.Week2;

import java.util.Scanner;

public class Opgave8 {
    public static void main(String[] args) {
        System.out.println("Hvor mange grader er det i celsius?");
        Scanner getTemp = new Scanner(System.in);
        int temp = getTemp.nextInt();

        if (temp <= -25) {
            System.out.println("Du bør have meget varmt tøj på, det er koldt");
        }
        else if (temp > -25 && temp <= 0) {
            System.out.println("Sørg for at have meget varmt tøj på samt hue og vanter");
        }
        else if (temp > 0 && temp <= 10) {
            System.out.println("Hav en varm vinterjakke på");
        }
        else if (temp > 10 && temp <= 15) {
            System.out.println("Hav en jakke på, alternativt tyndere jakke med en trøje inde under");
        }
        else if (temp > 15 && temp <= 20) {
            System.out.println("Du kan nok godt nøjes med en tynd jakke eller måske er en t-shirt nok");
        }
        else if (temp > 20 && temp <= 25) {
            System.out.println("Det er sommer og vamrt, shorts og t-shirt vejr!");
        }
        else if (temp > 25 && temp <= 40) {
            System.out.println("Tag på stranden!");
        }
        getTemp.close();
    }
}
