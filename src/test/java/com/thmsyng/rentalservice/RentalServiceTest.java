package com.thmsyng.rentalservice;

import com.thmsyng.rentalservice.exceptions.DayException;
import com.thmsyng.rentalservice.exceptions.DiscountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.thmsyng.rentalservice.RentalService.checkout;
import static org.junit.jupiter.api.Assertions.*;

class RentalServiceTest {
    private String toolCode;
    private int rentalDays;
    private int discount;
    private String date;
    @Test
    void checkoutScenario1ADiscountException() {
        toolCode = "JAKR";
        rentalDays = 5;
        discount = 101;
        date = "09/03/15";
        assertThrows(DiscountException.class, () -> checkout(toolCode, rentalDays, discount, date));
    }
    @Test
    void checkoutScenario1BDiscountException() {
        toolCode = "JAKR";
        rentalDays = 5;
        discount = -1;
        date = "09/03/15";
        assertThrows(DiscountException.class, () -> checkout(toolCode, rentalDays, discount, date));
    }
    @Test
    void checkoutScenario1CDayException() {
        toolCode = "JAKR";
        rentalDays = 0;
        discount = 101;
        date = "09/03/15";
        assertThrows(DayException.class, () -> checkout(toolCode, rentalDays, discount, date));
    }
    @Test
    void checkoutScenario2() throws DayException, DiscountException {
        toolCode = "LADW";
        rentalDays = 3;
        discount = 10;
        date = "07/02/20";
        assertNotNull(checkout(toolCode, rentalDays, discount, date));
    }
    @Test
    void checkoutScenario3() throws DayException, DiscountException {
        toolCode = "CHNS";
        rentalDays = 5;
        discount = 25;
        date = "07/02/15";
        assertNotNull(checkout(toolCode, rentalDays, discount, date));
    }
    @Test
    void checkoutScenario4() throws DayException, DiscountException {
        toolCode = "JAKD";
        rentalDays = 6;
        discount = 0;
        date = "09/03/15";
        assertNotNull(checkout(toolCode, rentalDays, discount, date));
    }
    @Test
    void checkoutScenario5() throws DayException, DiscountException {
        toolCode = "JAKR";
        rentalDays = 9;
        discount = 0;
        date = "07/02/15";
        assertNotNull(checkout(toolCode, rentalDays, discount, date));
    }
    @Test
    void checkoutScenario6() throws DayException, DiscountException {
        toolCode = "JAKR";
        rentalDays = 4;
        discount = 50;
        date = "07/02/20";
        assertNotNull(checkout(toolCode, rentalDays, discount, date));
    }
}