package com.epam.pool.homework_patterns.task2_calculator.composite;

public class Multiplier extends BinaryExpression {

    public Multiplier(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        return left.calculate() * right.calculate();
    }
}