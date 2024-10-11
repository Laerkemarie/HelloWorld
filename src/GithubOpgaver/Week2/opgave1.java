package GithubOpgaver.Week2;

import java.util.Scanner;

public class opgave1 {
    //Write a method that takes three integers as parameter, sums the integers and returns the result.
    public static int sumOfIntegers(int a, int b, int c) {
        int sum1 = a;
        int sum2 = b;
        int sum3 = c;
        int result = sum1 + sum2 + sum3;
        return result;
    }

    public static void main(String[] args) {
        int totalsum = sumOfIntegers(2, 2, 3);
        System.out.println(totalsum);

    }
}

