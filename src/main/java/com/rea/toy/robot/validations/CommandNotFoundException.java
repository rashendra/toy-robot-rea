package com.rea.toy.robot.validations;

public class CommandNotFoundException extends RuntimeException
{

	private static final long serialVersionUID = 1L;
	
	private String errorCode;

	public CommandNotFoundException(String message, String errorCode)
	{
	   super(message);
	   this.errorCode = errorCode;
	}

	String getErrorCode() 
	{
	   return errorCode;
	}

}
