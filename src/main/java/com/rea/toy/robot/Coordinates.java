package com.rea.toy.robot;


// TODO: Auto-generated Javadoc
/**
 * The Class Coordinates.
 */
public class Coordinates 
{
	
	/** The x cordinates. */
	private Integer  xCordinates;
	
	/** The y cordinates. */
	private Integer  yCordinates;
	
	
	/**
	 * Instantiates a new coordinates.
	 *
	 * @param xCordinates the x cordinates
	 * @param yCordinates the y cordinates
	 */
	public Coordinates(final Integer xCordinates,final Integer yCordinates) 
	{
		this.xCordinates = xCordinates;
		this.yCordinates = yCordinates;
	}
	
	/**
	 * Checks if is coordinates within bounds.
	 * Both coordinates have to be inside the top right coordinates 
	 * @param coordinates the coordinates
	 * @return true, if is coordinates within bounds
	 */
	public boolean isCoordinatesWithinBounds(final Coordinates coordinates)
	{
		return isXCoordinateWithinBounds(coordinates.xCordinates) && isYCoordinateWithinBounds(coordinates.yCordinates);
	}
	
	
	/**
	 * Checks if is X coordinate within bounds.
	 *
	 * @param xCoordinate the x coordinate
	 * @return the boolean
	 */
	public Boolean isXCoordinateWithinBounds(Integer xCoordinate)
	{
		return  xCoordinate <= this.xCordinates;
	}
	
	/**
	 * Checks if is Y coordinate within bounds.
	 *
	 * @param yCoordinate the y coordinate
	 * @return the boolean
	 */
	public Boolean isYCoordinateWithinBounds(Integer yCoordinate)
	{
		return yCoordinate <= this.yCordinates;
	}
	
	
	
	/**
	 * Checks if is coordinates outside bounds.
	 * Both coordinates have to be outside the leftBottom
	 * @param coordinates the coordinates
	 * @return the boolean
	 */
	public Boolean isCoordinatesOutsideBounds(final Coordinates coordinates)
	{
		return isXCoordinateOutsideBounds(coordinates.xCordinates) && isYCoordinateOutsideBounds(coordinates.yCordinates);
	}
	
	
	/**
	 * Checks if is X coordinate outside bounds.
	 *
	 * @param xCoordinate the x coordinate
	 * @return the boolean
	 */
	/*
	 * Use to compare with the leftBottom 
	 * */
	public Boolean isXCoordinateOutsideBounds(Integer xCoordinate)
	{
		return xCoordinate >= this.xCordinates;
	}
	
	/**
	 * Checks if is Y coordinate outside bounds.
	 * Use to compare with the left botton
	 * @param yCoordinate the y coordinate
	 * @return the boolean
	 */
	public Boolean isYCoordinateOutsideBounds(Integer yCoordinate)
	{
		return yCoordinate >= this.yCordinates;
	}
	
	/**
	 * Return new coordinates.
	 *
	 * @param stepXCoordinate the step X coordinate
	 * @param stepYCoordinate the step Y coordinate
	 * @return the coordinates
	 */
	public Coordinates  returnNewCoordinates(Integer stepXCoordinate, Integer stepYCoordinate)
	{
		return new Coordinates(this.xCordinates+ stepXCoordinate, this.yCordinates+ stepYCoordinate);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return  xCordinates +","+ yCordinates;
	}
	
	/**
	 * New coordinates for move.
	 * When passing coordinates , should should check before passing the coordinates are within the boundry and if so should
	 * pass the correct coordinates based on the direction 
	 * @param xCoordinate the x coordinate
	 * @param yCoordinate the y coordinate
	 * @return the coordinates
	 */
	public Coordinates  newCoordinatesForMove(Integer xCoordinate, Integer  yCoordinate)
	{
		return new Coordinates(this.xCordinates+ xCoordinate, this.yCordinates+ yCoordinate);
	}
	
	

}
