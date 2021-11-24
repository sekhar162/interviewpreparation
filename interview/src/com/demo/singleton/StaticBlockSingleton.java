package com.demo.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception while creating instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}

}
