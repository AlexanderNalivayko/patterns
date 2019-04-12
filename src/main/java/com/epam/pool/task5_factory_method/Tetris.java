package com.epam.pool.task5_factory_method;

import com.epam.pool.task5_factory_method.creator.*;

public class Tetris {

    public static void main(String[] args) {
        startPlaying(100, 0.1);
    }

    /**
     * Why not a factory ?
     *
     * This method is already like flyweight BUT ...
     * it prints random figures from arrays instead of
     * making same thing with "case"/"if else".
     *
     * This approach gives us more flexibility, cause we don't need
     * to write or erase new case's or 'if's , we simply can write
     * or erase new FigureCreator to array.
     *
     * benefits (compare to simple flyweight):
     *
     * 1) 1 line of code instead of 2-3 when adding creators.
     * 2) don't need to fix 'random-logic' part after adding, or erasing creators
     */
    private static void startPlaying(int figuresCount, double superFigureChance) {

        FigureCreator[] normalFigureCreators = {
                new IFigureCreator(),
                new LFigureCreator(),
                new SFigureCreator(),
                new TFigureCreator(),
                new ZFigureCreator()
        };

        FigureCreator[] superFigureCreators = {
                new SuperIFigureCreator(),
                new SuperLFigureCreator(),
                new SuperSFigureCreator(),
                new SuperTFigureCreator(),
                new SuperZFigureCreator()
        };

        FigureCreator[] currentlyUsingFigures;


        for (int i = 0; i < figuresCount; i++) {
            currentlyUsingFigures = Math.random() < superFigureChance ? superFigureCreators : normalFigureCreators;
            int randomNumber = (int) (Math.random() * currentlyUsingFigures.length - 1);
            System.out.println("drawing: " + currentlyUsingFigures[randomNumber].createFigure().getName());
        }
    }
}
