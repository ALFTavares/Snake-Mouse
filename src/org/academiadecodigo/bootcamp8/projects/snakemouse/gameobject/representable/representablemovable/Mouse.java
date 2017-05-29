package org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.representablemovable;

import org.academiadecodigo.bootcamp8.projects.snakemouse.KeyboardClass;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObject;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.GameObjectType;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridDirection;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx.SimpleGraphicsGrid;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 25/05/17.
 */
public class Mouse extends GameObject implements RepresentableMovable{

    private GridPosition pos;
    private GridDirection direction = GridDirection.LEFT;
    private Picture[] pics;
    private KeyboardClass keyboard;

    private boolean dead;
    private int lives = 3;

    private final int initialPositionX = 20;
    private final int initialPositionY = 20;

    public Mouse(GridPosition pos) {
        this.pos = pos;
        int x = initialPositionX * SimpleGraphicsGrid.CELLSIZE;
        int y = initialPositionY * SimpleGraphicsGrid.CELLSIZE;

        keyboard = new KeyboardClass(direction);
        keyboard.keyboardMouse();

        pics = new Picture[]{new Picture(x, y, "img/mouseUp.png"),
                            new Picture(x, y, "img/mouseDown.png"),
                            new Picture(x, y, "img/mouseLeft.png"),
                            new Picture(x, y, "img/mouseRight.png")};
        keyboard = new KeyboardClass(getDirection());
        show();

    }

    public KeyboardClass getKeyboard() {
        return keyboard;
    }

    public GridPosition getPosition(){
        return pos;
    }

    public int getLifes(){return lives;}

    public void eatFood(){

    }

    public void crap(){

    }



    @Override
    public void show() {
        pics[getDirection().ordinal()].draw();
    }

    @Override
    public void hide() {

    }

    @Override
    public void move(){
        getPosition().moveInDirection(GridDirection.LEFT);
    }

    public void chooseDirection(GridDirection direction){
        switch (direction){
            case UP:
                getPosition().moveInDirection(GridDirection.UP);
                break;
            case RIGHT:
                getPosition().moveInDirection(GridDirection.RIGHT);
                break;
            case DOWN:
                getPosition().moveInDirection(GridDirection.DOWN);
                break;
            case LEFT:
                getPosition().moveInDirection(GridDirection.LEFT);
                break;
        }
    }

    @Override
    public void collisionDetect() {

    }


    public GridDirection getDirection() {
        return direction;
    }


    public void setDirection(GridDirection direction) {

    }
}
