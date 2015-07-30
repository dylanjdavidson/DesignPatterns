package com.dylandavidson.patterns.composite;

public class Leaf2000 implements Component{
	private final int id;
	private static int baseId=0;
	
	public Leaf2000(){
		id = 2000 + baseId++;
	}
	@Override
	public void sayHello() {
		System.out.println("Hello from " + id);
	}

	@Override
	public void sayGoodbye() {
		System.out.println("Goodbye from " + id);
	}

	@Override
	public int getId() {
		return id;
	}

}
