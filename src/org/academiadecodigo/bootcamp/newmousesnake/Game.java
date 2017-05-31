package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridDirection;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;

/**
 * Created by codecadet on 30/05/17.
 */
public class Game {

    private SimplegfxGrid grid;
    private Mouse mouse;
    private int delay;
    private Food food;

    public Game(int delay) {
        grid = new SimplegfxGrid(24, 24);
        mouse = new Mouse(grid.makeGridPosition(12, 12),grid);
        this.delay = delay;
    }

    public void start() throws InterruptedException {

       while (true) {

            // Pause for a while
            Thread.sleep(delay);

            mouse.moveInDirection(GridDirection.DOWN,1 );

        }
    }

    public void moveAll() {

    }

    public void init() throws InterruptedException{
        grid = new SimplegfxGrid(24, 24);
        mouse = new Mouse(grid.makeGridPosition(20, 12));
        food = new Food(grid.makeGridPosition());

        start();
    }

    public void start() throws InterruptedException{
        while (true) {

            Thread.sleep(300);

            mouse.move(mouse.getDirection());

            detectMouseEatingFood();


        }

    }

    public void detectMouseEatingFood() {

        food.getPosition();
        System.out.println(mouse.getPosition().getCol() + " " + mouse.getPosition().getRow());
        System.out.println(food.getPosition().getCol() + " " + mouse.getPosition().getRow());
        if (mouse.getPosition().getCol() == (food.getPosition().getCol())
                && mouse.getPosition().getRow() == (food.getPosition().getRow())) {
            food.makePoop();
            food.foodOrPoop();
        }
    }
}
