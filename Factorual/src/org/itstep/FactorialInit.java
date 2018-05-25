package org.itstep;

public class FactorialInit {

	public int getFactorial(int number) {
		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
