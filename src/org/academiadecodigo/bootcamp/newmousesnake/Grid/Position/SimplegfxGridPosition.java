package org.academiadecodigo.bootcamp.newmousesnake.Grid.Position;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


/**
 * Created by codecadet on 30/05/17.
 */
public class SimplegfxGridPosition implements GridPosition {

    private int col;
    private int row;
    private SimplegfxGrid grid;
    private Rectangle position;

    public SimplegfxGridPosition(SimplegfxGrid grid) {
        col = (int) (Math.random() * grid.getCols());
        row = (int) (Math.random() * grid.getRows());
        this.grid = grid;
        position = new Rectangle(col * grid.getCellsize(),row * grid.getCellsize(),grid.getCellsize(),grid.getCellsize());
        show();
    }

    public SimplegfxGridPosition(int col, int row, SimplegfxGrid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
        position = new Rectangle(col * grid.getCellsize(),row * grid.getCellsize(),grid.getCellsize(), grid.getCellsize());
        show();
    }

    @Override
    public void show() {
        position.draw();
    }

    @Override
    public void hide() {
        position.delete();
    }

    @Override
    public boolean equals(GridPosition gridPosition) {
        return this.col == gridPosition.getCol() && this.row == gridPosition.getRow() ? true : false;
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public  int getRow() {
        return row;
    }

    @Override
    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
    }

    @Override
    public void moveInDirection(GridDirection gridDirection, int distance) {
        
    }

    @Override
    public int getCellsize() {
        return grid.getCellsize();
    }
}
