package com.uni.mse.introduction.robots;

import kareltherobot.Directions;
import kareltherobot.World;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class RightTurnerTest {

    private RightTurner robot = new RightTurner(1, 1, Directions.North);

    @Before
    public void init() {
        World.setSize(1,1);
        World.setVisible(false);
    }

    @Test
    public void testTurnRight_SimpleCase() {
        World.setDelay(0);
        robot.turnRight();
        assertTrue(robot.facingEast());
    }

}
