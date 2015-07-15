package com.dylandavidson.patterns;

public class ConcreteInClassFactory {
	private int anInt;
	private String aString;
	private boolean aBoolean;
	
	public static ConcreteInClassFactory newConcreteInClassFactory(int anInt, String aString, boolean aBoolean) {
		ConcreteInClassFactory concreteInClassFactory = new ConcreteInClassFactory();
		concreteInClassFactory.anInt = anInt;
		concreteInClassFactory.aString = aString;
		concreteInClassFactory.aBoolean = aBoolean;
		return concreteInClassFactory;
	}
	
	public int getAnInt() {
		return anInt;
	}
	public void setAnInt(int anInt) {
		this.anInt = anInt;
	}
	public String getaString() {
		return aString;
	}
	public void setaString(String aString) {
		this.aString = aString;
	}
	public boolean isaBoolean() {
		return aBoolean;
	}
	
	public void setaBoolean(boolean aBoolean) {
		this.aBoolean = aBoolean;
	}
	

}
