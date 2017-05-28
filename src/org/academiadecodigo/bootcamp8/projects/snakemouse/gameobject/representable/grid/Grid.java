package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;

/**
 * Created by codecadet on 25/05/17.
 */
public interface Grid {

    void init();

    int getCols();

    int getRows();

    GridPosition makeGridPosition();

    GridPosition makeGridPosition(int col, int row);

}
