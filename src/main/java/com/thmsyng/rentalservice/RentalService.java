package com.thmsyng.rentalservice;

public class RentalService {
    private RentalService(){

    }

    public static RentalAgreement checkout(String toolCode, int dayCount, int discount, String checkoutDate){
        return new RentalAgreement(toolCode, dayCount, discount, checkoutDate);
    }
}
