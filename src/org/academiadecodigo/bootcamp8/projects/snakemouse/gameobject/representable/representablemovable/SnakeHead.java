package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.representablemovable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridDirection;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.AbstractGridPosition;

/**
 * Created by codecadet on 25/05/17.
 */
public class SnakeHead implements RepresentableMovable{

    private AbstractGridPosition position;
    private GridDirection direction;


    public SnakeHead() {

    }
    public SnakeHead(AbstractGridPosition position,GridDirection direction){

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


    public GridDirection getDirection() {
        return null;
    }


    public void setDirection(GridDirection direction) {

    }
}
