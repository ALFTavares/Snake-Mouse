package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;

/**
 * Created by codecadet on 30/05/17.
 */
public class Game {

    private Grid grid;
    private Mouse mouse;

    public Game() {
        grid = new SimplegfxGrid(24,24);
        mouse = new Mouse(grid.makeGridPosition(20,12));
    }
}
