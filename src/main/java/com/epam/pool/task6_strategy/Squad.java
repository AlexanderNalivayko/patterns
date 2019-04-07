package com.epam.pool.task6_strategy;

import com.epam.pool.task6_strategy.characters.Character;

public interface Squad {

    public void addCharacter(Character character);

    public void deleteCharacter(Character character);

    public void move();
}
