package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectType;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx.SimpleGraphicsGrid;
import org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx.SimpleGraphicsGridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 25/05/17.
 */
public class Food extends GameObject implements Representable {


    private boolean crap = false;
    private Picture pic;
    private GridPosition position;

    public Food(GridPosition position) {
        super(position, GameObjectType.FOOD);
        this.position = position;
        int x = position.getCol() * SimpleGraphicsGrid.CELLSIZE;
        int y = position.getRow() * SimpleGraphicsGrid.CELLSIZE;
        pic = new Picture(x - SimpleGraphicsGrid.PADDING * SimpleGraphicsGrid.CELLSIZE,
                y - SimpleGraphicsGrid.PADDING * SimpleGraphicsGrid.CELLSIZE,
                "img/food.png");
        pic.draw();

    }

    //If the mouse eats the food, it becomes poop
    public boolean isShit() {
        return crap;
    }

    @Override
    public int getXpos() {
        return position.getCol() * SimpleGraphicsGrid.CELLSIZE;
    }

    @Override
    public int getYpos() {
        return position.getRow();
    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }
}
