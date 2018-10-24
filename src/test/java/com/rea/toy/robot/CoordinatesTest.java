package com.rea.toy.robot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoordinatesTest 
{
	
	private Coordinates coordinate;
	
	private Coordinates  leftBottomCoordinates ;
	
	@Before
	public void init()
	{
		coordinate = new Coordinates(4, 4);
		leftBottomCoordinates = new Coordinates(0, 0);
	}
	
	@Test 
	public void    testIsCoordinatesWithinBoundsForValidCoordinates()
	{
		//Given
		Coordinates coordinateToTest = new Coordinates(4, 4);
		
		//when
		boolean coordinatesWithinBounds = coordinate.isCoordinatesWithinBounds(coordinateToTest);
		
		//Then
		Assert.assertTrue(coordinatesWithinBounds);
	}
	
	@Test
	public void testIsCoordinatesWithinBoundsForInvalidCoordinates()
	{
		//Given
		Coordinates coordinateToTest = new Coordinates(5, 5);
		
		//when
		boolean coordinatesWithinBounds = coordinate.isCoordinatesWithinBounds(coordinateToTest);
		
		//Then
		Assert.assertFalse(coordinatesWithinBounds);
	}
	
	@Test
	public void testIsXCoordinateWithinBoundsForValidXCoordinate()
	{
		//Given
		Integer xCoordinate = 4;
		
		//when 
		Boolean xCoordinateWithinBounds = coordinate.isXCoordinateWithinBounds(xCoordinate);
		
		//then 
		Assert.assertTrue(xCoordinateWithinBounds);
		
	}
	
	@Test
	public void testIsXCoordinateWithinBoundsForInvalidXCoordinate()
	{
		//Given
		Integer xCoordinate = 5;
				
		//when 
		Boolean xCoordinateWithinBounds = coordinate.isXCoordinateWithinBounds(xCoordinate);
				
		//then 
		Assert.assertFalse(xCoordinateWithinBounds);
	}
	
	
	@Test
	public void testisYCoordinateWithinBoundsForValidYCoordinate()
	{
		//Given
		Integer yCoordinate = 4;
						
		//when 
		Boolean yCoordinateWithinBounds = coordinate.isYCoordinateWithinBounds(yCoordinate);
						
		//then 
		Assert.assertTrue(yCoordinateWithinBounds);
		
	}
	
	@Test 
	public void testisYCoordinateWithinBoundsForInvalidYCoordinate()
	{
		//Given
		Integer yCoordinate = 5;
								
		//when 
		Boolean yCoordinateWithinBounds = coordinate.isYCoordinateWithinBounds(yCoordinate);
								
		//then 
		Assert.assertFalse(yCoordinateWithinBounds);
	}
	
	
	@Test 
	public void testisCoordinatesOutsideBoundsForOutsideCoordinates()
	{
		//Given
		Coordinates coordinateToTest = new Coordinates(4, 4);
		
		//when
		boolean coordinatesOutsideBounds = leftBottomCoordinates.isCoordinatesOutsideBounds(coordinateToTest);
		
		//Then
		Assert.assertTrue(coordinatesOutsideBounds);	
	}
	

	
	@Test 
	public void testIsXCoordinateOutsideBoundsForOutSideXCoordinate()
	{	
		//Given
		Integer xCoordinateOutside = 4;
		
		//When
		Boolean xCoordinateOutsideBounds = coordinate.isXCoordinateOutsideBounds(xCoordinateOutside);
		
		//Then
		Assert.assertTrue(xCoordinateOutsideBounds);
		
	}
	
	
	@Test 
	public void isYCoordinateOutsideBoundsForInsideYCoordinate()
	{
		//Given
		Integer yCoordinate = 3;
		//When 
		Boolean yCoordinateOutsideBounds = leftBottomCoordinates.isYCoordinateOutsideBounds(yCoordinate);
		//Then
		Assert.assertTrue(yCoordinateOutsideBounds);
	}
	
	

}
