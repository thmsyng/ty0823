//package com.thmsyng.utils;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import com.thmsyng.utils.UserInputValidator.*;
//
//class UserInputValidatorTest {
//    String yesChar;
//    String noChar;
//    String oneChar;
//    String multipleChar;
//    String emptyString;
//    @BeforeAll
//    void setUp(){
//        yesChar = "y";
//        noChar = "n";
//        oneChar = "a";
//        multipleChar = "abcabcabc";
//        emptyString = "";
//    }
//    @Test
//    void isOneCharacter() {
//
//        assertTrue(UserInputValidator.isOneCharacter(oneChar));
//        assertFalse(UserInputValidator.isOneCharacter(multipleChar));
//        assertFalse(UserInputValidator.isOneCharacter(emptyString));
//    }
//
//    @Test
//    void isYorN() {
//        assertTrue(UserInputValidator.isYorN(yesChar));
//        assertTrue(UserInputValidator.isYorN(noChar));
//        assertFalse(UserInputValidator.isYorN(oneChar));
//        assertFalse(UserInputValidator.isYorN(emptyString));
//    }
//
//    @Test
//    void isYes() {
//        assertTrue(UserInputValidator.isYes(yesChar));
//        assertFalse(UserInputValidator.isYes(noChar));
//        assertFalse(UserInputValidator.isYes(oneChar));
//        assertFalse(UserInputValidator.isYes(emptyString));
//    }
//
//    @Test
//    void isNo() {
//        assertTrue(UserInputValidator.isNo(noChar));
//        assertFalse(UserInputValidator.isNo(yesChar));
//        assertFalse(UserInputValidator.isNo(oneChar));
//        assertFalse(UserInputValidator.isNo(emptyString));
//    }
//
//    @Test
//    void isValidToolCode() {
//
//    }
//
//    @Test
//    void isValidNumber() {
//    }
//
//    @Test
//    void isValidDayCount() {
//    }
//
//    @Test
//    void isValidDiscount() {
//    }
//
//    @Test
//    void isValidDate() {
//    }
//}