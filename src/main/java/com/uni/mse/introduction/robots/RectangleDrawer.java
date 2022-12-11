package com.uni.mse.introduction.robots;

import com.uni.mse.introduction.figures.Figure;

public class RectangleDrawer extends AdvancedRobot implements Drawer {

    /**
     * Initializes a robot.
     *
     * @param avenue    x coordinate
     * @param street    y coordinate
     * @param direction
     */
    public RectangleDrawer(int avenue, int street, Direction direction) {
        super(avenue, street, direction);
    }

    public RectangleDrawer(int street, int avenue, Direction direction, int beepers) {
        super(avenue, street, direction, beepers);
    }

    @Override
    public void draw(Figure figure) {
        // TODO
    }
}
