package com.rea.toy.robot;


public enum Direction 
{
	
	 NORTH(0,1) {
	        @Override
	        public Direction left() {
	            return WEST;
	        }

	        @Override
	        public Direction right() {
	            return EAST;
	        }
	    },

	    SOUTH(0,-1) {
	        @Override
	        public Direction right() {
	            return WEST;
	        }

	        @Override
	        public Direction left() {
	            return EAST;
	        }
	    },

	    EAST(1,0) {
	        @Override
	        public Direction right() {
	            return SOUTH;
	        }

	        @Override
	        public Direction left() {
	            return NORTH;
	        }
	    },

	    WEST(-1,0) {
	        @Override
	        public Direction right() {
	            return NORTH;
	        }

	        @Override
	        public Direction left() {
	            return SOUTH;
	        }
	    };
	
	
	
	private final Integer nextStepOnXAxis;
	
	private final Integer nextStepOnYAxis;
	
	
	
	private Direction(Integer nextStepOnXAxis, Integer nextStepOnYAxis) 
	{
		this.nextStepOnXAxis = nextStepOnXAxis;
		this.nextStepOnYAxis = nextStepOnYAxis;
	}
	
	public abstract  Direction  right();
	public abstract  Direction  left();
	

	public Integer getNextStepOnXAxis() {
		return this.nextStepOnXAxis;
	}

	public Integer getNextStepOnYAxis() {
		return this.nextStepOnYAxis;
	}
	
	
	
	
	
	

}
