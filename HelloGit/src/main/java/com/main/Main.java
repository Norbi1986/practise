package com.main;

import com.calculator.AddNumber;
import com.calculator.MulNumber;

public class Main {
	private static AddNumber addNumber;
	private static MulNumber mulNumber;
	
	public static void main(String[] args) {
		addNumber = new AddNumber();
		mulNumber = new MulNumber();
		int addeNumberResult = addNumber.calculate(10, 5);
		int muledNumberResult = mulNumber.calculate(5, 5);
		System.out.println("Add Number Result: " + addeNumberResult);
		System.out.println("Muled Number Result: " + muledNumberResult);
	}

}
