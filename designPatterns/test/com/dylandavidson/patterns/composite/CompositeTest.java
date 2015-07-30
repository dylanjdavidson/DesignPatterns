package com.dylandavidson.patterns.composite;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompositeTest {

	
	
	@Test
	public void test() {
		Composite root = new Composite();
		root.add(new Leaf1000());
		root.add(new Leaf1000());
		root.add(new Leaf2000());
		Composite comp2 = new Composite();
		root.add(comp2);
		
		Composite comp3 = new Composite();
		comp2.add(comp3);
		Composite comp4 = new Composite();
		comp2.add(comp4);
		
		comp3.add(new Leaf2000());
		comp3.add(new Leaf2000());
		comp4.add(new Leaf1000());
		comp4.add(new Leaf1000());
		
		root.sayHello();
		root.sayGoodbye();
	}

}
