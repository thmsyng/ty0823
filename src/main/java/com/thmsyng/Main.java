package com.thmsyng;

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

        String input;
        boolean checkout = true;
        while(checkout){
            System.out.println("Would you like to start a checkout? (Y or N): ");
            input = scan.next().toUpperCase();
            while(!isOneCharacter(input) || !isYorN(input)){
                System.out.println("The input is not valid, would you like to checkout? (Y or N): ");
                input = scan.next().toUpperCase();
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
                while(!isValidDayCount(input)){
                    System.out.println("This is not a valid day count, please retry: ");
                    input = scan.next();
                }
                dayCount = Integer.parseInt(input);

                System.out.println("What is the discount percentage (0-100)?");
                input = scan.next();
                while(!isValidDiscount(input)){
                    System.out.println("This is not a valid discount (0-100), please retry: ");
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

                //Add in a service that calls a checkout function here
                checkout(toolCode, dayCount, discount, date);
            }
            else{
                checkout = false;
            }
        }
        scan.close();
        System.out.println("Finished program");
    }
}