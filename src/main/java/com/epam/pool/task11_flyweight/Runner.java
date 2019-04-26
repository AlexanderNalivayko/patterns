package com.epam.pool.task11_flyweight;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        BacteriaFactory bacteriaFactory = new BacteriaFactory();
        ArrayList<Bacteria> bacterias = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            bacterias.add(bacteriaFactory.getBacteria(StreptococcusType.A));
            bacterias.add(bacteriaFactory.getBacteria(StreptococcusType.B));
            bacterias.add(bacteriaFactory.getBacteria(StreptococcusType.C));
        }
        System.out.println(bacterias.get(0) == bacterias.get(72));
    }
}
