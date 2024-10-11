package Person;

public class Person {
    public static void main(String[] args) {
        String firstName = "Magnus";
        String lastName = "Borup";
        int age = 25;
        int height = 195;
        int shoesize = 45;
        String hobby = "compueterspil";

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Shoesize: " + shoesize);
        System.out.println("Hobby: " + hobby);
        System.out.println(firstName + " " + lastName);
        System.out.println("Min makker hedder " + firstName + " " + lastName + " " + "og har" + " " + shoesize + " i skostørrelse.");
    }
}
