package com.rea.toy.robot;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.rea.toy.robot.commands.Command;
import com.rea.toy.robot.commands.LeftCommand;
import com.rea.toy.robot.commands.MoveCommand;


public class ToyRobotTest
{
	@Test
	public void testReportCommand()
	{
		TableTop  	tableTop 	= new TableTop();
		
		Coordinates coordinates = new Coordinates(2, 3);
		
		ToyRobot    toyRobot    = new ToyRobot(coordinates, Direction.WEST, tableTop);
		
		String report = toyRobot.report();
		
		Assert.assertEquals("2,3,WEST", report);
		
	}
	
	@Test
	public void testTurnLeftChangeDirection()
	{
		//Given
		TableTop  	tableTop 	= new TableTop();
		
		Coordinates coordinates = new Coordinates(2, 3);
		
		ToyRobot    toyRobot    = new ToyRobot(coordinates, Direction.WEST, tableTop);
		
		//when
		toyRobot.turnLeft();
		
		String report = toyRobot.report();
		
		//then
		Assert.assertEquals("2,3,SOUTH", report);
		
	}
	
	
	@Test 
	public void testTurnRightChangeDirection()
	{
		//Given 
		TableTop  	tableTop 	= new TableTop();
		
		Coordinates coordinates = new Coordinates(2, 3);
		
		ToyRobot    toyRobot    = new ToyRobot(coordinates, Direction.WEST, tableTop);
		
		//when
		toyRobot.turnRight();
		
		String report = toyRobot.report();
		
		//then
		Assert.assertEquals("2,3,NORTH", report);
		
	}
	
	@Test
	public void testMoveForwardChangesCoordinatesByOne()
	{
		//Given 
		TableTop  	tableTop 	= new TableTop();
		
		Coordinates coordinates = new Coordinates(2, 3);
		
		ToyRobot    toyRobot    = new ToyRobot(coordinates, Direction.WEST, tableTop);
		
		//when
		toyRobot.moveForward();
		
		String report = toyRobot.report();
		//then
		Assert.assertEquals("1,3,WEST", report);
		
	}
	
	@Test 
	public void testListOfCommands()
	{
		//Given
		TableTop  	tableTop 	= new TableTop();
		
		Coordinates coordinates = new Coordinates(1, 2);
		
		ToyRobot    toyRobot    = new ToyRobot(coordinates, Direction.EAST, tableTop);
		
		List<Command>  commands = new ArrayList<>();
		commands.add(new MoveCommand());
		commands.add(new MoveCommand());
		commands.add(new LeftCommand());
		commands.add(new MoveCommand());
		
		//when
		toyRobot.processCommand(commands);
		
		String report = toyRobot.report();
		//then
		Assert.assertEquals("3,3,NORTH", report);
		
	}
	
	
	
	
	
	
	

}
