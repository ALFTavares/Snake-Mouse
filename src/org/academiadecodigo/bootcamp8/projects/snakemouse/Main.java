package org.academiadecodigo.bootcamp8.projects.snakemouse;


import org.academiadecodigo.bootcamp8.projects.snakemouse.display.SplashScreen;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectsFactory;

/**
 * Created by codecadet on 25/05/17.
 */
public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        game.init();
        game.show();

    }


}
