package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridDirection;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 30/05/17.
 */
public class SnakeBodySegment {


    private GridDirection direction;
    private GridPosition position;

    private Picture pic;


    public SnakeBodySegment(GridPosition gridPosition) {
        this.position = gridPosition;
        this.direction = GridDirection.RIGHT;


        pic = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING, position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/snakeBody.png");

        pic.draw();


    }

    public GridDirection getDirection() {
        return this.direction;
    }

    public GridPosition getPosition() {
        return this.position;
    }

    public void setPosition(GridPosition position){
        this.position = position;
    }

    public void move(GridDirection dir) {

        switch (dir) {

            case LEFT: //LEFT

                if (position.getCol() < 1) {
                    this.position.setPos(23, position.getRow());

                    pic.translate(SimplegfxGrid.CELLSIZE * 23, 0);
                }

                pic.translate(-SimplegfxGrid.CELLSIZE, 0);

                position.setPos(position.getCol() - 1, position.getRow());



                break;

            case UP: //UP

                if (position.getRow() < 1) {
                    this.position.setPos(position.getCol(), 23);

                    pic.translate(0, SimplegfxGrid.CELLSIZE * 23);
                }

                pic.translate(0, -SimplegfxGrid.CELLSIZE);

                position.setPos(position.getCol(), position.getRow() - 1);




                break;

            case DOWN: //DOWN

                if (position.getRow() > 22) {
                    this.position.setPos(position.getCol(), 0);

                    pic.translate(0, -SimplegfxGrid.CELLSIZE * 23);
                }

                pic.translate(0, +SimplegfxGrid.CELLSIZE);

                position.setPos(position.getCol(), position.getRow() + 1);



                break;

            case RIGHT: //RIGHT

                if (position.getCol() > 22) {
                    this.position.setPos(0, position.getRow());

                    pic.translate(-SimplegfxGrid.CELLSIZE * 23, 0);
                }

                pic.translate(SimplegfxGrid.CELLSIZE, 0);

                position.setPos(position.getCol() + 1, position.getRow());



                break;

            default:
                System.out.println("shit snake body");
        }
    }



}
