package org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;

/**
 * Created by codecadet on 25/05/17.
 */
public class SimpleGraphicsGridPosition extends AbstractGridPosition {

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public int getCellSize() {
        return 0;
    }

    @Override
    public void init() {

    }

    public int getCols() {
        return 0;
    }

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
}
