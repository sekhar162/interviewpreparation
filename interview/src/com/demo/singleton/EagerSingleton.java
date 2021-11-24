package com.demo.singleton;

public class EagerSingleton {
	/*
	 * private static EagerSingleton instance = new EagerSingleton();
	 * 
	 * // private constructor private EagerSingleton() { }
	 * 
	 * public static EagerSingleton getInstance() { return instance; } public void
	 * display() { System.out.println("EagerSingleton object"); }
	 */

	// static member which has instance of the singleton class
	public static final EagerSingleton instance = new EagerSingleton();

	// private Constructor
	private EagerSingleton() {

	}

	// static factory method
	public static EagerSingleton getInstance() {
		System.out.println(instance.toString());
		return instance;
	}
}
