package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectType;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx.SimpleGraphicsGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 25/05/17.
 */
public class Food extends GameObject implements Representable {


    private boolean crap = false;
    private Picture pic;

    public Food(GridPosition position) {
        super(position, GameObjectType.FOOD);
        pic = new Picture(getXpos() + SimpleGraphicsGrid.PADDING,
                getYpos() + SimpleGraphicsGrid.PADDING,
                "img/food.png");
        pic.draw();
    }

    //If the mouse eats the food, it becomes poop
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
