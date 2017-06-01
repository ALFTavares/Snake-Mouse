package org.academiadecodigo.bootcamp.newmousesnake;

import org.academiadecodigo.bootcamp.newmousesnake.Grid.Grid;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridDirection;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.Position.GridPosition;
import org.academiadecodigo.bootcamp.newmousesnake.Grid.SimplegfxGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 30/05/17.
 */
public class Game {

    private Grid grid;
    private Mouse mouse;
    private Snake snake;
    private Food food;

    private Picture[] coins;

    private int mouseLifes = 3;
    private int snakeLifes = 3;

    public Game() {

    }

    public void init() throws InterruptedException {
        grid = new SimplegfxGrid(24, 24);
        mouse = new Mouse(grid.makeGridPosition(20, 20));
        snake = new Snake(grid.makeGridPosition(4, 4));
        food = new Food(grid.makeGridPosition());

        coins = new Picture[6];
        drawCoins();

        start();
    }

    public void start() throws InterruptedException {

        while (true) {

            Thread.sleep(100);

            mouse.move(mouse.getDirection());

            snake.move(snake.getDirection());

            detectMouseEatingFood();

            checkSnakeEatFoodorPoop();

            checkSnakeKillsMouse();

            eraseCoins();

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


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mouse.setPosition(grid.makeGridPosition(2000,2000));
            mouse.die();
            mouse = new Mouse(grid.makeGridPosition(20, 20));
            mouseLifes--;
            System.out.println("Mouse lifes left " + mouseLifes);

        }
    }

    public void checkSnakeEatFoodorPoop(){

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

            food.snakeEatPoop();

            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            snake.setPosition(grid.makeGridPosition(2000,2000));
            snake.die();
            snake = new Snake(grid.makeGridPosition(4, 4));
            snakeLifes--;
            food = new Food(grid.makeGridPosition());
            System.out.println("Snake lifes left " + snakeLifes);

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
            food = new Food(grid.makeGridPosition());
        }
    }

    public void drawCoins(){

        coins[0] = new Picture( 625,80 ,"img/coin.png");
        coins[0].draw();
        coins[1] = new Picture( 625,110 ,"img/coin.png");
        coins[1].draw();
        coins[2] = new Picture( 625,140 ,"img/coin.png");
        coins[2].draw();
        coins[3] = new Picture( 625,480 ,"img/coin.png");
        coins[3].draw();
        coins[4] = new Picture( 625,510 ,"img/coin.png");
        coins[4].draw();
        coins[5] = new Picture( 625,540 ,"img/coin.png");
        coins[5].draw();
    }

    public void eraseCoins(){
        if(mouseLifes == 2 ){ coins[2].delete();}
        if(mouseLifes == 1 ){ coins[1].delete();}
        if(mouseLifes == 0 ){ coins[0].delete();}

        if(snakeLifes == 2 ){ coins[5].delete();}
        if(snakeLifes == 1 ){ coins[4].delete();}
        if(snakeLifes == 0 ){ coins[3].delete();}

    }

}
