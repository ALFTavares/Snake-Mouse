package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
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
    private Picture picture;
    private GridDirection direction;
    private GridPosition position;


    private Picture picLeft;
    private Picture picRight;
    private Picture picUp;
    private Picture picDown;


    public Mouse(GridPosition gridPosition) {
        this.position = gridPosition;
        mouseKeyboard = new MouseKeyboard();


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


    public void move(int dir) {
        // this.direction = direction;

        switch (dir) {
            case 65: //LEFT

                picLeft.translate(-SimplegfxGrid.CELLSIZE, 0);
                picRight.translate(-SimplegfxGrid.CELLSIZE, 0);
                picUp.translate(-SimplegfxGrid.CELLSIZE, 0);
                picDown.translate(-SimplegfxGrid.CELLSIZE, 0);

                picLeft.draw();
                picRight.delete();
                picUp.delete();
                picDown.delete();
                break;

            case 87: //UP

                picLeft.translate(0 ,-SimplegfxGrid.CELLSIZE);
                picRight.translate(0, -SimplegfxGrid.CELLSIZE);
                picUp.translate(0, -SimplegfxGrid.CELLSIZE);
                picDown.translate(0, -SimplegfxGrid.CELLSIZE);

                picLeft.delete();
                picRight.delete();
                picUp.draw();
                picDown.delete();
                break;

            case 83: //DOWN

                picLeft.translate(0, +SimplegfxGrid.CELLSIZE);
                picRight.translate(0, + SimplegfxGrid.CELLSIZE);
                picUp.translate(0, + SimplegfxGrid.CELLSIZE);
                picDown.translate(0, + SimplegfxGrid.CELLSIZE);

                picLeft.delete();
                picRight.delete();
                picUp.delete();
                picDown.draw();
                break;

            case 68: //RIGHT

                picLeft.translate(SimplegfxGrid.CELLSIZE, 0);
                picRight.translate(SimplegfxGrid.CELLSIZE, 0);
                picUp.translate(SimplegfxGrid.CELLSIZE, 0);
                picDown.translate(SimplegfxGrid.CELLSIZE, 0);

                picLeft.delete();
                picRight.draw();
                picUp.delete();
                picDown.delete();
                break;

            default:
                System.out.println("shit rato");


        }

    }


    private class MouseKeyboard implements KeyboardHandler {

        Keyboard k;

        private MouseKeyboard() {
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
                // direction=GridDirection.UP;

                System.out.println("W");
                move(87);


            }


            if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
                // direction = GridDirection.DOWN;
                System.out.println("S");
                move(83);


            }


            if (keyboardEvent.getKey() == KeyboardEvent.KEY_A) {
                // direction = GridDirection.LEFT;
                System.out.println("A");
                move(65);


            }


            if (keyboardEvent.getKey() == KeyboardEvent.KEY_D) {
                //  direction = GridDirection.RIGHT;
                System.out.println("D");
                move(68);


            }


        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {

        }
    }

}
