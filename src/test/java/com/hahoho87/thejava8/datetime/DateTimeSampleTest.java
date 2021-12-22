package com.hahoho87.thejava8.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class DateTimeSampleTest {

    @Test
    void instantTimeTest() {
        Instant now = Instant.now();
        System.out.println("now = " + now);
        System.out.println("UTC = " + now.atZone(ZoneId.of("UTC")));

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);
        ZonedDateTime zonedDateTime = now.atZone(zoneId);
        System.out.println("zonedDateTime = " + zonedDateTime);
    }

    @Test
    void localDateTimeTest() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime birthday = LocalDateTime.of(1987, Month.JUNE, 8, 0, 0, 0);
        System.out.println("birthday = " + birthday);
    }

    @Test
    void periodTest() {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate nextBirthday = LocalDate.of(2022, Month.JUNE, 8);
        System.out.println("nextBirthday = " + nextBirthday);

        Period between = Period.between(today, nextBirthday);
        System.out.println("between = " + between.getMonths() + " months " + between.getDays() + " days");

        long between1 = ChronoUnit.DAYS.between(today, nextBirthday);
        System.out.println("between1 = " + between1);
    }

    @Test
    void convertFormatTest() {
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println("format = " + format);
    }

    @Test
    void addDateTest() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plus = now.plus(10, ChronoUnit.DAYS);
        System.out.println("plus = " + plus);
    }

}