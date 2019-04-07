package com.epam.pool.task6_strategy.characters.move;

public class FlyingAndWalking implements Movable {
    @Override
    public String getMoveType() {
        return "is walking and flying.";
    }
}
