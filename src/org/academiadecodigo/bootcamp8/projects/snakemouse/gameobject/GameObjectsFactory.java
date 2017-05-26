package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject;

import org.academiadecodigo.bootcamp8.projects.snakemouse.Game;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.representablemovable.Snake;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.Grid;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.Food;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.representablemovable.Mouse;
import org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx.SimpleGraphicsGrid;

/**
 * Created by codecadet on 25/05/17.
 */
public class GameObjectsFactory {

    public static GameObject createGameObjects(){
            GameObject snake = new Snake();
            GameObject mouse = new Mouse();
            GameObject food = new Food();
            return null;
        }

    public static GameObject createGrid(int cols, int rows) {

        return new SimpleGraphicsGrid(cols,rows);
        }
    }

