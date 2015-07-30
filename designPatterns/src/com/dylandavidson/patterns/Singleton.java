package com.dylandavidson.patterns;

public class Singleton {

	private static Singleton instance = null;
	private static String NAME = "my singleton";
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
	}
}
