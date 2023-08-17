package com.thmsyng.constants;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ToolConstantsTest {
    Tool chainsaw;
    Tool ladder;
    Tool jackhammerD;
    Tool jackhammerR;
    @BeforeEach
    void setUp(){
        chainsaw = Tool.CHNS;
        ladder = Tool.LADW;
        jackhammerD = Tool.JAKD;
        jackhammerR = Tool.JAKR;
    }

}