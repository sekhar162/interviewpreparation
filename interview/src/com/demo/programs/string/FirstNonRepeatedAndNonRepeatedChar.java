package com.demo.programs.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedAndNonRepeatedChar {

	public static void main(String[] args) {
		// #1 Using without collections
		String str = "abbcddeefghh";
		// First Non repeated char
		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					unique = false;

				}

			}
			if (unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}

		// First Repeated char
		for (int i = 0; i < str.length(); i++) {
			boolean unique = false;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					unique = true;

				}

			}
			if (unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}

		// #2 Using Collections Map.

		char[] chars = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (Character ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int value = map.get(ch);
				map.put(ch, value + 1);
			}

		}

		// for non repeated character
		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() != 1) {
				System.out.println("repeated character is = " + entry.getKey() + " and count is = " + entry.getValue());
				break;
			}
		}

		// for non repeated character
		for (Entry<Character, Integer> entry2 : map.entrySet()) {

			if (entry2.getValue() == 1) {
				System.out.println(
						"not repeated character is= " + entry2.getKey() + " and  count is = " + entry2.getValue());
				break;
			}

		}

		String str2 = "daddy";
		char[] chars2 = str2.toCharArray();
		Map<Character, Integer> map2 = new LinkedHashMap<>();
		StringBuilder sb3 = new StringBuilder();
		Map<Character, Integer> map3 = new LinkedHashMap<>();

		for (Character ch : chars2) {
			if (!map2.containsKey(ch)) {
				map2.put(ch, 1);
			} else {
				int value = map2.get(ch);
				map2.put(ch, value + 1);
			}
		}

		for (Entry<Character, Integer> entry : map2.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(sb3.append(entry.getKey()));
			}
		}

	}
}
