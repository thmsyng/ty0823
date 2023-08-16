package com.thmsyng.utils;

import com.thmsyng.constants.Tool;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.math.NumberUtils;

public final class UserInputValidator {
    private UserInputValidator(){

    }

    public static boolean isOneCharacter(String input){
        return input.length() == 1;
    }

    public static boolean isYorN(String input){
        return isYes(input) || isNo(input);
    }

    public static boolean isYes(String input){
        return input.charAt(0) == 'Y';
    }

    public static boolean isNo(String input){
        return input.charAt(0) == 'N';
    }

    public static boolean isValidToolCode(String toolCode){
        return EnumUtils.isValidEnum(Tool.class, toolCode);
    }

    public static boolean isValidDayCount(String dayCount){
        return NumberUtils.isDigits(dayCount) && Integer.parseInt(dayCount) > 0;
    }

    public static boolean isValidDiscount(String discount){
        return NumberUtils.isDigits(discount) && (0 <= Integer.parseInt(discount) && Integer.parseInt(discount) <= 100);
    }

    public static boolean isValidDate(String date){
        return date.matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{2}$");
    }
}
