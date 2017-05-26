package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridDirection;

/**
 * Created by codecadet on 26/05/17.
 */
public interface GridPosition {

    public int getCol();

    public int getRow();

    public void setPos(int col, int row);

    public void show();

    public void hide();

    public void moveInDirection(GridDirection gridDirection);
}
