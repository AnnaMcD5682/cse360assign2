/**
 * Name: Anna McDonald 1212743075
 * Class ID: RA5
 * Lecture: CSE360-70642 Wednesday 9:40-10:30 Assignment 2
 * Description: The AddingMachine class performs add and subtract 
 * 				operations and keeps a history of the operations
 * 				that occur.		
 */

package cse360assign2;

public class AddingMachine 
{
	private int total;
	private String operationTracker;
	
	/**
	 * Constructor for Adding Machine. This sets total to zero and the
	 * operationTracker to "0". operationTracker starts at "0" since the
	 * history of the operations starts at 0.
	 */
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
		operationTracker = "0";
	}
	
	/**
	 * getTotal() receives the value of total and returns the value.
	 * @return total	total is the value after add or subtract 
	 * 					operations have been made. If no operations have 
	 *					been made then the total is 0 by default.
	 */
	public int getTotal() 
	{
		return total;
	}
	
	/**
	 * add does the add operation. The stored total is taken and added with
	 * the inputed value to create the new total.
	 * @param value		value is the number that is being added to total.
	 */
	public void add (int value) 
	{
		total += value;
		operationTracker += " + " + value;
	}
	
	/**
	 * subtract does the subtract operation. The stored total is taken and
	 * subtracted with the inputed value to create the new total.
	 * @param value		value is the number that is being 
	 * 					subtracted to the total.
	 */
	public void subtract (int value) 
	{
		total -= value;
		operationTracker += " - " + value;
	}
	
	/**
	 * toString() keeps track of the operations that have occurred.
	 * @return operationTracker		operationTracker returns the history
	 * 								of operations that have occurred.
	 */
	public String toString() 
	{
		return operationTracker;
	}
	
	/**
	 * clear() resets the values of total and operationTracker back to zero.
	 * The values are set back to zero so that the total and string 
	 * operationTracker can begin keeping track of values as if no
	 * operations have occurred.
	 */
	public void clear()
	{
		total = 0;
		operationTracker = "0";
	}
	
}
