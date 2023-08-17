package com.thmsyng;

import com.thmsyng.rentalservice.RentalAgreement;
import com.thmsyng.rentalservice.exceptions.DayException;
import com.thmsyng.rentalservice.exceptions.DiscountException;

import java.util.Scanner;

import static com.thmsyng.rentalservice.RentalService.checkout;
import static com.thmsyng.utils.UserInputValidator.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String toolCode;
        int dayCount;
        int discount;
        String date;

        RentalAgreement agreement = null;

        String input;
        boolean checkout = true;
        while(checkout){
            System.out.println("Would you like to start a checkout? (Y or N): ");
            input = scan.next();
            while(!isOneCharacter(input) || !isYorN(input)){
                System.out.println("The input is not valid, would you like to checkout? (Y or N): ");
                input = scan.next();
            }
            if(isYes(input)){
                System.out.println("What is the tool code?");
                input = scan.next().toUpperCase();
                while(!isValidToolCode(input)){
                    System.out.println("This is not a valid tool code, please retry: ");
                    input = scan.next().toUpperCase();
                }
                toolCode = input;

                System.out.println("What is the rental day count (1+)?");
                input = scan.next();
                while(!isValidNumber(input)){
                    System.out.println("This is not a valid number, please retry: ");
                    input = scan.next();
                }
                dayCount = Integer.parseInt(input);

                System.out.println("What is the discount percentage (0-100)?");
                input = scan.next();
                while(!isValidNumber(input)){
                    System.out.println("This is not a valid number, please retry: ");
                    input = scan.next();
                }
                discount = Integer.parseInt(input);

                System.out.println("What is the checkout date? (\"mm/dd/yy\")");
                input = scan.next();
                while(!isValidDate(input)){
                    System.out.println("This is not a valid date, please retry: ");
                    input = scan.next();
                }
                date = input;
                try{
                    agreement = checkout(toolCode, dayCount, discount, date);
                }
                catch(DayException | DiscountException e){
                    System.out.println("Input error, try checking out again: " + e.getMessage());
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }

                System.out.println(agreement);
            }
            else{
                checkout = false;
            }
        }
        scan.close();
        System.out.println("Finished program");
    }
}