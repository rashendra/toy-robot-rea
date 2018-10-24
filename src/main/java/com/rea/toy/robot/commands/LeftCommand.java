package com.rea.toy.robot.commands;

import com.rea.toy.robot.ToyRobot;

public class LeftCommand implements Command{

	

	@Override
	public void execute(ToyRobot toyRobot) 
	{
		toyRobot.turnLeft();
	}

}
