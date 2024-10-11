package GithubOpgaver.Week5;

public class Dog {
    String name;
    String ownerName;
    boolean isHungry;
    int age;

    public Dog(String name, String ownerName, boolean isHungry, int age) {
        this.name = name;
        this.ownerName = ownerName;
        this.isHungry = isHungry;
        this.age = age;
    }

    public void dogInfo() {
        System.out.println("Hunden hedder " + name);
        System.out.println("Dens ejer hedder " + ownerName);
        System.out.println("Er hunden sulten? " + isHungry);
        System.out.println("Den er " + age + " år gammel");
        System.out.println();
    }

    public String toString () {
        return "Hunden hedder " + name + "\n" + "Dens ejer hedder " + ownerName + "\n" + "Er hunden sulten? " + isHungry + "\n" + "Den er " + age + " år gammel";
    }
}
