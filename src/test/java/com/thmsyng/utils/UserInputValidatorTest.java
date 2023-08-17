package com.thmsyng.utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputValidatorTest {
    static String yesChar;
    static String noChar;
    static String oneChar;
    static String multipleChar;
    static String emptyString;
    static String validTool;
    static String validNumber;
    static String validDate;
    static String invalidDate;
    @BeforeAll
    static void setUp(){
        yesChar = "y";
        noChar = "n";
        oneChar = "a";
        multipleChar = "abcabcabc";
        emptyString = "";
        validTool = "JAKR";
        validNumber = "1";
        validDate = "01/01/01";
        invalidDate = "00/01/01";
    }
    @Test
    void isOneCharacter() {

        assertTrue(UserInputValidator.isOneCharacter(oneChar));
        assertFalse(UserInputValidator.isOneCharacter(multipleChar));
        assertFalse(UserInputValidator.isOneCharacter(emptyString));
    }

    @Test
    void isYorN() {
        assertTrue(UserInputValidator.isYorN(yesChar));
        assertTrue(UserInputValidator.isYorN(noChar));
        assertFalse(UserInputValidator.isYorN(oneChar));
    }

    @Test
    void isYes() {
        assertTrue(UserInputValidator.isYes(yesChar));
        assertFalse(UserInputValidator.isYes(noChar));
        assertFalse(UserInputValidator.isYes(oneChar));
    }

    @Test
    void isNo() {
        assertTrue(UserInputValidator.isNo(noChar));
        assertFalse(UserInputValidator.isNo(yesChar));
        assertFalse(UserInputValidator.isNo(oneChar));
    }

    @Test
    void isValidToolCode() {
        assertTrue(UserInputValidator.isValidToolCode(validTool));
        assertFalse(UserInputValidator.isValidToolCode(multipleChar));
        assertFalse(UserInputValidator.isValidToolCode(emptyString));
    }

    @Test
    void isValidNumber() {
        assertTrue(UserInputValidator.isValidNumber(validNumber));
        assertFalse(UserInputValidator.isValidNumber(multipleChar));
        assertFalse(UserInputValidator.isValidNumber(emptyString));
    }

    @Test
    void isValidDate() {
        assertTrue(UserInputValidator.isValidDate(validDate));
        assertFalse(UserInputValidator.isValidDate(invalidDate));
        assertFalse(UserInputValidator.isValidDate(emptyString));
    }
}