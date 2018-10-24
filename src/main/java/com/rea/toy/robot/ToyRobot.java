package com.rea.toy.robot;

import java.util.List;

import com.rea.toy.robot.commands.Command;

public class ToyRobot 
{
	private Coordinates currentCoordinates;
	private Direction   currentDirection;
	private TableTop    tableTop;
	
	
	

	public ToyRobot(final Coordinates coordinates,final Direction direction,final TableTop tableTop) {
		super();
		this.currentCoordinates 	= coordinates;
		this.currentDirection 		= direction;
		this.tableTop 		= tableTop;
	}
	
	
	
	public void processCommand(List<Command>  commands)
	{
		commands.forEach(c-> c.execute(this));
	}

	public void moveForward()
	{
		Coordinates coordinatesAfterMove = currentCoordinates.newCoordinatesForMove(currentDirection.getNextStepOnXAxis(), currentDirection.getNextStepOnYAxis());
		if(tableTop.isWithinTableBoundry(coordinatesAfterMove))
		{
			currentCoordinates  = coordinatesAfterMove;
		}
	}
	
	public void turnLeft()
	{
		this.currentDirection = this.currentDirection.left();
	}
	
	public void turnRight()
	{
		this.currentDirection = this.currentDirection.right();
	}
	
	public String report()
	{
		String report = currentCoordinates.toString() + ","+ currentDirection.toString();
		System.out.println(report);
		return report;
	}
	
}
