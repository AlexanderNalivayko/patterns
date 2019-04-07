package com.epam.pool.task5_factory_method.creator;

import com.epam.pool.task5_factory_method.figures.Figure;
import com.epam.pool.task5_factory_method.figures.IFigure;

public class IFigureCreator implements FigureCreator {
    @Override
    public Figure createFigure() {
        return new IFigure();
    }
}
