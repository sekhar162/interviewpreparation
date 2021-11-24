package com.demo.programs.string;

import java.util.Scanner;

// write a program in java to reverse only words of a string.
public class StringWordsReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter String that u want to reverse");
		String str = sc.nextLine();

		String[] strArray = str.split(" ");

		for (int i = 0; i <= strArray.length - 1; i++) {
			char[] charStr = strArray[i].toCharArray();
			for (int j = charStr.length - 1; j >= 0; j--) {
				System.out.print(charStr[j]);
			}
			System.out.print(" ");
		}
	}

}
