package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridDirection;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.SimplegfxGridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 30/05/17.
 */
public class Mouse {

    private Picture picture;
    private GridDirection direction;
    private SimplegfxGridPosition position;
    private SimplegfxGrid grid;

    private Picture picLeft;
    private Picture picRight;
    private Picture picUp;
    private Picture picDown;


    public Mouse(SimplegfxGridPosition position, SimplegfxGrid grid) {
        direction = GridDirection.LEFT;
        this.position = position;
        this.grid = grid;
        picture = new Picture(position.getCol() * grid.getCellsize(), position.getRow() * grid.getCellsize(), "img/mouseLeft.png");
        picture.draw();
    }

    public GridPosition getPosition() {
        return position;
    }

    public void setPosition(int col, int row) {
       position.setCol(col);
       position.setRow(row);
    }

    public int getCol() {
        return position.getCol();
    }

    public int getRow() {
        return position.getRow();
    }

    public void moveInDirection(GridDirection direction, int distance) {

        switch (direction) {

            case UP:
                moveUp(distance);
                break;
            case DOWN:
                moveDown(distance);
                break;
            case LEFT:
                moveLeft(distance);
                break;
            case RIGHT:
                moveRight(distance);
                break;
        }
    }

    public void moveUp(int distance) {
        int initialCol = getCol();
        int initialRow = getRow();
        int maxRowsUp = Math.min(distance, position.getRow());

        if(position.getRow() == 0) {
            setPosition(position.getCol(),grid.getRows());
        } else {
            setPosition(position.getCol(), position.getRow() - maxRowsUp);
        }

        int dx = grid.columnToX(position.getCol()) - grid.columnToX(initialCol);
        int dy = grid.rowToY(position.getRow()) - grid.rowToY(initialRow);
        picture.translate(dx, dy);
    }

    public void moveDown(int distance) {
        int initialCol = getCol();
        int initialRow = getRow();
        int maxRowsDown = Math.min(grid.getRows() - (getRow()),distance);

        if(position.getRow() == 24) {
            setPosition(position.getCol(),0);
        } else {
            setPosition(getCol(), getRow() + maxRowsDown);
        }

        int dx = grid.columnToX(position.getCol()) - grid.columnToX(initialCol);
        int dy = grid.rowToY(position.getRow()) - grid.rowToY(initialRow);
        picture.translate(dx, dy);
    }

    private void moveRight(int distance) {

        int initialCol = getCol();
        int initialRow = getRow();
        System.out.println(position.getCol());
        int maxRowsRight = 1; //Math.min(grid.getCols() - (position.getCol()), distance);
        System.out.println(position.getCol());

        if(position.getCol() == 24) {
            setPosition(0,position.getRow());
        } else {
            setPosition(position.getCol() + maxRowsRight, position.getRow());
        }

        System.out.println(position.getCol());

        int dx = grid.columnToX(position.getCol()) - grid.columnToX(initialCol);
        int dy = grid.rowToY(position.getRow()) - grid.rowToY(initialRow);
        picture.translate(dx, dy);

        System.out.println(position.getCol());
    }

    private void moveLeft(int distance) {

        int initialCol = getCol();
        int initialRow = getRow();

        int maxRowsLeft = 1;//Math.min(distance, position.getCol());

        if(position.getCol() == 0) {
            setPosition(24,position.getRow());
        } else {
            setPosition(position.getCol() - maxRowsLeft, position.getRow());
        }

        int dx = grid.columnToX(position.getCol()) - grid.columnToX(initialCol);
        int dy = grid.rowToY(position.getRow()) - grid.rowToY(initialRow);
        picture.translate(dx, dy);

    }
}