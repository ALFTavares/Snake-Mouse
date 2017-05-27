package org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectType;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.Grid;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


/**
 * Created by codecadet on 26/05/17.
 */
public class SimpleGraphicsGrid /*extends GameObject*/ implements Grid {

    public static final int PADDING = 10;

    private int cols;
    private int rows;
    private int cellSize = 24;
    private Rectangle grid;

    public SimpleGraphicsGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;

        this.grid = new Rectangle(PADDING,PADDING,cols * cellSize, rows * cellSize);
    }

    public void init() {
        grid.draw();
    }

    @Override
    public int getCols() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
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
