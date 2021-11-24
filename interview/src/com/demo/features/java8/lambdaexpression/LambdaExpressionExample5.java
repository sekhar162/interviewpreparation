package com.demo.features.java8.lambdaexpression;

interface Add {
	int add(int a, int b);
}

public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add1 = (a, b) -> a + b;
		System.out.println(add1.add(10, 20));
		Add add2 = (a, b) -> {
			System.out.println(a + b);
			return a + b;
		};
		add2.add(10, 20);
	}

}
