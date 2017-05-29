package org.academiadecodigo.bootcamp8.projects.snakemouse;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridDirection;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by joelalmeida on 29/05/17.
 */
public class KeyboardClass implements KeyboardHandler{


    private Game game;
    private GridDirection direction;
    private Keyboard k = new Keyboard(this);

    public KeyboardClass(){
        keyboardStart();
    }


    public KeyboardClass(GridDirection direction){
        this.direction=direction;
        keyboardSnake();
        keyboardMouse();
    }

    public void keyboardSnake(){


        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_LEFT);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

        KeyboardEvent event2 = new KeyboardEvent();
        event2.setKey(KeyboardEvent.KEY_RIGHT);
        event2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event2);

        KeyboardEvent event3 = new KeyboardEvent();
        event3.setKey(KeyboardEvent.KEY_UP);
        event3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event3);

        KeyboardEvent event4 = new KeyboardEvent();
        event4.setKey(KeyboardEvent.KEY_DOWN);
        event4.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event4);

    }

    public void keyboardMouse(){

        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_A);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

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

    public void keyboardStart(){

        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);


    }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP || keyboardEvent.getKey() == KeyboardEvent.KEY_W){
            direction=GridDirection.UP;
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_DOWN ||  keyboardEvent.getKey() == KeyboardEvent.KEY_S){
            direction=GridDirection.DOWN;
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_LEFT ||  keyboardEvent.getKey() == KeyboardEvent.KEY_A){
            direction=GridDirection.LEFT;
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_RIGHT ||  keyboardEvent.getKey() == KeyboardEvent.KEY_D){
            direction=GridDirection.RIGHT;
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_SPACE){
            game.getSplashScreen().hide();
            game.start();
            //k.removeEventListener();

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
