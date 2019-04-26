package com.epam.pool.task10_memento;

public class Runner {
    public static void main(String[] args) {
        XOGame game = new XOGame();
        game.setCell('o', 0,0);
        game.setCell('x', 1,1);
        game.setCell('o', 2,2);
        System.out.println(game);

        XOGameSnapshot snapshot = game.saveState();

        game.setCell('o', 0,1);
        game.setCell('x', 2,1);
        System.out.println(game);

        game.restoreState(snapshot);
        System.out.println(game);
    }
}
