package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 01/06/17.
 */
public class SnakeBody {

    private GridPosition position;
    private Picture bodyPic;

    public SnakeBody(GridPosition position){
        this.position = position;
        bodyPic = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/snakeBody.png");
    }

    public GridPosition getPosition() {
        return position;
    }

    public Picture getBodyPic() {
        return bodyPic;
    }
}
