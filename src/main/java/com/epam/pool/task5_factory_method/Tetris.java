package com.epam.pool.task5_factory_method;

import com.epam.pool.task5_factory_method.creator.*;

public class Tetris {

    public static void main(String[] args) {
        startPlaying(100, 0.1);
    }


    private static void startPlaying(int figuresNumber, double superFigureChance) {
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

        for (int i = 0; i < figuresNumber; i++) {
            currentlyUsingFigures = Math.random() < superFigureChance ? superFigureCreators : normalFigureCreators;
            int randomNumber = (int) (Math.random() * currentlyUsingFigures.length - 1);
            System.out.println("drawing: " + currentlyUsingFigures[randomNumber].createFigure().getName());
        }
    }
}
