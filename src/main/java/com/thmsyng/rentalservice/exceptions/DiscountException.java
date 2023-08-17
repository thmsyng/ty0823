package com.thmsyng.rentalservice.exceptions;

public class DiscountException extends Exception {
    private static final String DEFAULT_MSG = "Discount must be between 0 and 100.";
    public DiscountException(){
        super(DEFAULT_MSG);
    }
}
