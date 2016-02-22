package cse360assign3;

/** 
 * A calculator with the four primary arithmetic operators and a running total and history.
 * 
 * @author Samuel Friedman
 * 
 * @version February 22, 2016
 * 
 */
public class Calculator {

	private int total;
	
	/** 
	 * Create a calculator and initialize total to 0.
	 * 
	 * @param none
	 *  
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** 
	 * Get the value stored in total.
	 * 
	 * @param none
	 * 
	 * @return total
	 *  
	 */
	public int getTotal () {
		return 0;
	}
	
	/** 
	 * Add a value to the total.
	 * 
	 * @param value number to be added to the total
	 *  
	 */
	public void add (int value) {
		
	}
	
	/** 
	 * Subtract a value from the total.
	 * 
	 * @param value number to be subtracted from the total
	 * 
	 */
	public void subtract (int value) {
		
	}
	
	/** 
	 * Multiply the total by a given value.
	 * 
	 * @param value number by which we will multiply the total
	 * 
	 */
	public void multiply (int value) {
		
	}
	
	/** 
	 * Divide the total by a given value.
	 * 
	 * @param value number by which we will divide the total
	 * 
	 */
	public void divide (int value) {
		
	}
	
	/** 
	 * Return a string of the history of the calculator's arithmetic
	 * 
	 * @param none
	 * 
	 * @return arithmetic done by calculator so far
	 * 
	 */
	public String getHistory () {
		return "";
	}
}