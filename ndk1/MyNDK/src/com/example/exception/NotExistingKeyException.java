package com.example.exception;

@SuppressWarnings("serial")
public class NotExistingKeyException extends Exception{

	public NotExistingKeyException() {
        super();
    }
	
	public NotExistingKeyException(String strDetailMessage, Throwable throwable) {
		super(strDetailMessage, throwable);
	}
	
    public NotExistingKeyException(String strDetailMessage) {
        super(strDetailMessage);
    }

    public NotExistingKeyException(Throwable throwable) {
        super(throwable);
    }
}
