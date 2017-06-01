package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by bob on 5/31/17.
 */
public class Food {

    private Picture picFood;
    private Picture picPoop;
    private GridPosition position;
    private boolean isPoop = false;

    public Food(GridPosition position) {
        this.position = position;
        picFood = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/food.png");
        picPoop = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/poop.png");

        picFood.draw();
    }

    public void makePoop() {
        this.isPoop = true;
    }

    public void foodOrPoop() {
        if (isPoop) {
            picPoop.draw();
            picFood.delete();
        }
    }

    public void getEaten(){
        this.position.setPos(50,50);
        picFood.delete();

    }

    public GridPosition getPosition() {
        return this.position;
    }
}
