package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.Grid;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;

import java.awt.*;

/**
 * Created by codecadet on 25/05/17.
 */
public abstract class GameObject {

    private GridPosition position;
    private Grid grid;
    private GameObjectType objectType;

    public GameObject(GridPosition position, GameObjectType objectType){
        this.position = position;
        this.objectType = objectType;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public GridPosition getPosition() {
        return position;
    }
}
