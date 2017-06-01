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

            checkSnakeKillsMouse();

        }

    }

    public void checkSnakeKillsMouse(){
            int snakePosCol = snake.getPosition().getCol();
            int snakePosRow = snake.getPosition().getRow();

            int mousePosCol = mouse.getPosition().getCol();
            int mousePosRow = mouse.getPosition().getRow();

        if (snakePosCol == mousePosCol && snakePosRow == mousePosRow ||
                snakePosCol == mousePosCol + 1 && snakePosRow == mousePosRow ||
                snakePosCol == mousePosCol && snakePosRow == mousePosRow +1 ) {
            mouse.die();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void checkSnakeEatFood(){

        food.getPosition();

        // check collision to food while its not poop
        if (snake.getPosition().getCol() == (food.getPosition().getCol())
                && snake.getPosition().getRow() == (food.getPosition().getRow())
                && !food.isPooped()) {
            food.snakeEat();
            food = new Food(grid.makeGridPosition());
        }

        // check collision to poop
        if (snake.getPosition().getCol() == (food.getPosition().getCol())
                && snake.getPosition().getRow() == (food.getPosition().getRow())
                && food.isPooped()) {
            snake.snakeDie();
            food.snakeEatPoop();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        if (snake.isDead()){
            System.out.println("SNAKE IS DEAD");
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
