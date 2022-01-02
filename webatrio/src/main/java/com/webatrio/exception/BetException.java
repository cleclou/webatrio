package com.webatrio.exception;

public class BetException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BetException(String message) {
		super(message);
	}

	public BetException(String message, Throwable cause) {
		super(message, cause);
	}

}
