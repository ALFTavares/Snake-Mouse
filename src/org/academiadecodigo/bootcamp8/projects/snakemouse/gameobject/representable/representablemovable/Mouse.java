package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.representablemovable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectType;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridDirection;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx.SimpleGraphicsGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 25/05/17.
 */
public class Mouse extends GameObject implements RepresentableMovable{

    private GridPosition position;
    private GridDirection direction;
    private Picture[] pics;

    private boolean dead;
    private int lives = 3;

    private final int initialPositionX = 20;
    private final int initialPositionY = 20;

    public Mouse() {
        int x = initialPositionX * SimpleGraphicsGrid.CELLSIZE;
        int y = initialPositionY * SimpleGraphicsGrid.CELLSIZE;
        pics = new Picture[]{new Picture(x, y, "img/mouseLeft.png"),
                            new Picture(x, y, "img/mouseUp.png"),
                            new Picture(x, y, "img/mouseRight.png"),
                            new Picture(x, y, "img/mouseDown.png")};

    }

    public GridPosition getPosition(){
        return this.position;
    }

    public int getLifes(){return lives;}

    public void eatFood(){

    }

    public void crap(){

    }



    @Override
    public void show() {
        pics[1].draw();

    }

    @Override
    public void hide() {

    }

    @Override
    public void move() {


    }

    @Override
    public void collisionDetect() {

    }


    public GridDirection getDirection() {
        return null;
    }


    public void setDirection(GridDirection direction) {

    }
}
