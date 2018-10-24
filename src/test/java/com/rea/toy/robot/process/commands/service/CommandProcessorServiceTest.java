package com.rea.toy.robot.process.commands.service;

import com.rea.toy.robot.ToyRobot;
import com.rea.toy.robot.commands.Command;
import com.rea.toy.robot.commands.LeftCommand;
import com.rea.toy.robot.commands.MoveCommand;
import com.rea.toy.robot.commands.ReportCommand;
import com.rea.toy.robot.commands.RightCommand;
import com.rea.toy.robot.process.commands.service.impl.CommandProcessorServiceImpl;
import com.rea.toy.robot.validations.CommandNotFoundException;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class CommandProcessorServiceTest 
{

	private CommandProcessorService commandProcessorService = new CommandProcessorServiceImpl();
	
	@Test
	public void testValidPlaceCommandInitializeTheToyRobot()
	{
		//Given
		String 		placeCommand = "PLACE 0,0,NORTH";
		//When
		ToyRobot 	toyRobot 	 = commandProcessorService.initializeToyRobot(placeCommand);
		//Then 
		Assert.assertNotNull(toyRobot);
	}
	
	@Test(expected = CommandNotFoundException.class)
	public void testInvalidPlaceCommandThrowsException()
	{
		//Given
		String 		placeCommand = "PLACE 0,0,0,NORTH";
		//When
		ToyRobot 	toyRobot 	 = commandProcessorService.initializeToyRobot(placeCommand);
		//Then
		Assert.fail();
	}
	
	
	@Test 
	public void testPopulateLeftCommand()
	{
		//Given 
		String leftCommand = "LEFT";
		
		//When 
		Command expectedLeftCommand = commandProcessorService.populateCommand(leftCommand);
		
		//Then
		Assert.assertTrue(expectedLeftCommand instanceof LeftCommand);
	}
	
	
	@Test 
	public void testPopulateRightCommand()
	{
		//Given 
		String rightCommand = "RIGHT";
		
		//When 
		Command expectedRightCommand = commandProcessorService.populateCommand(rightCommand);
		
		//Then
		Assert.assertTrue(expectedRightCommand instanceof RightCommand);
	}
	
	@Test 
	public void testPopulateMoveCommand()
	{
		//Given 
		String moveCommand = "MOVE";
		
		//When 
		Command expectedMoveCommand = commandProcessorService.populateCommand(moveCommand);
		
		//Then
		Assert.assertTrue(expectedMoveCommand instanceof MoveCommand);
	}
	
	
	@Test 
	public void testPopulateReportCommand()
	{
		//Given 
		String reportCommand = "REPORT";
		
		//When 
		Command expectedReportCommand = commandProcessorService.populateCommand(reportCommand);
		
		//Then
		Assert.assertTrue(expectedReportCommand instanceof ReportCommand);
	}
	
	@Test(expected = CommandNotFoundException.class)
	public void throwsExceptionWhenForInvalidCommand()
	{
		//Given
		String wrongCommand = "WRONGCOMMAND";
		
		//When 
		Command expectedWrongCommand = commandProcessorService.populateCommand(wrongCommand);
		
		//Then
		Assert.fail();
	}
	
	
	
	
	
	
	
	
	
}
