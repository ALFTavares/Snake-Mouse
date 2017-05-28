package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.representablemovable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectType;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridDirection;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx.SimpleGraphicsGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 25/05/17.
 */
public class Mouse extends GameObject implements RepresentableMovable{

    private GridPosition position;

    private GridDirection direction;
    private Picture picLeft;
    private Picture picUp;
    private Picture picRight;
    private Picture picDown;


    private final int initialPositionX = 20;
    private final int initialPositionY = 20;

    public Mouse() {

        int x = initialPositionX * SimpleGraphicsGrid.CELLSIZE;
        int y = initialPositionY * SimpleGraphicsGrid.CELLSIZE;
        picLeft = new Picture(x - SimpleGraphicsGrid.PADDING * SimpleGraphicsGrid.CELLSIZE,
                y - SimpleGraphicsGrid.PADDING * SimpleGraphicsGrid.CELLSIZE,
                "img/mouseLeft.png");

        picLeft.draw();


    }
/*
    public Mouse(GridPosition position) {
        super(position, GameObjectType.MOUSE);


        this.position = position;
        int x = initialPositionX * SimpleGraphicsGrid.CELLSIZE;
        int y = initialPositionY * SimpleGraphicsGrid.CELLSIZE;
        picLeft = new Picture(x - SimpleGraphicsGrid.PADDING * SimpleGraphicsGrid.CELLSIZE,
                y - SimpleGraphicsGrid.PADDING * SimpleGraphicsGrid.CELLSIZE,
                "img/mouseLeft.png");

        picLeft.draw();


    }
*/

    public GridPosition getPosition(){
        return this.position;
    }





//    public Mouse(AbstractGridPosition position, GridDirection direction) {
//        this.direction = direction;
//        this.position = position;
//    }

    public int getLifes(){return 0;}

    public void eatFood(){

    }

    public void crap(){

    }



    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void move() {

    }

    @Override
    public void collisionDetect() {

    }


    public GridDirection getDirection() {
        return null;
    }


    public void setDirection(GridDirection direction) {

    }
}
