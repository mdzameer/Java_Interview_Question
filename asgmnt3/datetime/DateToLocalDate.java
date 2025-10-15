package asgmnt3.datetime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDate {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        System.out.println("LocalDate: " + localDate);
    }
}
