package com.epam.pool.task6_strategy.characters;

import com.epam.pool.task6_strategy.characters.move.Movable;

public interface Character {

    public String getName();

    public CharacterType getType();

    public void setMove(Movable move);

    public void move();

}
