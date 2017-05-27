package org.academiadecodigo.bootcamp8.projects.snakemouse;

import org.academiadecodigo.bootcamp8.projects.snakemouse.display.Hud;
import org.academiadecodigo.bootcamp8.projects.snakemouse.display.SplashScreen;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectsFactory;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.Food;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.Grid;

/**
 * Created by codecadet on 25/05/17.
 */
public class Game {

    private Grid grid;
    private GameObject food;

    public void init() {

        //SplashScreen splashScreen = new SplashScreen();
        //Hud hud = new Hud();
        grid = GameObjectsFactory.createGrid(24, 24);
        food = GameObjectsFactory.createFood(grid);
    }

    public void start() {
        grid.init();
    }

}
