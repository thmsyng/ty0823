package com.thmsyng.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

public final class DateUtil {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yy");

    private DateUtil(){

    }

    public static int holidaysInBetween(LocalDate checkoutDate, LocalDate dueDate) {
        int days = 0;
        int year = checkoutDate.getYear();
        LocalDate independenceDay = LocalDate.of(year, Month.JULY, 4);
        LocalDate laborDay = YearMonth.of(year, Month.SEPTEMBER).atDay(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        if(checkoutDate.isBefore(independenceDay) && independenceDay.isBefore(dueDate)){
            days++;
        }
        if(checkoutDate.isBefore(laborDay) && laborDay.isBefore(dueDate)){
            days++;
        }
        return days;
    }

    public static int weekendsInBetween(LocalDate checkoutDate, LocalDate dueDate) {
        Set<DayOfWeek> weekend = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        long days = checkoutDate.datesUntil(dueDate)
                .filter(day -> weekend.contains(day.getDayOfWeek()))
                .count();
        return (int) days;
    }

    public static LocalDate convertToDate(String date) {
        Date d = null;
        try {
            d = DATE_FORMAT.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return d.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static LocalDate getDueDate(LocalDate checkoutDate, int rentalDays) {
        return checkoutDate.plusDays(rentalDays);
    }
}
