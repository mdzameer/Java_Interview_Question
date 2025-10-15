package asgmnt3.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("India Time: " + indiaTime);
        System.out.println("New York Time: " + nyTime);
        System.out.println("Tokyo Time: " + tokyoTime);
    }
}
