package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.representablemovable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridDirection;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.AbstractGridPosition;

/**
 * Created by codecadet on 25/05/17.
 */
public class Mouse extends GameObject implements RepresentableMovable{

    private AbstractGridPosition position;
    private GridDirection direction;

    public Mouse () {

    }

    public Mouse(AbstractGridPosition position, GridDirection direction){
        this.direction = direction;
        this.position = position;

    }

    public int getLifes(){return 0;}

    public void eatFood(){}

    public void crap(){}



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
