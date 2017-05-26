package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.AbstractGridPosition;

/**
 * Created by codecadet on 25/05/17.
 */
public class Food extends GameObject implements Representable {

    private AbstractGridPosition position;

    private boolean crap = false;

    public boolean isShit() {
        return crap;
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

    }

    @Override
    public void hide() {

    }
}
