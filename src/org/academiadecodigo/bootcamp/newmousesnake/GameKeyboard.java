package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridDirection;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by ruimorais on 02/06/17.
 */
public class GameKeyboard implements KeyboardHandler {

    private Keyboard keyboard;
    private GridDirection direction;

    public GameKeyboard() {
        keyboard = new Keyboard(this);

        KeyboardEvent event1 = new KeyboardEvent();
        event1.setKey(KeyboardEvent.KEY_A);
        event1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event1);

        KeyboardEvent event2 = new KeyboardEvent();
        event2.setKey(KeyboardEvent.KEY_D);
        event2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event2);

        KeyboardEvent event3 = new KeyboardEvent();
        event3.setKey(KeyboardEvent.KEY_W);
        event3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event3);

        KeyboardEvent event4 = new KeyboardEvent();
        event4.setKey(KeyboardEvent.KEY_S);
        event4.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event4);

        KeyboardEvent event5 = new KeyboardEvent();
        event5.setKey(KeyboardEvent.KEY_LEFT);
        event5.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event5);

        KeyboardEvent event6 = new KeyboardEvent();
        event6.setKey(KeyboardEvent.KEY_RIGHT);
        event6.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event6);

        KeyboardEvent event7 = new KeyboardEvent();
        event7.setKey(KeyboardEvent.KEY_UP);
        event7.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event7);

        KeyboardEvent event8 = new KeyboardEvent();
        event8.setKey(KeyboardEvent.KEY_DOWN);
        event8.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event8);
    }

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

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            // System.out.println("key UP");
            if(direction != GridDirection.DOWN) {
                direction = GridDirection.UP;
            }
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            // System.out.println("key DOWN");
            if(direction != GridDirection.UP) {
                direction = GridDirection.DOWN;
            }
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            // System.out.println("key LEFT");
            if(direction != GridDirection.RIGHT) {
                direction = GridDirection.LEFT;
            }
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            // System.out.println("key RIGHT");
            if(direction != GridDirection.LEFT) {
                direction = GridDirection.RIGHT;
            }
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
