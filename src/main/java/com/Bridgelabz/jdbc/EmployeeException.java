package com.Bridgelabz.jdbc;

/**
 * Purpose: This class is used for creting Costume Exception
 * 
 * @author Kishlay Kishan
 *
 */
public class EmployeeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeException(String message) {
		super(message);
	}
}