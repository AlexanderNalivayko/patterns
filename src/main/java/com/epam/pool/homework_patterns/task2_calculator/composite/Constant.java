package com.epam.pool.homework_patterns.task2_calculator.composite;

public class Constant implements Expression {

    private int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public int calculate() {
        return value;
    }
}
