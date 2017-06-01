package org.academiadecodigo.bootcamp.newmousesnake;

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
public class Mouse {

    private MouseKeyboard mouseKeyboard;
    private GridDirection direction;
    private GridPosition position;


    private Picture picLeft;
    private Picture picRight;
    private Picture picUp;
    private Picture picDown;


    public Mouse(GridPosition gridPosition) {
        this.position = gridPosition;
        this.direction = GridDirection.LEFT;
        mouseKeyboard = new MouseKeyboard(this);

        picLeft = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING, position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/mouseLeft.png");
        picRight = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING, position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/mouseRight.png");
        picUp = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING, position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/mouseUp.png");
        picDown = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING, position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/mouseDown.png");
        picLeft.draw();
    }

    public GridDirection getDirection() {
        return this.direction;
    }

    public void move(GridDirection dir) {

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
                System.out.println("shit rato");
        }
    }

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
            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_A) {
                System.out.println("A");
                direction = GridDirection.LEFT;
            }

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_D) {
                System.out.println("D");
                direction = GridDirection.RIGHT;
            }
        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {

        }
    }

    public GridPosition getPosition() {
        return this.position;
    }
}
