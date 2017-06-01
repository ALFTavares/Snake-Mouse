package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by bob on 5/31/17.
 */
public class Coin {

    private Picture picCoin;
    private GridPosition position;
    private boolean show = true;

    public Coin(GridPosition position) {
        this.position = position;
        picCoin = new Picture(position.getCol() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                position.getRow() * SimplegfxGrid.CELLSIZE + SimplegfxGrid.PADDING,
                "img/coin.png");

        picCoin.draw();
    }

    public void hide(){
        picCoin.delete();
    }


}