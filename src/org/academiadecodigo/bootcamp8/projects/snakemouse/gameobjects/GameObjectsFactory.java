package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.Field;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.Food;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.movable.steerable.Mouse;

/**
 * Created by codecadet on 25/05/17.
 */
public class GameObjectsFactory {

    public GameObjectsFactory() {
        GameObject snake = new Snake();
        GameObject mouse = new Mouse();
        GameObject field = new Field();
        GameObject food = new Food();
    }

    public static void createGameObjects(GameObjectType gameObjectType){}
}
