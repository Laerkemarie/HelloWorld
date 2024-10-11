package GithubOpgaver.Week2;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Opgave9 {
    public static void main(String[] args) {
        System.out.println("Hvilken ugedag er det i dag?");
        Scanner eventData = new Scanner(System.in);
        String event = eventData.nextLine();

        System.out.println("Hvor mange dage fra i dag er der til eventet skal afholdes?");
        Scanner daysUntil = new Scanner(System.in);
        int days = daysUntil.nextInt();

        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", Locale.forLanguageTag("da"));

        System.out.print("I dag er det " + today.format(formatter));

        LocalDate eventDate = today.plusDays(days);
        DayOfWeek eventDay = eventDate.getDayOfWeek();

        System.out.println(", eventet vil afholdes om " + days + " dage, hvilket er på " + eventDate.format(formatter));
    }
}
