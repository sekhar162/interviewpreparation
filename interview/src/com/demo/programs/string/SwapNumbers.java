package com.demo.programs.string;

// Swap 2 numbers without using 3rd variable.
public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a value is " + a);
		System.out.println("b value is " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a value is " + a);
		System.out.println("b value is " + b);
	}
}
