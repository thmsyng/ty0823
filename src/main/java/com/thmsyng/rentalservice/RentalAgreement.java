package com.thmsyng.rentalservice;

import com.thmsyng.constants.Tool;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.*;

import static com.thmsyng.utils.DateUtil.*;

public class RentalAgreement {
    private Tool tool;
    private int rentalDays;
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private int chargableDays;
    private double chargeBeforeDiscount;
    private double discountPercent;
    private double discountAmount;
    private double finalCharge;

    public RentalAgreement(String toolCode, int rentalDays, int discount, String date){
        tool = Tool.valueOf(toolCode);
        this.rentalDays = rentalDays;
        checkoutDate = convertToDate(date);
        discountPercent = discount/100.0;
        dueDate = getDueDate(checkoutDate, rentalDays);
        chargableDays = setChargableDays(tool, checkoutDate, dueDate, rentalDays);
        chargeBeforeDiscount = setChargeBeforeDiscount(tool, chargableDays);
        discountAmount = setDiscountAmount(chargeBeforeDiscount, discountPercent);
        finalCharge = setFinalCharge(chargeBeforeDiscount, discountAmount);
    }

    private int setChargableDays(Tool tool, LocalDate checkoutDate, LocalDate dueDate, int rentalDays) {
        int days = rentalDays;
        if(!tool.getToolType().hasWeekendCharge()){
            //check if the dates have any weekends in between
            days -= weekendsInBetween(checkoutDate, dueDate);
        }
        if(!tool.getToolType().hasHolidayCharge()){
            //check if the dates have any holidays in between
            days -= holidaysInBetween(checkoutDate, dueDate);
        }
        return days;
    }

    private double setFinalCharge(double chargeBeforeDiscount, double discountAmount) {
        return chargeBeforeDiscount - discountAmount;
    }

    //Multiply and cast up
    private double setDiscountAmount(double chargeBeforeDiscount, double discountPercent) {
        double amt = (chargeBeforeDiscount * discountPercent);

        return Math.round(amt * 100.0)/100.0;
    }

    private double setChargeBeforeDiscount(Tool tool, int chargableDays) {
        return tool.getToolType().getToolPrice() * chargableDays;
    }

    public String toString(){
        String print = "\n\n\n----- Rental Agreement -----"
                + "\nTool code: " + tool.name()
                + "\nTool type: " + tool.getToolType().name()
                + "\nTool brand: " + tool.getToolBrand()
                + "\nRental days: " + rentalDays
                + "\nCheckout date: " + checkoutDate
                + "\nDue date: " + dueDate
                + "\nDaily rental charge: " + tool.getToolType().getToolPrice()
                + "\nCharge days: " + chargableDays
                + "\nPre-discount charge: " + chargeBeforeDiscount
                + "\nDiscount percent: " + discountPercent
                + "\nDiscount amount: " + discountAmount
                + "\nFinal charge: " + finalCharge
                + "\n\n\n";
        return print;
    }
}
