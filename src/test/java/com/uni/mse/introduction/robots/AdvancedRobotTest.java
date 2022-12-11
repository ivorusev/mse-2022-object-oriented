package com.uni.mse.introduction.robots;

import kareltherobot.Directions;
import kareltherobot.World;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdvancedRobotTest {

    private AdvancedRobot robot;

    @Before
    public void init() {
        World.setSize(1,1);
        World.setVisible(false);
        World.setDelay(0);
    }

    @Test
    public void testCoordinatesChange_FacingEast() {
        robot = new AdvancedRobot(1, 1, Directions.East);
        robot.move();
        assertEquals(1, robot.getY());
        assertEquals(2, robot.getX());
    }

    @Test
    public void testCoordinatesChange_FacingNorth() {
        robot = new AdvancedRobot(1, 1, Directions.North);
        robot.move();
        assertEquals(2, robot.getY());
        assertEquals(1, robot.getX());
    }

    @Test
    public void testCoordinatesChange_FacingSouth() {
        robot = new AdvancedRobot(1, 2, Directions.South);
        robot.move();
        assertEquals(1, robot.getY());
        assertEquals(1, robot.getX());
    }

    @Test
    public void testCoordinatesChange_FacingWest() {
        robot = new AdvancedRobot(2, 1, Directions.West);
        robot.move();
        assertEquals(1, robot.getY());
        assertEquals(1, robot.getX());
    }

    @Test
    public void testTurnToDirection_north() {
        robot = new AdvancedRobot(2, 1, Directions.West);
        robot.turnToDirection(Directions.North);
        assertTrue(robot.facingNorth());
    }

    @Test
    public void testTurnToDirection_south() {
        robot = new AdvancedRobot(2, 1, Directions.West);
        robot.turnToDirection(Directions.South);
        assertTrue(robot.facingSouth());
    }

    @Test
    public void testTurnToDirection_east() {
        robot = new AdvancedRobot(2, 1, Directions.North);
        robot.turnToDirection(Directions.East);
        assertTrue(robot.facingEast());
    }

    @Test
    public void testTurnToDirection_west() {
        robot = new AdvancedRobot(2, 1, Directions.North);
        robot.turnToDirection(Directions.West);
        assertTrue(robot.facingWest());
    }
}
