package com.epam.pool.task5_factory_method.creator;

import com.epam.pool.task5_factory_method.figures.Figure;
import com.epam.pool.task5_factory_method.figures.SFigure;

public class SFigureCreator implements FigureCreator {

    @Override
    public Figure createFigure() {
        return new SFigure();
    }
}
