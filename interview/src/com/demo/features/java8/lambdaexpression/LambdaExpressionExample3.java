package com.demo.features.java8.lambdaexpression;

interface Fun {
	String fun(String str);
}

public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		Fun fu = str -> {
			System.out.println(str);
			return str;
		};
		fu.fun("welcome");
	}

}
