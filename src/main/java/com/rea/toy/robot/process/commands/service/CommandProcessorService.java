package com.rea.toy.robot.process.commands.service;

import com.rea.toy.robot.ToyRobot;
import com.rea.toy.robot.commands.Command;
import com.rea.toy.robot.validations.CommandNotFoundException;

// TODO: Auto-generated Javadoc
/**
 * The Interface CommandProcessorService.
 */
public interface CommandProcessorService 
{
	
	/**
	 * Initialize toy robot.
	 *
	 * @param placeCommand the place command
	 * @return the toy robot
	 */
	ToyRobot initializeToyRobot(String placeCommand);

	/**
	 * Populate command.
	 *
	 * @param command the command
	 * @return the command
	 * @throws CommandNotFoundException the command not found exception
	 */
	Command populateCommand(String command) throws CommandNotFoundException;
	
	
}
