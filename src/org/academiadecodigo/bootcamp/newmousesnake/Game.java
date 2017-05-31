package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridDirection;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;

/**
 * Created by codecadet on 30/05/17.
 */
public class Game {

    private SimplegfxGrid grid;
    private Mouse mouse;
    private int delay;

    public Game(int delay) {
        grid = new SimplegfxGrid(24, 24);
        mouse = new Mouse(grid.makeGridPosition(20, 24),grid);
        this.delay = delay;
    }

    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            mouse.moveInDirection(GridDirection.UP,1 );

        }
    }

    public void moveAll() {

    }
}
