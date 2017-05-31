package org.academiadecodigo.bootcamp.newmousesnake.Grid;


import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.SimplegfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 30/05/17.
 */
public class SimplegfxGrid implements Grid {

    private int cols;
    private int rows;
    public static final int PADDING = 20;
    public static final int CELLSIZE = 24;
    private Rectangle grid;
    private Picture picture;

    public SimplegfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        grid = new Rectangle(PADDING, PADDING,cols * CELLSIZE,rows * CELLSIZE);
        picture = new Picture(0,0,"img/bg.png");
        init();
    }

    @Override
    public void init() {
        grid.draw();
        picture.draw();

    }

    @Override // creates a random SimplegfxGridPosition
    public GridPosition makeGridPosition() {
        return new SimplegfxGridPosition(this);
    }

    @Override
    public SimplegfxGridPosition makeGridPosition(int col, int row) {

        return new SimplegfxGridPosition(col,row,this);
    }


    public int getCellsize() {
        return CELLSIZE;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int rowToY(int row) {
        return PADDING + CELLSIZE * row;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        return PADDING + CELLSIZE * column;
    }

}
