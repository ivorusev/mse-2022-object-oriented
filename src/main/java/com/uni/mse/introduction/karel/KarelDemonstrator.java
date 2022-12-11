package com.uni.mse.introduction.karel;

import com.uni.mse.introduction.figures.Figure;
import com.uni.mse.introduction.figures.Point;
import com.uni.mse.introduction.figures.Square;
import com.uni.mse.introduction.robots.AdvancedRobot;
import com.uni.mse.introduction.robots.SquareDrawer;
import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class KarelDemonstrator {
    public static void main(String[] args) {
        World.setSize(20, 20);
        World.setVisible();
        World.setDelay(25);

        SquareDrawer robot = new SquareDrawer(1, 1, Directions.East, 100);
        Figure square = new Square(new Point(10, 10), 4);
        robot.draw(square);
        robot.moveTo(new Point(2, 2));
    }
}
