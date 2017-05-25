package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.movable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.Representable;

/**
 * Created by codecadet on 25/05/17.
 */
public interface RepresentableMovable extends Representable{

    void move();

    void collisionDetect();
}
