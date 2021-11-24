package com.demo.programs.string;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
// method 1
		String str = "Reddi";
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < chars.length; i++) {
			if (!map.containsKey(chars[i])) {
				map.put(chars[i], 1);
			} else {
				int value = map.get(chars[i]);
				map.put(chars[i], value + 1);
			}
		}
		System.out.println(map);
// method 2
		// take string.convert that string to character array.take hashmap and iterate
		// the characters and insert the values in to the map if the key not present in
		// the map else increase the value by 1 by getting the value of the key.
		String str2 = "Reddi";
		char[] chars2 = str2.toCharArray();
		Map<Character, Integer> map2 = new LinkedHashMap<>();
		for (Character ch : chars2) {
			if (!map2.containsKey(ch)) {
				map2.put(ch, 1);
			} else {
				int value2 = map2.get(ch);
				map2.put(ch, value2 + 1);

			}

		}
		System.out.println(map2);

		//#3Scenario# suppose if u have 100 chocolates of different type in a bucket. tell me each type how many are there.

		List<String> listOfChocolates = new ArrayList<>();
		listOfChocolates.add("Dairy Milk");
		listOfChocolates.add("Perk");
		listOfChocolates.add("5 Star");
		listOfChocolates.add("Perk");
		listOfChocolates.add("Bournville");
		listOfChocolates.add("Dairy Milk Silk");
		listOfChocolates.add("MilkyBar");
		listOfChocolates.add("KitKat");
		listOfChocolates.add("Munch");
		listOfChocolates.add("Bar One");
		listOfChocolates.add("Bar One");
		listOfChocolates.add("MilkyBar");
		listOfChocolates.add("KitKat");
		listOfChocolates.add("Munch");
		listOfChocolates.add("Perk");
		listOfChocolates.add("Perk");
		listOfChocolates.add("Perk");
		listOfChocolates.add("Perk");
		listOfChocolates.add("Bournville");
		Map<String, Integer> map3 = new LinkedHashMap<String, Integer>();
		for (String chocolate : listOfChocolates) {

			if (!map3.containsKey(chocolate)) {
				map3.put(chocolate, 1);
			} else {
				int value = map3.get(chocolate);
				map3.put(chocolate, value + 1);
			}
		}
		System.out.println(map3);

	}
}
