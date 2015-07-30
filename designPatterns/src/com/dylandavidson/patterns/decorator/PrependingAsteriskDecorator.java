package com.dylandavidson.patterns.decorator;

public class PrependingAsteriskDecorator extends Decorator {
	private final int numberOfAsterisks;
	
	public static PrependingAsteriskDecorator newPrependingAsteriskDecorator(Component component, int numberOfAsterisks){
		return new PrependingAsteriskDecorator(component, numberOfAsterisks);
	}
	
	protected PrependingAsteriskDecorator(Component component, int numberOfAsterisks) {
		super(component);
		this.numberOfAsterisks = numberOfAsterisks;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String representation() {
		String rep = "";
		for(int i=0;i<numberOfAsterisks;i++){
			rep+="*";
		}
		return rep + getComponent().representation();
	}

}
