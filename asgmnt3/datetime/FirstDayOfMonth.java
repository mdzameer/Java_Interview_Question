package asgmnt3.datetime;

import java.time.LocalDate;

public class FirstDayOfMonth {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstDay = today.withDayOfMonth(1);

        System.out.println("First day of the month: " + firstDay);
    }
}
