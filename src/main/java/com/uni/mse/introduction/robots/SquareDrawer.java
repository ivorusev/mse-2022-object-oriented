package com.uni.mse.introduction.robots;

import com.uni.mse.introduction.figures.Figure;
import com.uni.mse.introduction.figures.Square;
import kareltherobot.Directions;

public class SquareDrawer extends AdvancedRobot implements Drawer {

    /**
     * Initializes a robot.
     *
     * @param avenue    x coordinate
     * @param street    y coordinate
     * @param direction
     */
    public SquareDrawer(int avenue, int street, Direction direction) {
        super(avenue, street, direction);
    }

    public SquareDrawer(int avenue, int street, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    @Override
    public void draw(Figure figure) {
        if (!(figure instanceof Square)) {
            throw new IllegalArgumentException("Invalid parameter of class " + figure.getClass());
        }
        Square square = (Square) figure;
        this.moveTo(figure.getPoint());

        this.turnToDirection(Directions.East);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < square.getSide() - 1; j++) {
                move();
                putBeeper();
            }
            turnRight();
        }
    }
}
