package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialInitTest {

	@Test
	public void test() {
		
		FactorialInit factorialInit = new FactorialInit();
		int factorial = factorialInit.getFactorial(4);
		assertEquals(24, factorial);
	}

}
