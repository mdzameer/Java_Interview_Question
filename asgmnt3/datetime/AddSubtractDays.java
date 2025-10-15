package asgmnt3.datetime;

import java.time.LocalDate;

public class AddSubtractDays {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate plusDays = today.plusDays(10);
        LocalDate minusDays = today.minusDays(5);

        System.out.println("Today: " + today);
        System.out.println("10 days later: " + plusDays);
        System.out.println("5 days earlier: " + minusDays);
    }
}
