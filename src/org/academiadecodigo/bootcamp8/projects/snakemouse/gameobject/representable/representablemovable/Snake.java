package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.representablemovable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectType;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;

import java.util.ArrayList;

/**
 * Created by codecadet on 25/05/17.
 */
public class Snake extends GameObject {

    private int lifes;
    private SnakeHead head;
    private ArrayList<SnakeBodySegment> bodySegments;

    //COSTRUCTOR
    public Snake(GridPosition position) {
        super(position, GameObjectType.SNAKE);
        head = new SnakeHead();
        bodySegments = new ArrayList<>();

    }

    //METHODS
    public int getLifes(){
        return lifes;
    }

    public void addBodySegment(){}

    public void removeBodySegment(){}

    public ArrayList<SnakeBodySegment> getBodySegments(){
        return bodySegments;
    }

    public void die(){}

    public void killMouse(){}

}
