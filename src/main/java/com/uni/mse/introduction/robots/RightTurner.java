package com.uni.mse.introduction.robots;

import kareltherobot.Robot;
import kareltherobot.UrRobot;

import java.awt.*;

/**
 * TODO: ...
 */
public class RightTurner extends Robot {

    /**
     * Constructs a new robot.
     * @param street the street
     * @param avenue the avenue
     * @param direction the directions
     */
    public RightTurner(int street, int avenue, Direction direction) {
        super(street, avenue, direction, 0);
    }

    public RightTurner(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    /**
     * Turns right the robot.
     */
    public void turnRight() {
        super.turnLeft();
        super.turnLeft();
        super.turnLeft();
    }
}
