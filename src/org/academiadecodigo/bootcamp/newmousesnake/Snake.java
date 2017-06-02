package org.academiadecodigo.bootcamp.newmousesnake;

/**
 * Created by joelalmeida on 31/05/17.
 */

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridDirection;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 30/05/17.
 */
public class Snake {

    private MouseKeyboard mouseKeyboard;
    private GridDirection direction;
    private GridPosition position;

    private GridPosition lastPosition;
    private GridDirection lastDirection;

    private Picture picLeft;
    private Picture picRight;
    private Picture picUp;
    private Picture picDown;

    private boolean isDead = false;

    public Snake(GridPosition gridPosition) {
        this.position = gridPosition;
        this.direction = GridDirection.RIGHT;
        this.lastDirection = direction;

        mouseKeyboard = new MouseKeyboard(this);

        picLeft = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING, position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/snakeHeadLeft.png");
        picRight = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING, position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/snakeHeadRight.png");
        picUp = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING, position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/snakeHeadUp.png");
        picDown = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING, position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/snakeHeadDown.png");
        picRight.draw();
       // picRight.grow(10,10);


    }

    public GridDirection getDirection() {
        return this.direction;
    }

    public GridPosition getPosition() {
        return this.position;
    }

    public void setPosition(GridPosition position){
        this.position =  position;
    }


    //END OF SNAKE BODY CONTROL


    public void die(){
        this.isDead = true;
        System.out.println("SNAKE IS DEAD");
        picUp.delete();
        picRight.delete();
        picLeft.delete();
        picDown.delete();

    }

    public boolean isDead() {
        return isDead;
    }

    public void move(GridDirection dir) {

        lastPosition = position;
        lastDirection = this.direction;

        switch (dir) {

            case LEFT: //LEFT


                if (position.getCol() < 1) {
                    this.position.setPos(23, position.getRow());

                    picLeft.translate(SimplegfxGrid.CELLSIZE * 23, 0);
                    picRight.translate(SimplegfxGrid.CELLSIZE * 23, 0);
                    picUp.translate(SimplegfxGrid.CELLSIZE * 23, 0);
                    picDown.translate(SimplegfxGrid.CELLSIZE * 23, 0);
                }

                picLeft.translate(-SimplegfxGrid.CELLSIZE, 0);
                picRight.translate(-SimplegfxGrid.CELLSIZE, 0);
                picUp.translate(-SimplegfxGrid.CELLSIZE, 0);
                picDown.translate(-SimplegfxGrid.CELLSIZE, 0);

                position.setPos(position.getCol() - 1, position.getRow());

                picLeft.draw();
                picRight.delete();
                picUp.delete();
                picDown.delete();

                break;

            case UP: //UP


                if (lastDirection == GridDirection.DOWN) {
                    break;
                }

                if (position.getRow() < 1) {
                    this.position.setPos(position.getCol(), 23);

                    picLeft.translate(0, SimplegfxGrid.CELLSIZE * 23);
                    picRight.translate(0, SimplegfxGrid.CELLSIZE * 23);
                    picUp.translate(0, SimplegfxGrid.CELLSIZE * 23);
                    picDown.translate(0, SimplegfxGrid.CELLSIZE * 23);
                }

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


                if (lastDirection == GridDirection.UP) {
                    break;
                }

                if (position.getRow() > 22) {
                    this.position.setPos(position.getCol(), 0);

                    picLeft.translate(0, -SimplegfxGrid.CELLSIZE * 23);
                    picRight.translate(0, -SimplegfxGrid.CELLSIZE * 23);
                    picUp.translate(0, -SimplegfxGrid.CELLSIZE * 23);
                    picDown.translate(0, -SimplegfxGrid.CELLSIZE * 23);
                }

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


                if (lastDirection == GridDirection.LEFT) {
                    break;
                }

                if (position.getCol() > 22) {
                    this.position.setPos(0, position.getRow());

                    picLeft.translate(-SimplegfxGrid.CELLSIZE * 23, 0);
                    picRight.translate(-SimplegfxGrid.CELLSIZE * 23, 0);
                    picUp.translate(-SimplegfxGrid.CELLSIZE * 23, 0);
                    picDown.translate(-SimplegfxGrid.CELLSIZE * 23, 0);
                }

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
                System.out.println("shit snake");
        }
    }

    public class MouseKeyboard implements KeyboardHandler {

        Keyboard k;

        private MouseKeyboard(Snake snake) {
            k = new Keyboard(this);

            KeyboardEvent event5 = new KeyboardEvent();
            event5.setKey(KeyboardEvent.KEY_LEFT);
            event5.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event5);

            KeyboardEvent event6 = new KeyboardEvent();
            event6.setKey(KeyboardEvent.KEY_RIGHT);
            event6.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event6);

            KeyboardEvent event7 = new KeyboardEvent();
            event7.setKey(KeyboardEvent.KEY_UP);
            event7.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event7);

            KeyboardEvent event8 = new KeyboardEvent();
            event8.setKey(KeyboardEvent.KEY_DOWN);
            event8.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event8);
        }

        //MOUSE
        @Override
        public void keyPressed(KeyboardEvent keyboardEvent) {

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
                // System.out.println("key UP");
                if(lastDirection != GridDirection.DOWN) {
                    direction = GridDirection.UP;
                }
            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
                // System.out.println("key DOWN");
                if(lastDirection != GridDirection.UP) {
                    direction = GridDirection.DOWN;
                }
            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
                // System.out.println("key LEFT");
                if(lastDirection != GridDirection.RIGHT) {
                    direction = GridDirection.LEFT;
                }
            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
                // System.out.println("key RIGHT");
                if(lastDirection != GridDirection.LEFT) {
                    direction = GridDirection.RIGHT;
                }
            }
        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {

        }
    }
}
