package com.demo.programs.string;

import java.util.Scanner;

public class CapitalizeFirstLetterOfEachString {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter String to capitalize words");
		String str = scr.nextLine();

		String[] strArray = str.split(" ");

		for (int i = 0; i < strArray.length; i++) {
			char[] charArray = strArray[i].toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				if (j == 0) {
					System.out.print(Character.toUpperCase(charArray[j]));
				} else {
					System.out.print(charArray[j]);
				}

			}
			System.out.print(" ");

		}

	}
}