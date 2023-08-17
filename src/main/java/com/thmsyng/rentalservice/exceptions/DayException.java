package com.thmsyng.rentalservice.exceptions;

public class DayException extends Exception {
    private static final String DEFAULT_MSG = "Rental days must be 1 or greater.";
    public DayException(){
        super(DEFAULT_MSG);
    }
}
