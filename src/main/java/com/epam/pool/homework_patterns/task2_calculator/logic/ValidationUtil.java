package com.epam.pool.homework_patterns.task2_calculator.logic;

public class ValidationUtil {

    private static final String EXPRESSION_REGEX = "\\(\\d+\\+\\d+\\)\\*\\d+\\+\\d+\\*\\(\\d+\\+\\d+\\)";

    public ValidationUtil() {
    }

    public static boolean ValidateExpression(String expression) {
        expression = expression.replace(" ", "");
        if (expression.isEmpty()) {
            return false;
        }
        if (!expression.matches(EXPRESSION_REGEX)) {
            return false;
        }
        return true;
    }
}
