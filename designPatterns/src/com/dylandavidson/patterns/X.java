package com.dylandavidson.patterns;

public class X {
	private int xInt;
	private String xString;
	private A xA;
	public int getxInt() {
		return xInt;
	}
	public void setxInt(int xInt) {
		this.xInt = xInt;
	}
	public String getxString() {
		return xString;
	}
	public void setxString(String xString) {
		this.xString = xString;
	}
	public A getxA() {
		//make defensive copy
		A defensiveA = new A();
		defensiveA.setaInt(xA.getaInt());
		defensiveA.setaString(xA.getaString());
		return defensiveA;
	}
	public void setxA(A xA) {
		//make a defensive copy
		A defensiveA = new A();
		defensiveA.setaInt(xA.getaInt());
		defensiveA.setaString(xA.getaString());
		this.xA = defensiveA;
	}
	
	public X prototype(String aString){
		X prototypeX = new X();
		prototypeX.setxInt(this.xInt);
		prototypeX.setxString(this.xString);
		A aDefensiveCopy = defensiveCopy(this.xA);
		aDefensiveCopy.setaString(aString);
		prototypeX.setxA(aDefensiveCopy);
		return prototypeX;
	}
	
	protected A defensiveCopy(A xA){
		A defensiveA = new A();
		defensiveA.setaInt(xA.getaInt());
		defensiveA.setaString(xA.getaString());
		return defensiveA;
	}
}
