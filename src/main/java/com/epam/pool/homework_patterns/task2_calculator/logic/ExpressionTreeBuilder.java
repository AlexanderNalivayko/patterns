package com.epam.pool.homework_patterns.task2_calculator.logic;

import com.epam.pool.homework_patterns.task2_calculator.composite.Adder;
import com.epam.pool.homework_patterns.task2_calculator.composite.Constant;
import com.epam.pool.homework_patterns.task2_calculator.composite.Expression;
import com.epam.pool.homework_patterns.task2_calculator.composite.Multiplier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionTreeBuilder {

    private static final String DIGITS_REGEX = "\\d+";

    public static Expression convertStringToExpression(String expression) {
        expression = expression.replace(" ", "");
        Integer[] digits = separateDataByRegex(expression, DIGITS_REGEX);
        return buildTree(digits);
    }

    private static Integer[] separateDataByRegex(String expression, String regex) {
        Integer[] digits = new Integer[6];
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);
        int i = 0;
        while (matcher.find()) {
            digits[i++] = Integer.parseInt(matcher.group());
        }
        return digits;
    }

    private static Expression buildTree(Integer[] digits) {
        return new Adder(
                new Multiplier(
                        new Adder(
                                new Constant(digits[0]),
                                new Constant(digits[1])
                        ),
                        new Constant(digits[2])
                ),
                new Multiplier(
                        new Constant(digits[3]),
                        new Adder(
                                new Constant(digits[4]),
                                new Constant(digits[5])
                        )
                )
        );
    }
}
