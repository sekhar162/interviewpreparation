package com.demo.programs.string;

import java.util.Scanner;

// Remove perticular character from the sentence and frequency(How many times the character is repeated) of that character.
public class RemoveCharacterFromString {

	public static void main(String[] args) {
// welcome to java
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter sentence to remove perticular character");
		String sentense = sc.nextLine();

		Scanner scr = new Scanner(System.in);
		System.out.println("please enter sentence to remove perticular character");
		String ch = scr.nextLine();
		String[] words = sentense.split(" ");
		int count = 0;
		for (int i = 0; i <= words.length - 1; i++) {
			char[] wordInCharacter = words[i].toCharArray();
			for (int j = 0; j <= wordInCharacter.length - 1; j++) {
				if (wordInCharacter[j] == ch.codePointAt(0)) {
					System.out.print("");
					count++;
				} else {
					System.out.print(wordInCharacter[j]);
				}

			}
			System.out.print(" ");

		}
		System.out.println(count);
	}
}
