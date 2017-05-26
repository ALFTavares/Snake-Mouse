package org.academiadecodigo.bootcamp8.projects.snakemouse.display;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.Representable;

/**
 * Created by codecadet on 25/05/17.
 */
public class Hud implements Representable{

    public void showLifes(){}

    public void showTime(){}

    public void showGameOver(){}

    public void showWinner(){}

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

    }

    @Override
    public void hide() {

    }
}
