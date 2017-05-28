package org.academiadecodigo.bootcamp8.projects.snakemouse;

import org.academiadecodigo.bootcamp8.projects.snakemouse.display.SplashScreen;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectsFactory;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.Grid;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by codecadet on 25/05/17.
 */
public class Game implements KeyboardHandler {

    private Grid grid;
    private GameObject food;
    private SplashScreen splashScreen;

    public void init() {

        splashScreen = new SplashScreen();
        grid = GameObjectsFactory.createGrid(24, 24);
    }

    public void enterKey() {

        Keyboard k = new Keyboard(this);
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);
    }

    @Override
    public void keyPressed(KeyboardEvent e) {
        splashScreen.hide();
        grid.init();
        food = GameObjectsFactory.createFood(grid);
        //Hud hud = new Hud();
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void start() {

        splashScreen.show();
        enterKey();
    }
}
