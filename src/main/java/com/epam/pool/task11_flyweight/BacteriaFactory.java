package com.epam.pool.task11_flyweight;

import java.util.HashMap;

public class BacteriaFactory {
    private HashMap<StreptococcusType, Bacteria> characters = new HashMap<>();

    public Bacteria getBacteria(StreptococcusType streptococcusType){
        Bacteria character = characters.get(streptococcusType);
        if (character == null){
            switch (streptococcusType){
                case A: {
                    character = new StreptococcusA();
                    break;
                }
                case B : {
                    character = new StreptococcusB();
                    break;
                }
                case C : {
                    character = new StreptococcusC();
                    break;
                }
            }
            characters.put(streptococcusType, character);
        }
        return character;
    }
}
