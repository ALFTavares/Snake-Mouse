package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.movable.steerable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.Snake;
import org.academiadecodigo.bootcamp8.projects.snakemouse.grid.AbstractGridPosition;

/**
 * Created by codecadet on 25/05/17.
 */
public class SnakeHead extends Snake implements RepresentableMovableSteerable{

    public SnakeHead(AbstractGridPosition position, Direction direction){

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
