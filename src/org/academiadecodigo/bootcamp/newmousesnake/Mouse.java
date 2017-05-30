package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 30/05/17.
 */
public class Mouse {

    private GridPosition gridPosition;
    private Picture picture;

    public Mouse(GridPosition gridPosition) {
        this.gridPosition = gridPosition;
        picture = new Picture(gridPosition.getCol() * gridPosition.getCellsize(),gridPosition.getRow() * gridPosition.getCellsize(),"img/mouseLeft.png");
        picture.draw();
    }

}
