package com.rea.toy.robot.process.commands;

import java.util.Scanner;

import com.rea.toy.robot.ToyRobot;
import com.rea.toy.robot.commands.Command;
import com.rea.toy.robot.process.commands.service.impl.CommandProcessorServiceImpl;
import com.rea.toy.robot.validations.CommandNotFoundException;
import com.rea.toy.robot.validations.InvalidCoordinatesException;

public class RunCommandLineApplication 
{
	
	private static String 	PLACE   = "PLACE";
	
	public static void main(String[] args) 
	{
		System.out.println("Enter your Commands :: (Ctrl + D / C to exist the programme)");
		CommandProcessorServiceImpl commandProcessorService 	= new CommandProcessorServiceImpl();
		Scanner 						scanner 					= new Scanner(System.in);
		ToyRobot  					toyRobot 				= null;
		
		try
		{
			while(scanner.hasNextLine())
			{
				String command = scanner.nextLine().trim();
				try
				{
					if(command.startsWith(PLACE))
					{
						toyRobot = commandProcessorService.initializeToyRobot(command);
					}
					else if (toyRobot != null && !command.startsWith(PLACE))
					{
						Command commandObj = commandProcessorService.populateCommand(command);
						commandObj.execute(toyRobot);
					}
				}
				catch(CommandNotFoundException | InvalidCoordinatesException e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
		finally
		{
			System.out.println("Exiting the programme ");
			scanner.close();
		}
		
	}
	

}
