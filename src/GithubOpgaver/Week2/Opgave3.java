package GithubOpgaver.Week2;

import java.util.Scanner;

public class Opgave3 {
    //Implement a BMI calculator method. Identify the needed parameters and return type.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indtast vaegt i kilogram: ");
        double vaegt = sc.nextDouble();

        System.out.println("Indtast hoejde i meter");
        double hoejde = sc.nextDouble();

        double BMI = vaegt / (hoejde * hoejde);
        System.out.println("Dit body max index, BMI er " + BMI + " kg/m2");
    }
    }

