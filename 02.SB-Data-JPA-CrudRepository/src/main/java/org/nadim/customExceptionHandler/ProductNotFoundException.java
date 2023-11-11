package org.nadim.customExceptionHandler;

public class ProductNotFoundException extends RuntimeException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(){
		super();
	}
	
	public ProductNotFoundException(String exceptionMsg){
		super(exceptionMsg);
	}
}
