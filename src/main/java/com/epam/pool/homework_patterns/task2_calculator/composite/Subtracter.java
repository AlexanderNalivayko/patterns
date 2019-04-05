package com.epam.pool.homework_patterns.task2_calculator.composite;

public class Subtracter extends BinaryExpression {

    public Subtracter(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        return left.calculate() - right.calculate();
    }
}
