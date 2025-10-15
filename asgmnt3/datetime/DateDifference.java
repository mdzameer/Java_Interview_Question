package asgmnt3.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2025, 10, 4);

        long daysBetween = ChronoUnit.DAYS.between(start, end);
        System.out.println("Days between: " + daysBetween);
    }
}
