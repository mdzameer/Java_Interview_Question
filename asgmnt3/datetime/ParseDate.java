package asgmnt3.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDate {
    public static void main(String[] args) {
        String dateStr = "04-10-2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed LocalDate: " + date);
    }
}
