package org.academiadecodigo.bootcamp8.projects.snakemouse;

import org.academiadecodigo.bootcamp8.projects.snakemouse.display.Hud;
import org.academiadecodigo.bootcamp8.projects.snakemouse.display.SplashScreen;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectsFactory;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.Grid;

/**
 * Created by codecadet on 25/05/17.
 */
public class Game {

    private Grid grid;

    public void init() {

        SplashScreen splashScreen = new SplashScreen();
        Hud hud = new Hud();
        grid = GameObjectsFactory.createGrid(24, 24);

    }

    public void start() {
        grid.init();
    }

}
