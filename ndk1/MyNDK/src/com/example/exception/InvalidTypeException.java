package com.example.exception;

@SuppressWarnings("serial")
public class InvalidTypeException extends Exception{

	public InvalidTypeException() {
		super();
	}
	
	public InvalidTypeException(String strDetailMessage, Throwable throwable) {
		super(strDetailMessage, throwable);
	}
	
	public InvalidTypeException(String strDetailMessage) {
		super(strDetailMessage);
	}
	
	public InvalidTypeException(Throwable throwable) {
		super(throwable);
	}
}
