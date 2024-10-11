package GithubOpgaver.Week5;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Knud", "Kenneth", true, 8);
        Dog dog2 = new Dog("Buller", "Brian", false, 10);

        dog1.dogInfo();
        dog2.dogInfo();

        System.out.println(dog1.toString());
    }
}
