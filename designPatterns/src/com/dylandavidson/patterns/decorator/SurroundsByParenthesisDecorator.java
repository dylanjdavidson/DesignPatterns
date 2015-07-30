package com.dylandavidson.patterns.decorator;

public class SurroundsByParenthesisDecorator extends Decorator{
	
	public static SurroundsByParenthesisDecorator newSurroundsByParenthesisDecorator(Component component){
		return new SurroundsByParenthesisDecorator(component);
	}

	private SurroundsByParenthesisDecorator(Component component) {
		super(component);
		
	}

	@Override
	public String representation() {
		
		return "(" + getComponent().representation() + ")";
	}

}
