package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;

/**
 * Created by codecadet on 25/05/17.
 */
public interface Grid {

    public void init();

    public int getCols();

    public int getRows();

    public GridPosition makeGridPosition();

    public GridPosition makeGridPosition(int col, int row);

}
