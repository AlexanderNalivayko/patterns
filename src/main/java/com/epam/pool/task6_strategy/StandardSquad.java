package com.epam.pool.task6_strategy;

import com.epam.pool.task6_strategy.characters.Character;
import com.epam.pool.task6_strategy.characters.CharacterType;
import com.epam.pool.task6_strategy.characters.move.Flying;

import java.util.ArrayList;

public class StandardSquad implements Squad {

    private ArrayList<Character> characters = new ArrayList<>();

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
        boolean magsInSquad = false;
        for (Character character : characters) {
            if (CharacterType.MAGICIAN.equals(character.getType())) {
                magsInSquad = true;
            }
        }
        if (magsInSquad) {
            for (Character character : characters) {
                character.setMove(new Flying());
                character.move();
            }
        } else {
            for (Character character : characters) {
                character.move();
            }
        }
    }
}
