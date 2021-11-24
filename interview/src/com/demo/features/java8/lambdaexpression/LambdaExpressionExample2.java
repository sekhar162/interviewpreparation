package com.demo.features.java8.lambdaexpression;

interface FunctionalInter {
	void welcome();
}

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		FunctionalInter inter = () -> {
			System.out.println("welcome");
		};
		inter.welcome();
	}
}
