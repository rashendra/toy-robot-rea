package com.rea.toy.robot;

import org.junit.Assert;
import org.junit.Test;

public class TableTopTest 
{
	
	@Test
	public void testValidCoordinations()
	{
		//Given the default table 5 x 5 square
		TableTop tableTop = new TableTop();
		
		//when 
		Coordinates coordinates = new Coordinates(4, 0);
		
		//Then 
		Assert.assertTrue(tableTop.isWithinTableBoundry(coordinates));
		
	}
	
	
	@Test 
	public void testInvalidXCoordinatesOutSideTopRight()
	{
		//Given the default table 5 x 5 square
		TableTop tableTop = new TableTop();
				
		//when 
		Coordinates coordinates = new Coordinates(6, 0);
				
		//Then 
		Assert.assertFalse(tableTop.isWithinTableBoundry(coordinates));
				
	}
	
	@Test 
	public void testInvalidCoordinatesOutSideLeftBottom()
	{
		//Given the default table 5 x 5 square
		TableTop tableTop = new TableTop();
						
		//when 
		Coordinates coordinates = new Coordinates(-1, 0);
						
		//Then 
		Assert.assertFalse(tableTop.isWithinTableBoundry(coordinates));
	}
	
	@Test 
	public void testInvalidYCoordinatesOutsideTopRight()
	{
		//Given the default table 5 x 5 square
		TableTop tableTop = new TableTop();
								
		//when 
		Coordinates coordinates = new Coordinates(1, 6);
								
		//Then 
		Assert.assertFalse(tableTop.isWithinTableBoundry(coordinates));
	}
	
	
	@Test 
	public void testInvalidYCoordinatesOutsideLeftBottom()
	{
		//Given the default table 5 x 5 square
		TableTop tableTop = new TableTop();
								
		//when 
		Coordinates coordinates = new Coordinates(1, -6);
								
		//Then 
		Assert.assertFalse(tableTop.isWithinTableBoundry(coordinates));
	}
	
	
	
	

}
