package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.movable.steerable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.grid.AbstractGridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.grid.SimpleGraphicsGridPosition;

/**
 * Created by codecadet on 25/05/17.
 */
public class Mouse implements RepresentableMovableSteerable {

    private AbstractGridPosition position;
    private Direction direction;

    public Mouse(AbstractGridPosition position, Direction direction){
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

    @Override
    public Direction getDirection() {
        return null;
    }

    @Override
    public void setDirection(Direction direction) {

    }
}
