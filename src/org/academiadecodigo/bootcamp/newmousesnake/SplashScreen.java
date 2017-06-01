package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;
import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


/**
 * Created by codecadet on 30/05/17.
 */
public class SplashScreen {
    MouseKeyboard mouseKeyboard;
    public Game game;
    private boolean gameInit;

    private Picture picture;

    public SplashScreen() {

        game = new Game();
        mouseKeyboard = new MouseKeyboard();
        picture = new Picture(0, 0, "img/splash.png");
    }


    public void init() {

        picture.draw();
        while (!gameInit) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            game.init();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void delete() {

        picture.delete();
    }

    public class MouseKeyboard implements KeyboardHandler {

        Keyboard k;

        public MouseKeyboard() {
            k = new Keyboard(this);

            KeyboardEvent eventSpace = new KeyboardEvent();
            eventSpace.setKey(KeyboardEvent.KEY_SPACE);
            eventSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(eventSpace);


        }

        //MOUSE
        @Override
        public void keyPressed(KeyboardEvent keyboardEvent) {

            if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {

                picture.delete();

                gameInit = true;
            }

        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {

        }


    }


}



