package com.rea.toy.robot.process.commands.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.rea.toy.robot.Coordinates;
import com.rea.toy.robot.Direction;
import com.rea.toy.robot.TableTop;
import com.rea.toy.robot.ToyRobot;
import com.rea.toy.robot.commands.Command;
import com.rea.toy.robot.commands.LeftCommand;
import com.rea.toy.robot.commands.MoveCommand;
import com.rea.toy.robot.commands.ReportCommand;
import com.rea.toy.robot.commands.RightCommand;
import com.rea.toy.robot.process.commands.service.CommandProcessorService;
import com.rea.toy.robot.validations.CommandNotFoundException;
import com.rea.toy.robot.validations.InvalidCoordinatesException;


public class CommandProcessorServiceImpl implements CommandProcessorService
{
	
	private static String 	LEFT 	= "LEFT";
	private static String 	RIGHT 	= "RIGHT";
	private static String 	MOVE	= "MOVE";
	private static String 	REPORT  = "REPORT";
	private static String 	SPLIT_REGEX  = " ";
	
	
	
	public  void init()
	{	
			stringToCommandMap.put(LEFT, new LeftCommand());
			stringToCommandMap.put(RIGHT, new RightCommand());
			stringToCommandMap.put(MOVE, 	new MoveCommand());
			stringToCommandMap.put(REPORT, new ReportCommand());
	}
	
	private static Map<String, Command>  stringToCommandMap = new HashMap<String, Command>();
	
	
	@Override
	public  ToyRobot initializeToyRobot(String placeCommand)throws CommandNotFoundException ,InvalidCoordinatesException
	{
		String[] 						initialPlaceCommandSplit 		= placeCommand.split(SPLIT_REGEX);
		BiPredicate<String[], Integer>  validateArray = (array,i) -> array != null && array.length == i;
		
		if(validateArray.test(initialPlaceCommandSplit, 2))
		{
			String[] 		coordinatesAndDirection  = initialPlaceCommandSplit[1].split(",");
			if(validateArray.test(coordinatesAndDirection, 3))
			{
				return constructToyRobot(coordinatesAndDirection);
			}
			else
			{
				throw new CommandNotFoundException("Invalid Place Command ","001");
			}
		}
		else
		{
			throw new CommandNotFoundException("Invalid Place Command ","001");
		}
		
	}


	private ToyRobot constructToyRobot(String[] coordinatesAndDirection) throws InvalidCoordinatesException
	{
		TableTop        tableTop 				 = new TableTop();// By default this will initialize the 5 x 5 square top
		Coordinates   	coordinates 			 = new Coordinates(Integer.parseInt(coordinatesAndDirection[0]), 
												Integer.parseInt(coordinatesAndDirection[1]));
		Direction   	direction 				 = Direction.valueOf(coordinatesAndDirection[2]);
		if(tableTop.isWithinTableBoundry(coordinates))
		{
			return new ToyRobot(coordinates, direction, tableTop);
		}
		else
		{
			throw new InvalidCoordinatesException("Coordinates are off the table", "002");
		}
		
	}
	
	
	@Override
	public  Command populateCommand(String command) throws CommandNotFoundException
	{
		if(LEFT.equalsIgnoreCase(command))
		{
			return new LeftCommand();
		}
		else if(RIGHT.equalsIgnoreCase(command))
		{
			return new RightCommand();
		}
		else if (MOVE.equalsIgnoreCase(command))
		{
			return new MoveCommand();
		}
		else if(REPORT.equalsIgnoreCase(command))
		{
			return new ReportCommand();
		}
		else 
		{
			throw new CommandNotFoundException("Invalid Command ","001");
		}
	}
	
	

}
