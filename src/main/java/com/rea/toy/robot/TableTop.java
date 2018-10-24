package com.rea.toy.robot;

public class TableTop 
{
   private Coordinates  topRightCoordinates   = new Coordinates(4, 4);
   
   private Coordinates  leftBottomCoordinates = new Coordinates(0, 0);
   
   
   
   
   public TableTop(Coordinates topRightCoordinates) 
   {
		super();
		this.topRightCoordinates = topRightCoordinates;
   }

   public TableTop() {
	   super();
   }

/*
    * Check this one when when a PLACE command is given 
    * Examples -1,-1
    * 1,1
    * 5,5
    * 
    * */
   public Boolean isWithinTableBoundry(final Coordinates coordinates)
   {
	   return this.topRightCoordinates.isCoordinatesWithinBounds(coordinates) 
			   	&& this.leftBottomCoordinates.isCoordinatesOutsideBounds(coordinates);
   }
   
}
