package GithubOpgaver.Week2;

public class Opgave2 {
    // Write a method that takes a String as parameter and prints the String twice. The method does not return a value
    public static String stringTwice(String x){
        String word = x;
        String result = word + word;
        return result;
    }
    public static void main(String[] args) {
        String finalWord = stringTwice("Hej ");
        System.out.println(finalWord);
    }
}
