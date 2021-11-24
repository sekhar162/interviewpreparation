package com.demo.programs.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Find the sum of all numbers which contain '1' or '2' among a list of Strings.  
public class Scenario1 {

	public static void main(String[] args) {
		List<String> nums = new ArrayList<String>();
		int count = 0;
		List<String> numbers = Arrays.asList("32", "75", "100", "49");

		for (String number : numbers) {
			char[] chars = number.toCharArray();
			for (int i = 0; i < chars.length; i++) {

				if (String.valueOf(chars[i]).equals(String.valueOf(1))
						|| String.valueOf(chars[i]).contentEquals(String.valueOf(2))) {
					nums.add(number);
					break;
				}

			}
		}

		for (String n : nums) {
			int val = Integer.parseInt(n);
			count = val + count;

		}
		System.out.println(count);

	}

}
