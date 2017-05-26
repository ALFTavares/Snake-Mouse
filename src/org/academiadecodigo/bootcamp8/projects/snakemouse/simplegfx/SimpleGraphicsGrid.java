package org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.Grid;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


/**
 * Created by codecadet on 26/05/17.
 */
public class SimpleGraphicsGrid extends GameObject implements Grid {

    private int cols;
    private int rows;
    private static final int PADDING = 10;
    private int cellSize = 24;
    private Rectangle grid;

    @Override
    public int getCols() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
    }

    @Override
    public GridPosition makeGridPosition() {
        return null;
    }

    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return null;
    }

    public SimpleGraphicsGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.grid = new Rectangle(PADDING,PADDING,cols * cellSize, rows * cellSize);
        init();
    }

    public void init() {

        grid.draw();
    }


}
