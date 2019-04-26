package com.epam.pool.task5_factory_method.creator;

import com.epam.pool.task5_factory_method.figures.Figure;
import com.epam.pool.task5_factory_method.figures.ZFigure;

public class ZFigureCreator implements FigureCreator {

    @Override
    public Figure createFigure() {
        return new ZFigure();
    }
}
