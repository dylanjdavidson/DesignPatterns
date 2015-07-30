package com.dylandavidson.patterns;

public class StringBuilderExample {
	
	
	
	public static void main(String[] args){
		StringBuilder builder = new StringBuilder();
		printBuilder(builder);
		builder.append("whatever i want");
		printBuilder(builder);
		builder.append("\tmore").append("\tand more");
		printBuilder(builder);
	}
	
	protected static void printBuilder(StringBuilder builder){
		System.out.println("builder = <" + builder.toString() + ">");
	}
}
