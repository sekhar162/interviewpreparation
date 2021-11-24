package com.demo.features.java8.lambdaexpression;

interface Func {
	String wantFun(int age, String name);
}

public class LambdaExpressionExample4 {

	public static void main(String[] args) {
		Func fun = (age, name) -> {
			String sentence = name + " age is " + age;
			System.out.println(sentence);
			return sentence;
		};
		fun.wantFun(3, "chandhana");
	}

}
