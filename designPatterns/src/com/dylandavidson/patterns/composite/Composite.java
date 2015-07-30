package com.dylandavidson.patterns.composite;


import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private final int id;
	private static int baseId=0;
	
	private List<Component> components = new ArrayList<Component>();
	
	public Composite(){
		id = baseId++;
	}
	
	@Override
	public void sayHello() {
		System.out.println("Hello from Composite " + id);
		for(Component component: components){
			component.sayHello();
		}
		

	}

	@Override
	public void sayGoodbye() {
		System.out.println("Goodbye from Composite " + id);
		for(Component component: components){
			component.sayGoodbye();
		}

	}

	@Override
	public int getId() {
		return id;
	}
	
	public void add(Component component){
		components.add(component);
	}
	
	public boolean remove(Component component){
		return components.remove(component);
	}
	
	public Component getChild(int id){
		for(Component component: components){
			if(component.getId()==id){
				return component;
			}
		}
		throw new IllegalArgumentException("id " + id + " does not exist");
	}

}
