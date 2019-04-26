package com.epam.pool.task6_strategy;

import com.epam.pool.task6_strategy.characters.Character;
import com.epam.pool.task6_strategy.characters.move.Movable;

import java.util.ArrayList;
import java.util.Arrays;

public class StandardSquad implements Squad {

    private ArrayList<Character> characters = new ArrayList<>();
    Movable move;

    public StandardSquad(Movable move, Character... characters) {
        this.move = move;
        this.characters.addAll(Arrays.asList(characters));
    }

    @Override
    public void addCharacter(Character character) {
        characters.add(character);
    }

    @Override
    public void deleteCharacter(Character character) {
        characters.remove(character);
    }

    @Override
    public void move() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : characters) {
            stringBuilder.append(character.getName()).append(" ");
        }
        stringBuilder.append(move.getMoveType());
        System.out.println(stringBuilder.toString());
    }
}
