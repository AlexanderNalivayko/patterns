package com.epam.pool.task6_strategy;

import com.epam.pool.task6_strategy.characters.Character;
import com.epam.pool.task6_strategy.characters.CharacterType;
import com.epam.pool.task6_strategy.characters.GameCharacter;
import com.epam.pool.task6_strategy.characters.move.Flying;
import com.epam.pool.task6_strategy.characters.move.FlyingAndWalking;
import com.epam.pool.task6_strategy.characters.move.Walking;

public class Runner {

    public static void main(String[] args) {

        GameCharacter gandalf = new GameCharacter("Gandalf", CharacterType.MAGICIAN, new Flying());
        GameCharacter bella = new GameCharacter("Bella", CharacterType.WARRIOR, new Walking());
        GameCharacter optimus = new GameCharacter("Optimus", CharacterType.WARRIOR, new FlyingAndWalking());

        gandalf.move();
        bella.move();
        optimus.move();

        Squad squad = new StandardSquad(new Flying(), gandalf, bella, optimus);
        squad.move();
    }
}
