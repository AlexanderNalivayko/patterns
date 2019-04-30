package com.epam.pool.task5_factory_method.creator;

import com.epam.pool.task5_factory_method.figures.Figure;
import com.epam.pool.task5_factory_method.figures.SuperTFigure;

public class SuperTFigureCreator implements FigureCreator {

    @Override
    public Figure createFigure() {
        return new SuperTFigure();
    }
}
