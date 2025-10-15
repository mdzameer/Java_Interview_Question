package asgmnt3.datetime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateConversion {
    public static void main(String[] args) {
        // LocalDate to Date
        LocalDate localDate = LocalDate.now();
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Converted Date: " + date);

        // Date to LocalDate
        LocalDate convertedBack = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        System.out.println("Converted LocalDate: " + convertedBack);
    }
}
