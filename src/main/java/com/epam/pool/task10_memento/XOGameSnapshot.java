package com.epam.pool.task10_memento;

public class XOGameSnapshot {

    private char[][] grid;


    public XOGameSnapshot(char[][] grid) {
        this.grid = grid;
    }

    public char[][] getGrid() {
        return grid;
    }
}
