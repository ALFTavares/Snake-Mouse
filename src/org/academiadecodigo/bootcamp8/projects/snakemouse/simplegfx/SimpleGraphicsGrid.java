package org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.Grid;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


/**
 * Created by codecadet on 26/05/17.
 */
public class SimpleGraphicsGrid /*extends GameObject*/ implements Grid {

    public static final int PADDING = 10;

    private int cols;
    private int rows;
    private int cellSize = 24;
    private Rectangle grid;
    private Picture pic;

    public SimpleGraphicsGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;

        pic = new Picture(0, 0, "img/bg.png");
        this.grid = new Rectangle(PADDING, PADDING, getWidth(), getHeight());
    }

    public void init() {
        grid.draw();
        pic.draw();
    }

    @Override
    public int getCols() {
        return cols;
    }

    @Override
    public int getRows() {
        return rows;
    }

    public int getWidth(){
        return cols * getCellSize();
    }

    public int getHeight(){
        return rows * getCellSize();
    }

    public int getX(){
        return grid.getX();
    }

    public int getY(){
        return grid.getY();
    }

    public int getCellSize() {
        return cellSize;
    }

    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGraphicsGridPosition(this);
    }

    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGraphicsGridPosition(col, row, this);
    }

    public int rowToY(int row){
        return row * cellSize + PADDING;
    }

    public int columnToX(int column){
        return column * cellSize + PADDING;
    }
}
