package org.academiadecodigo.bootcamp.newmousesnake.Grid.Position;

/**
 * Created by codecadet on 30/05/17.
 */
public interface GridPosition { // a position on the grid that is capable of moving around

    public int getCol(); // returns the column of the position on the grid

    public int getRow(); // returns the row of the position on the grid

    public void setPos(int col, int row); // gives the position a new column and a new row on the grid

    public void show(); // shows the position on the grid

    public void hide(); // hides the position on the grid

    public void moveInDirection(GridDirection gridDirection, int distance); // moves THIS gridposition X position on the grid to a specified direction

    public boolean equals(GridPosition gridPosition); // checks if THIS position is equal to the position given

    public int getCellsize();
}
