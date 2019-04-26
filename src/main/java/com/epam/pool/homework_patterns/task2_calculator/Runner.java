package com.epam.pool.homework_patterns.task2_calculator;

import java.util.Scanner;

import static com.epam.pool.homework_patterns.task2_calculator.logic.ExpressionTreeBuilder.convertStringToExpression;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Please enter expression type of (x+y)*z+u*(v+w) and press \"Enter\"");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        System.out.printf("result is : %s%n", convertStringToExpression(expression).calculate());
    }
}
