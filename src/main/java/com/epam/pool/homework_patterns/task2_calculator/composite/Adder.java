package com.epam.pool.homework_patterns.task2_calculator.composite;

public class Adder extends BinaryExpression {

    public Adder(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        return left.calculate() + right.calculate();
    }
}