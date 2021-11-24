package com.demo.features.java8.lambdaexpression;

interface FunctionalInterface {
	void welcome();

}

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		FunctionalInterface inter=new FunctionalInterface() {
			
			@Override
			public void welcome() {
			System.out.println("welcome");
				
			}
		};
		inter.welcome();
	}
}
