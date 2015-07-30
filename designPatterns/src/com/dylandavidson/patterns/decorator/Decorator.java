package com.dylandavidson.patterns.decorator;

public abstract class Decorator implements Component{
	private final Component component;
	
	protected Decorator(Component component){
		this.component=component;
	}

	protected Component getComponent() {
		return component;
	}
}
