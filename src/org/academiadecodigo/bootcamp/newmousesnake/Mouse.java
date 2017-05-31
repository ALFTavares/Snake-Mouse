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

<<<<<<< HEAD
    private Picture picture;
=======
    private MouseKeyboard mouseKeyboard;
>>>>>>> mouseMoveForever
    private GridDirection direction;
    private SimplegfxGridPosition position;
    private SimplegfxGrid grid;

    private Picture picLeft;
    private Picture picRight;
    private Picture picUp;
    private Picture picDown;


<<<<<<< HEAD
    public Mouse(SimplegfxGridPosition position, SimplegfxGrid grid) {
        direction = GridDirection.LEFT;
        this.position = position;
        this.grid = grid;
        picture = new Picture(position.getCol() * grid.getCellsize(), position.getRow() * grid.getCellsize(), "img/mouseLeft.png");
        picture.draw();
    }
=======
    public Mouse(GridPosition gridPosition) {
        this.position = gridPosition;
        this.direction = GridDirection.LEFT;
        mouseKeyboard = new MouseKeyboard(this);

>>>>>>> mouseMoveForever

    public GridPosition getPosition() {
        return position;
    }

    public void setPosition(int col, int row) {
       position.setCol(col);
       position.setRow(row);
    }

<<<<<<< HEAD
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
=======
    public GridDirection getDirection(){
        return this.direction;
    }


    public void move(GridDirection dir) {

        switch (dir) {
            case LEFT: //LEFT

                picLeft.translate(-SimplegfxGrid.CELLSIZE, 0);
                picRight.translate(-SimplegfxGrid.CELLSIZE, 0);
                picUp.translate(-SimplegfxGrid.CELLSIZE, 0);
                picDown.translate(-SimplegfxGrid.CELLSIZE, 0);
                position.setPos(position.getCol()- 1, position.getRow());

                picLeft.draw();
                picRight.delete();
                picUp.delete();
                picDown.delete();

                break;

            case UP: //UP

                picLeft.translate(0, -SimplegfxGrid.CELLSIZE);
                picRight.translate(0, -SimplegfxGrid.CELLSIZE);
                picUp.translate(0, -SimplegfxGrid.CELLSIZE);
                picDown.translate(0, -SimplegfxGrid.CELLSIZE);
                position.setPos(position.getCol(), position.getRow() - 1);

                picLeft.delete();
                picRight.delete();
                picUp.draw();
                picDown.delete();


                break;

            case DOWN: //DOWN

                picLeft.translate(0, +SimplegfxGrid.CELLSIZE);
                picRight.translate(0, +SimplegfxGrid.CELLSIZE);
                picUp.translate(0, +SimplegfxGrid.CELLSIZE);
                picDown.translate(0, +SimplegfxGrid.CELLSIZE);
                position.setPos(position.getCol(), position.getRow() + 1);

                picLeft.delete();
                picRight.delete();
                picUp.delete();
                picDown.draw();


                break;

            case RIGHT: //RIGHT

                picLeft.translate(SimplegfxGrid.CELLSIZE, 0);
                picRight.translate(SimplegfxGrid.CELLSIZE, 0);
                picUp.translate(SimplegfxGrid.CELLSIZE, 0);
                picDown.translate(SimplegfxGrid.CELLSIZE, 0);
                position.setPos(position.getCol() + 1, position.getRow());

                picLeft.delete();
                picRight.draw();
                picUp.delete();
                picDown.delete();


                break;

            default:
                System.out.println("shit rato");
>>>>>>> mouseMoveForever
        }
    }

    public void moveUp(int distance) {
        int initialCol = getCol();
        int initialRow = getRow();
        int maxRowsUp = Math.min(distance, position.getRow());

<<<<<<< HEAD
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
=======


    public class MouseKeyboard implements KeyboardHandler {

        Keyboard k;

        private MouseKeyboard(Mouse mouse) {
            k = new Keyboard(this);

            KeyboardEvent event1 = new KeyboardEvent();
            event1.setKey(KeyboardEvent.KEY_A);
            event1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event1);

            KeyboardEvent event2 = new KeyboardEvent();
            event2.setKey(KeyboardEvent.KEY_D);
            event2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event2);

            KeyboardEvent event3 = new KeyboardEvent();
            event3.setKey(KeyboardEvent.KEY_W);
            event3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event3);

            KeyboardEvent event4 = new KeyboardEvent();
            event4.setKey(KeyboardEvent.KEY_S);
            event4.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event4);


        }

        //MOUSE


        @Override
        public void keyPressed(KeyboardEvent keyboardEvent) {

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_W) {
                System.out.println("W");
                direction = GridDirection.UP;

            }


            if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
                System.out.println("S");
                direction = GridDirection.DOWN;
>>>>>>> mouseMoveForever

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

<<<<<<< HEAD
        int initialCol = getCol();
        int initialRow = getRow();
        System.out.println(position.getCol());
        int maxRowsRight = 1; //Math.min(grid.getCols() - (position.getCol()), distance);
        System.out.println(position.getCol());
=======
            if (keyboardEvent.getKey() == KeyboardEvent.KEY_A) {
                System.out.println("A");
                direction = GridDirection.LEFT;
>>>>>>> mouseMoveForever

        if(position.getCol() == 24) {
            setPosition(0,position.getRow());
        } else {
            setPosition(position.getCol() + maxRowsRight, position.getRow());
        }

        System.out.println(position.getCol());

        int dx = grid.columnToX(position.getCol()) - grid.columnToX(initialCol);
        int dy = grid.rowToY(position.getRow()) - grid.rowToY(initialRow);
        picture.translate(dx, dy);

<<<<<<< HEAD
        System.out.println(position.getCol());
    }
=======
            if (keyboardEvent.getKey() == KeyboardEvent.KEY_D) {
                System.out.println("D");
                direction = GridDirection.RIGHT;
>>>>>>> mouseMoveForever

    private void moveLeft(int distance) {

        int initialCol = getCol();
        int initialRow = getRow();

        int maxRowsLeft = 1;//Math.min(distance, position.getCol());

        if(position.getCol() == 0) {
            setPosition(24,position.getRow());
        } else {
            setPosition(position.getCol() - maxRowsLeft, position.getRow());
        }

<<<<<<< HEAD
        int dx = grid.columnToX(position.getCol()) - grid.columnToX(initialCol);
        int dy = grid.rowToY(position.getRow()) - grid.rowToY(initialRow);
        picture.translate(dx, dy);
=======



        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {
>>>>>>> mouseMoveForever

    }
<<<<<<< HEAD
}
=======

    public GridPosition getPosition() {
        return this.position;
    }

}
>>>>>>> mouseMoveForever
