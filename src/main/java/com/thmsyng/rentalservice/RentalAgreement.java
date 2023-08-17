package com.thmsyng.rentalservice;

import com.thmsyng.constants.Tool;
import org.apache.commons.lang3.EnumUtils;

import java.util.Date;

public class RentalAgreement {
    private Tool tool;
    private int rentalDays;
    private Date checkoutDate;
    private Date dueDate;
    private int chargableDays;
    private double chargeBeforeDiscount;
    private double discountPercent;
    private double discountAmount;
    private double finalCharge;

    public RentalAgreement(String toolCode, int rentalDays, int discount, String date){
        tool = Tool.valueOf(toolCode);
        this.rentalDays = rentalDays;
        checkoutDate = setCheckoutDate(date);
        discountPercent = discount/100.0;
        dueDate = setDueDate(checkoutDate, rentalDays);
        chargeBeforeDiscount = setChargeBeforeDiscount(tool.getToolType().getToolPrice(), chargableDays);
        discountAmount = setDiscountAmount(chargeBeforeDiscount, discountPercent);
        finalCharge = setFinalCharge(chargeBeforeDiscount, discountAmount);
    }
    //subtract
    private double setFinalCharge(double chargeBeforeDiscount, double discountAmount) {
        return chargeBeforeDiscount - discountAmount;
    }

    //Multiply and cast up
    private double setDiscountAmount(double chargeBeforeDiscount, double discountPercent) {
        return chargeBeforeDiscount * discountPercent;
    }

    //Convert the string date to java object Date
    private Date setCheckoutDate(String date) {
        return null;
    }

    //calculate the price * chargable days (remember to cast into xxx.xx format rounding up)
    private double setChargeBeforeDiscount(double toolPrice, int chargableDays) {
        return toolPrice * chargableDays;
    }

    //add the amount of rental days to the checkout date
    private Date setDueDate(Date checkoutDate, int rentalDays) {
        return null;
    }

    public String toString(){
        return null;
    }
}
