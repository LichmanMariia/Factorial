package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		int number = 16;
		FactorialInit factorialInit = new FactorialInit();
		int factorial = factorialInit.getFactorial(number);
		if(number>=0 && number != 10) {
		System.out.println(factorial);
		}else {
		System.out.println("Incorrect enter number!");
		}

	}
	}

