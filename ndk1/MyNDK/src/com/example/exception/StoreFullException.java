package com.example.exception;

@SuppressWarnings("serial")
public class StoreFullException extends RuntimeException {

	 public StoreFullException() {
	        super();
	    }

	    public StoreFullException(String strDetailMessage,
	                    Throwable throwable) {
	        super(strDetailMessage, throwable);
	    }

	    public StoreFullException(String strDetailMessage) {
	        super(strDetailMessage);
	    }

	    public StoreFullException(Throwable throwable) {
	        super(throwable);
	    }
}
