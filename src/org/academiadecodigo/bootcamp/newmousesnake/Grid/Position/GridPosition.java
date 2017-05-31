package org.academiadecodigo.bootcamp.newmousesnake.Grid.Position;

/**
 * Created by codecadet on 30/05/17.
 */
public interface GridPosition { // a position on the grid that is capable of moving around

    int getCol(); // returns the column of the position on the grid

    int getRow(); // returns the row of the position on the grid

    void setPos(int col, int row); // gives the position a new column and a new row on the grid

    void show(); // shows the position on the grid

    void hide(); // hides the position on the grid



    boolean equals(GridPosition gridPosition); // checks if THIS position is equal to the position given

    int getCellsize();
}
