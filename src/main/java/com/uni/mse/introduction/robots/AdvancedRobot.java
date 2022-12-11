package com.uni.mse.introduction.robots;

import com.uni.mse.introduction.figures.Point;
import kareltherobot.Directions;

public class AdvancedRobot extends RightTurner {

    /**
     * This is the Y coordinate.
     */
    private int street;

    /**
     * This is the X coordinate
     */
    private int avenue;

    /**
     * Initializes a robot.
     * 
     * @param street y coordinate
     * @param avenue x coordinate
     * @param direction
     */
    public AdvancedRobot(int avenue, int street, Directions.Direction direction) {
        super(street, avenue, direction);
        this.street = street;
        this.avenue = avenue;
    }

    public AdvancedRobot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
        this.street = street;
        this.avenue = avenue;
    }

    public void turnToDirection(Direction direction) {
        if (direction == Directions.North) {
            while (!facingNorth()) {
                turnLeft();
            }
        }
        if (direction == Directions.South) {
            while (!facingSouth()) {
                turnLeft();
            }
        }
        if (direction == Directions.East) {
            while (!facingEast()) {
                turnLeft();
            }
        }
        if (direction == Directions.West) {
            while (!facingWest()) {
                turnLeft();
            }
        }
    }

    public void moveTo(Point point) {
        if (this.avenue < point.getX()) {
            while (this.avenue < point.getX()) {
                turnToDirection(Directions.East);
                move();
            }
        }
        if (this.avenue > point.getX()) {
            while (this.avenue > point.getX()) {
                turnToDirection(Directions.West);
                move();
            }
        }
       if (this.street < point.getY()) {
            while (this.street < point.getY()) {
                turnToDirection(Directions.North);
                move();
            }
        }
        if (this.street > point.getY()) {
            while (this.street > point.getY()) {
                turnToDirection(Directions.South);
                move();
            }
        }
    }

    @Override
    public void move() {
        if (facingEast()) {
            avenue += 1;
        } else if (facingNorth()) {
            street += 1;
        } else if (facingSouth()) {
            street -= 1;
        } else if (facingWest()) {
            avenue -= 1;
        }
        super.move();
    }

    public int getY() {
        return street;
    }

    public int getX() {
        return avenue;
    }

}
