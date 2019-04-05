package com.epam.pool.homework_patterns.task2_calculator.logic;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidationUtilTest {

    @Test
    public void shouldReturnTrueOnValidExpression() {
        String validExpression = "(1+2)*3+4*(5+6)";
        assertTrue(ValidationUtil.ValidateExpression(validExpression));
    }

    @Test
    public void shouldReturnFalseOnInvalidExpression() {
        String invalidExpression = "(1-2)*3+4*(5+6)";
        assertFalse(ValidationUtil.ValidateExpression(invalidExpression));
    }
}