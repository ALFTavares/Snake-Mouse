package org.academiadecodigo.bootcamp.newmousesnake.Grid;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;

/**
 * Created by codecadet on 30/05/17.
 */
public interface Grid {

    public void init();

    public GridPosition makeGridPosition();

    public GridPosition makeGridPosition(int col, int row);

}
