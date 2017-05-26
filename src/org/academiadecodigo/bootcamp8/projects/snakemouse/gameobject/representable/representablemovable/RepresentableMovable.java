package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.representablemovable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.Representable;

/**
 * Created by codecadet on 25/05/17.
 */
public interface RepresentableMovable extends Representable{

    void move();

    void collisionDetect();
}
