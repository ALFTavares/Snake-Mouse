package org.academiadecodigo.bootcamp8.projects.snakemouse.simplegfx;

import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.GridDirection;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp8.projects.snakemouse.gameobject.representable.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 25/05/17.
 */
public class SimpleGraphicsGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGraphicsGrid simpleGraphicsGrid;

    public SimpleGraphicsGridPosition(SimpleGraphicsGrid grid){
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        simpleGraphicsGrid = grid;
        rectangle = new Rectangle(grid.columnToX(getCol()), grid.rowToY(getRow()), grid.getCellSize(), grid.getCellSize());
        show();
    }

    public SimpleGraphicsGridPosition(int col, int row, SimpleGraphicsGrid grid){
        super(col, row, grid);
        rectangle = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(), grid.getCellSize());
        simpleGraphicsGrid = grid;
        show();
    }

    @Override
    public void show() {
        rectangle.fill();
    }

    @Override
    public void hide() {
        rectangle.delete();
    }

    @Override
    public void moveInDirection(GridDirection direction) {
        super.moveInDirection(direction);
        switch (direction){
            case DOWN:
                rectangle.translate(0, simpleGraphicsGrid.rowToY(getRow()) - rectangle.getY());
                break;
            case RIGHT:
                rectangle.translate(simpleGraphicsGrid.columnToX(getCol()) - rectangle.getX(), 0);
                break;
            case UP:
                rectangle.translate(0, simpleGraphicsGrid.rowToY(getRow()) - rectangle.getY());
                break;
            case LEFT:
                rectangle.translate(simpleGraphicsGrid.columnToX(getCol()) - rectangle.getX(), 0);
                break;

        }
    }
}
