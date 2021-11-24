package com.demo.programs.string;

	import java.util.Scanner;

	public class CountFrequencyOfEachVowelInString {

		public static void main(String[] args) {
	// welcome to java
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter sentence to remove perticular character");
			String sentense = sc.nextLine();
			char[] chars=sentense.toCharArray();
	        int a=0; int e=0; int i=0; int o=0; int u=0;
			for (int j=0; j<=chars.length-1;j++) {
			     if (chars[j]== 'a') {
					a++;
				} else if(chars[j]== 'e') {
					e++;
				} else if(chars[j] == 'i') {
				
					i++;
				} else if(chars[j] == 'o') {
					o++;
				} else if(chars[j] == 'u') { 
					u++;
				}
			
			}
			System.out.println("the occurences of a are "+a);
			System.out.println("the occurences of e are "+e);
			System.out.println("the occurences of i are "+i);
			System.out.println("the occurences of o are "+o);
			System.out.println("the occurences of u are "+u);
		}
	}



