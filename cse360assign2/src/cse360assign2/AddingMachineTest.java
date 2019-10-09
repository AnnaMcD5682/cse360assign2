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
	void checkAdd() 
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		assertEquals("Addition does not work", 4 , myCalculator.getTotal());
	}
	
	@Test
	void checkSub()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.subtract(2);
		assertEquals("Subtraction does not work", -2, myCalculator.getTotal());
	}
	
	@Test
	void checkString()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		boolean stringMatch = "0 + 5".equals(myCalculator.toString());
		assertEquals(true, stringMatch);
	}
	
}
