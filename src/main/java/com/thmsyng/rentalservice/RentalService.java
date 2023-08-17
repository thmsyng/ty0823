package com.thmsyng.rentalservice;

import com.thmsyng.rentalservice.exceptions.DayException;
import com.thmsyng.rentalservice.exceptions.DiscountException;

import static com.thmsyng.utils.UserInputValidator.isValidDayCount;
import static com.thmsyng.utils.UserInputValidator.isValidDiscount;

public class RentalService {
    private RentalService(){

    }

    public static RentalAgreement checkout(String toolCode, int dayCount, int discount, String checkoutDate) throws DayException, DiscountException {
        if(!isValidDayCount(dayCount)){
            throw new DayException();
        }
        if(!isValidDiscount(discount)){
            throw new DiscountException();
        }
        return new RentalAgreement(toolCode, dayCount, discount, checkoutDate);
    }
}
