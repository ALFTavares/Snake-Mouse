package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridColor;

/**
 * Created by codecadet on 25/05/17.
 */
public enum GameObjectType {
    GRID(GridColor.NOCOLOR),
    SNAKE(GridColor.NOCOLOR),
    MOUSE(GridColor.NOCOLOR),
    FOOD(GridColor.NOCOLOR);

    private GridColor color;

    GameObjectType(GridColor color) {
        this.color = color;
    }

    public GridColor getColor() {
        return color;
    }
}
