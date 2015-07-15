package com.dylandavidson.patterns;

public class ClassFactory {
	public static ConcreteClass newConcreteClass(String classSpecifier){
		ConcreteClass concreteClass = null;
		if(classSpecifier.equals("a")){
			concreteClass= new ConcreteClassA();
		}else if(classSpecifier.equals("b")){
			concreteClass = new ConcreteClassB();
		}else{
			concreteClass = new ConcreteClassDefault();
		}
		return concreteClass;
	}
}
