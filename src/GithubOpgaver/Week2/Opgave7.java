package GithubOpgaver.Week2;

import java.util.Scanner;

public class Opgave7 {
    public static void main(String[] args) {
        Scanner getFullName = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = getFullName.nextLine();

        System.out.println("Enter your last name:");
        String lastName = getFullName.nextLine();

        System.out.println("Enter your gender, male or female?:");
        String gender = getFullName.nextLine();

        System.out.println("Do you want to be adressed formally, yes or no?:");
        String getFormally = getFullName.nextLine();

        boolean isFormal = getFormally.equalsIgnoreCase("yes");
        if (isFormal) {
            if (gender.equalsIgnoreCase("male")) {
                System.out.println("Sir " + firstName + " " + lastName);
            } else if (gender.equalsIgnoreCase("female")) {
                System.out.println("Lady " + firstName + " " + lastName);
            } else {
                System.out.println("Ukendt " + firstName + " " + lastName);
            }

            } else {
                System.out.println(firstName + " " + lastName);
            }
            getFullName.close();
        }
    }
