/**
 * Name: Anna McDonald 1212743075
 * Class ID: RA5
 * Lecture: CSE360-70642 Wednesday 9:40-10:30 Assignment 2
 * Description: The AddingMachingTest class checks multiple test cases to 
 * 				see if the AddingMachine class works.
 */

package cse360assign2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AddingMachineTest {

	@Test
	void checkInstantiation()
	{
		AddingMachine constructor = new AddingMachine();
		assertNotNull(constructor);
	}
	
	@Test
	void checkAddPosNum() 
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		assertEquals("Addition does not work", 4 , myCalculator.getTotal());
	}
	
	@Test
	void checkAddNegNum() 
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(-5);
		assertEquals("Addition does not work", -5 , myCalculator.getTotal());
	}
	
	@Test
	void checkSubPosNum()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.subtract(2);
		assertEquals("Subtraction does not work", -2, myCalculator.getTotal());
	}
	
	@Test
	void checkSubNegNum()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.subtract(-7);
		assertEquals("Subtraction does not work", 7, myCalculator.getTotal());
	}
	
	@Test
	void checkString()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		boolean stringMatch = "0 + 5".equals(myCalculator.toString());
		assertEquals(true, stringMatch);
	}
	
	@Test 
	void multipleOperations()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		myCalculator.subtract(7);
		myCalculator.subtract(8);
		myCalculator.add(-7);
		boolean stringMatch = "0 + 5 - 7 - 8 + -7".equals(myCalculator.toString());
		assertEquals(true, stringMatch);
	}
	
}
