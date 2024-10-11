package HelloWorld;

public class Temperatur {
    public static void main(String[] args) {
        //dette er en beregning for omregning af fahrenheit til celsius
        int fahrenheit = 100;
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(celsius);
        System.out.println(fahrenheit + " " + "grader farenheit" + " " + "er det samme som" + " " + celsius + " " + "grader" + " " + "celcius" + " ");
    }
}
