package com.epam.pool.task6_strategy.characters.move;

public class Flying implements Movable {
    @Override
    public String getMoveType() {
        return "is flying.";
    }
}
