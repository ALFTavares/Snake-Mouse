package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.simplegraphics.pictures.Picture;




/**
 * Created by codecadet on 30/05/17.
 */
public class GameOver {


    private Picture picture;

    public GameOver() {


        picture = new Picture(0, 0, "img/gameover.png");

    }


    public void init() {

        picture.draw();
    }


}
