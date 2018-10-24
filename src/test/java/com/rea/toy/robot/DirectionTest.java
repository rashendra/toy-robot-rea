package com.rea.toy.robot;

import org.junit.Assert;
import org.junit.Test;

public class DirectionTest 
{

    @Test
    public void westIsOnLeftOfNorth() {
        //Given
        Direction north = Direction.NORTH;

        //When
        Direction west = north.left();

        //Then
        Assert.assertEquals(Direction.WEST, west);
    }

    @Test
    public void eastIsOnRightOfNorth() {
        //Given
        Direction north = Direction.NORTH;

        //When
        Direction east = north.right();

        //Then
        Assert.assertEquals(Direction.EAST, east);
    }

    @Test
    public void northIsOnRightOfWest() {
        //Given
        Direction west = Direction.WEST;

        //When
        Direction north = west.right();

        //Then
        Assert.assertEquals(Direction.NORTH, north);
    }

    @Test
    public void southIsOnLeftOfWest() {
        //Given
        Direction west = Direction.WEST;

        //When
        Direction south = west.left();

        //Then
        Assert.assertEquals(Direction.SOUTH, south);
    }

    @Test
    public void eastIsOnLeftOfSouth() {
        //Given
        Direction south = Direction.SOUTH;

        //When
        Direction east = south.left();

        //Then
        Assert.assertEquals(Direction.EAST, east);
    }

    @Test
    public void westIsOnRightOfSouth() {
        //Given
        Direction south = Direction.SOUTH;

        //When
        Direction west = south.right();

        //Then
        Assert.assertEquals(Direction.WEST, west);
    }

    @Test
    public void northIsOnLeftOfEast() {
        //Given
        Direction east = Direction.EAST;

        //When
        Direction north = east.left();

        //Then
        Assert.assertEquals(Direction.NORTH, north);
    }

    @Test
    public void southIsOnRightOfEast() {
        //Given
        Direction east = Direction.EAST;

        //When
        Direction south = east.right();

        //Then
        Assert.assertEquals(Direction.SOUTH, south);
    }

    @Test
    public void eastIsOneStepForwardOnXAxis() {
        //Given
        Direction east = Direction.EAST;

        //When
        int stepSize = east.getNextStepOnXAxis();

        //Then
        Assert.assertEquals(1, stepSize);
    }

    @Test
    public void eastIsPlacedOnYAxis() {
        //Given
        Direction east = Direction.EAST;

        //When
        int stepSize = east.getNextStepOnYAxis();

        //Then
        Assert.assertEquals(0, stepSize);
    }

   

    @Test
    public void westIsPlacedOnYAxis() {
        //Given
        Direction west = Direction.WEST;

        //When
        int stepSize = west.getNextStepOnYAxis();

        //Then
        Assert.assertEquals(0, stepSize);
    }

    @Test
    public void northIsOneStepForwardOnYAxis() {
        //Given
        Direction north = Direction.NORTH;

        //When
        int stepSize = north.getNextStepOnYAxis();

        //Then
        Assert.assertEquals(1, stepSize);
    }


    @Test
    public void northIsPlacedOnXAxis() {
        //Given
        Direction north = Direction.NORTH;

        //When
        int stepSize = north.getNextStepOnXAxis();

        //Then
        Assert.assertEquals(0, stepSize);
    }

  

    @Test
    public void southIsPlacedOnXAxis() {
        //Given
        Direction south = Direction.SOUTH;

        //When
        int stepSize = south.getNextStepOnXAxis();

        //Then
        Assert.assertEquals(0, stepSize);
    }
}
