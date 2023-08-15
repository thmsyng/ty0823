package com.thmsyng.constants;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ToolConstantsTest {
    ToolConstants chainsaw;
    ToolConstants ladder;
    ToolConstants jackhammerD;
    ToolConstants jackhammerR;
    @BeforeEach
    void setUp(){
        chainsaw = ToolConstants.CHNS;
        ladder = ToolConstants.LADW;
        jackhammerD = ToolConstants.JAKD;
        jackhammerR = ToolConstants.JAKR;
    }

    @Test
    void chainsawCodeTestPositive(){
        assertEquals(chainsaw.getToolCode(), ("CHNS"));
    }

    @Test
    void chainsawCodeTestNegative(){
        assertNotEquals(chainsaw.getToolCode(), ("LADW"));
    }
}