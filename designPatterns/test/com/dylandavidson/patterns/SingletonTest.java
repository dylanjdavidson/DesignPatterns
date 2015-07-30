package com.dylandavidson.patterns;

import org.junit.Test;

public class SingletonTest {
	@Test
	public void testGetInstance(){
		Singleton singleton = Singleton.getInstance();
	}
}
