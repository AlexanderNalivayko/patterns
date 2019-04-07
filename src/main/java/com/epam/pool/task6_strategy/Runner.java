package com.epam.pool.task6_strategy;

import com.epam.pool.task6_strategy.characters.Character;
import com.epam.pool.task6_strategy.characters.CharacterType;
import com.epam.pool.task6_strategy.characters.GameCharacter;
import com.epam.pool.task6_strategy.characters.move.Flying;
import com.epam.pool.task6_strategy.characters.move.FlyingAndWalking;
import com.epam.pool.task6_strategy.characters.move.Walking;

public class Runner {

    public static void main(String[] args) {


        Character[] characters = {
                new GameCharacter("Gandalf", CharacterType.MAGICIAN, new Flying()),
                new GameCharacter("Bella", CharacterType.WARRIOR, new Walking()),
                new GameCharacter("Optimus", CharacterType.WARRIOR, new FlyingAndWalking())
        };

        //everyone moves by own way
        for (Character character : characters) {
            character.move();
        }

        //but if we gonna add all characters to one squad, they gonna fly by magic powers og gandalf :)
        Squad squad = new StandardSquad();
        for (Character character : characters) {
            squad.addCharacter(character);
        }
        squad.move();
    }
}
