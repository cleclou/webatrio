package com.webatrio.exception;

public class DataAccessException extends BetException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataAccessException(String message) {
		super(message);
	}

	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
	}

}
