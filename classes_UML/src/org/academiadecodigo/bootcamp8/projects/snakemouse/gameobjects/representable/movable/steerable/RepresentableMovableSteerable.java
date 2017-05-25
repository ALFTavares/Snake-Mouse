package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.movable.steerable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.Representable;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobjects.representable.movable.RepresentableMovable;
import org.academiadecodigo.bootcamp8.projects.snakemouse.grid.AbstractGridPosition;

/**
 * Created by codecadet on 25/05/17.
 */
public interface RepresentableMovableSteerable extends RepresentableMovable {


    Direction getDirection();

    void setDirection(Direction direction);
}
