package com.epam.pool.task10_memento;

public class XOGame {
    private static final String GRID_FORMAT = "\n%c|%c|%c"
            + "\n—+—+—"
            + "\n%c|%c|%c"
            + "\n—+—+—"
            + "\n%c|%c|%c";

    private char[][] grid = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    public XOGame() {
    }

    public void setCell(char c, int xPos, int yPos) {
        grid[xPos][yPos] = c;
    }

    public XOGameSnapshot saveState() {
        char[][] copy = new char[grid.length][grid[0].length];
        for (int i = 0; i < copy.length; i++) {
            System.arraycopy(grid[i], 0, copy[i], 0, copy[i].length);
        }
        return new XOGameSnapshot(copy);
    }

    public void restoreState(XOGameSnapshot snapshot) {
        grid = snapshot.getGrid();
    }

    @Override
    public String toString() {
        return String.format(GRID_FORMAT,
                grid[0][0], grid[0][1], grid[0][2],
                grid[1][0], grid[1][1], grid[1][2],
                grid[2][0], grid[2][1], grid[2][2]);
    }
}
