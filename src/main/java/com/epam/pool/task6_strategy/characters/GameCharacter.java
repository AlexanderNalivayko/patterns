package com.epam.pool.task6_strategy.characters;

import com.epam.pool.task6_strategy.characters.move.Movable;

public class GameCharacter implements Character {

    private String name;
    private CharacterType characterType;
    private Movable move;

    public GameCharacter(String name, CharacterType characterType, Movable move) {
        this.name = name;
        this.characterType = characterType;
        this.move = move;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CharacterType getType() {
        return characterType;
    }

    @Override
    public void setMove(Movable move) {
        this.move = move;
    }

    @Override
    public void move() {
        System.out.println(name + " " + move.getMoveType());
    }
}
