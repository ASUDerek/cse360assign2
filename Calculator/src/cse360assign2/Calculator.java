package cse360assign2;


/**
 * 
 * @author 		Derek Allen
 * Class ID: 	312
 * Assignment 2
 * 
 * Calculator.java is a basic calculator program that returns the total
 * of the operations (add, subtract, multiply and divide).
 * 
 */

/**
 * Changes the total value in the calculator.  The functions are the 
 * basic mathematical operations (add, subtract, multiply and divide).  
 * The class records all of the operations in order for the user can
 * see which operations were used and when to produce the answer.
 * 
 *
 */ 
public class Calculator {

	/**
	 * Integer that represents the answer to the user input.
	 */
	private int total;
	
	/**
	 * String that holds all of the operations done when computing
	 * the total.
	 */
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		this.history = "0";
	}
	
	 /**
	  * Displays current value of the integer total in the Calculator object.
	  * @return The total of the calculator.
	  */
	public int getTotal () {
		return total;
	}
	
	
	/**
	 * Function to add the user input, held in the integer value, to the 
	 * integer total.
	 * @param value The user inputed value to be added to the integer total.
	 */
	public void add (int value) {
		this.total += value;
		this.history += (" + " + value);
	}
	
	/**
	 * Function to subtract the user input, held in the integer value, to 
	 * the integer total.
	 * @param value The user inputed value to be subtracted from the integer
	 * total.
	 */
	public void subtract (int value) {
		this.total -= value;
		this.history += (" - " + value);
		
		
	}
	
	/**
	 * Function to multiply the user input, held in the integer value, to 
	 * the integer total.
	 * @param value The user inputed value to be multiplied to the integer
	 * total.
	 */
	public void multiply (int value) {
		this.total *= value;
		this.history += (" * " + value);
	}
	
	/**
	 * Function to divide the total by the user input, held in integer 
	 * value.
	 * @param value The user inputed value that will divide the integer 
	 * total.
	 */
	public void divide (int value) {
		if(value != 0) {
			this.total /= value;
			this.history += (" / " + value);
		} else {	
			this.total = 0;
			this.history += (" / " + value);
		}
	}
	
	/**
	 * Function that returns a string with all of the operations the 
	 * calculator performed to get the answer.
	 * @return String that contains the all of the operations the 
	 * calculator performed to get the answer.
	 */
	public String getHistory () {
		return this.history;
	}
}