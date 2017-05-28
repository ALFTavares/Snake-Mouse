package org.academiadecodigo.bootcamp8.projects.snakemouse.display;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.Representable;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 25/05/17.
 */
public class SplashScreen implements Representable {

    private Picture pic;

    public SplashScreen() {
        pic = new Picture(0,0, "img/splash.png");
    }

    @Override
    public int getXpos() {
        return 0;
    }

    @Override
    public int getYpos() {
        return 0;
    }

    @Override
    public void show() {

        pic.draw();
    }

    @Override
    public void hide() {

        pic.delete();
    }
}
