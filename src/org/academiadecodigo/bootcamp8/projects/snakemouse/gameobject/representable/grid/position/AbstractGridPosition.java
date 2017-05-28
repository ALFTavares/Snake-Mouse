package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.Grid;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridDirection;
import org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx.SimpleGraphicsGrid;

/**
 * Created by codecadet on 25/05/17.
 */
public abstract class AbstractGridPosition implements GridPosition{

    private int col;
    private int row;
    private Grid grid;


    public AbstractGridPosition(int col, int row, Grid grid){
        this.col = col;
        this.row = row;
        this.grid = grid;
    }

    public AbstractGridPosition(){}


    public Grid getGrid() {
        return grid;
    }

    public void setPos(int col, int row){
        this.col = col;
        this.row = row;
        show();
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public void moveInDirection(GridDirection direction) {

        switch (direction){

            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
        }
    }

    @Override
    public boolean equals(GridPosition pos) {
        return this.col == pos.getCol() && this.row == pos.getRow();
    }

    public void moveUp(){
        if(getRow() == 0){
            setPos(getCol(), grid.getRows());
        }
        setPos(getCol(),getRow() - 1);
    }

    public void moveDown(){
        if(getRow() == grid.getRows()){
            setPos(getCol(), 0);
        }
        setPos(getCol(), getRow() + 1);
    }

    public void moveLeft(){
        if(getCol() == 0){
            setPos(grid.getCols(), getRow());
        }
        setPos(getCol() - 1, getRow());
    }

    public void moveRight(){
        if(getCol() == grid.getCols()){
            setPos(0, getRow());
        }
        setPos(getCol() + 1, getRow());
    }

    @Override
    public String toString() {
        return "GridPosition{" +
                "col=" + col +
                ", row=" + row +
                '}';
    }
}
