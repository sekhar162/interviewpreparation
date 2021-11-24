package com.demo.programs.string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String word = "Reddi";
// Using Java 8
		StringBuilder sb1 = new StringBuilder();
		word.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);

// Using  indexOf() and charAt()
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);
			int index = word.indexOf(ch, i + 1);
			if (index == -1) {
				sb2.append(ch);

			}
		}
		System.out.println(sb2);

// Using Character Array // not working.

		StringBuilder sb3 = new StringBuilder();
		char ch[] = word.toCharArray();
		boolean repeated;
		for (int i = 0; i < ch.length; i++) {
			repeated = false;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					repeated = true;
					break;
				}

			}
			if (!repeated) {
				sb3.append(ch[i]);
			}

		}
		System.out.println(sb3);

// Using Set interface
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < word.length(); i++) {
			set.add(word.charAt(i));
		}
		for (Character c : set) {
			sb4.append(c);
		}
		System.out.println(sb4);

	}
}
