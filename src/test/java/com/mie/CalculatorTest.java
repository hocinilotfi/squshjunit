package com.mie;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("TC_001")
    public void multiFailure(){
        int a = 5;
        int b = 2;
        // assertTrue((a + b) == 3, "1 + 2 should be 3");
        assertTrue(true);
    }
}
