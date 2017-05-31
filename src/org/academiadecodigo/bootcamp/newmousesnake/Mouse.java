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

        if(direction == GridDirection.UP) {
            System.out.println("a");
            moveUp(distance);
        }
        System.out.println("n");
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
}