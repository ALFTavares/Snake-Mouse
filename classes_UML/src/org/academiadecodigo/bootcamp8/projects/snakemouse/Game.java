package org.academiadecodigo.bootcamp8.projects.snakemouse;

import org.academiadecodigo.bootcamp8.projects.snakemouse.display.Hud;
import org.academiadecodigo.bootcamp8.projects.snakemouse.display.SplashScreen;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.GameObjectsFactory;

/**
 * Created by codecadet on 25/05/17.
 */
public class Game {

    public void init(){
        SplashScreen splashScreen = new SplashScreen();
        Hud hud = new Hud();
        GameObjectsFactory gameObjectsFactory = new GameObjectsFactory();

    }

    public void start(){}

}
