package org.academiadecodigo.bootcamp.newmousesnake.Grid;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;

/**
 * Created by codecadet on 30/05/17.
 */
public interface Grid {

    void init();

    GridPosition makeGridPosition();

    GridPosition makeGridPosition(int col, int row);

}
