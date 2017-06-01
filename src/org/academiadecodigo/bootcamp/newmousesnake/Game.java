package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridDirection;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;

/**
 * Created by codecadet on 30/05/17.
 */
public class Game {

    private Grid grid;
    private Mouse mouse;
    private Snake snake;
    private Food food;

    public Game() {

    }

    public void init() throws InterruptedException {
        grid = new SimplegfxGrid(24, 24);
        mouse = new Mouse(grid.makeGridPosition(20, 20));
        snake = new Snake(grid.makeGridPosition(4, 4));
        food = new Food(grid.makeGridPosition());



        start();
    }

    public void start() throws InterruptedException {

        while (true) {

            Thread.sleep(100);

            mouse.move(mouse.getDirection());

            snake.move(snake.getDirection());


            detectMouseEatingFood();

            checkSnakeEatFood();

        }

    }

    public void checkSnakeEatFood(){

        food.getPosition();

        if (snake.getPosition().getCol() == (food.getPosition().getCol())
                && snake.getPosition().getRow() == (food.getPosition().getRow())) {
            food.getEaten();
            food = new Food(grid.makeGridPosition());
        }
    }


    public void detectMouseEatingFood() {

        food.getPosition();
       // System.out.println(mouse.getPosition().getCol() + " " + mouse.getPosition().getRow());
       // System.out.println(food.getPosition().getCol() + " " + mouse.getPosition().getRow());
        if (mouse.getPosition().getCol() == (food.getPosition().getCol())
                && mouse.getPosition().getRow() == (food.getPosition().getRow())) {
            food.makePoop();
            food.foodOrPoop();
        }
    }
}
