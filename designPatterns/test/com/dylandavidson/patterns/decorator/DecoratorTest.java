package com.dylandavidson.patterns.decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testParenthesis() {
		DylanDavidsonName dylanDavidsonName = new DylanDavidsonName();
		SurroundsByParenthesisDecorator surroundsByParenthesisDecorator = SurroundsByParenthesisDecorator
				.newSurroundsByParenthesisDecorator(dylanDavidsonName);
		assertEquals("(Dylan Davidson)", surroundsByParenthesisDecorator.representation());

	}
	
	@Test
	public void testParenthesisAndAsterisk() {
		DylanDavidsonName dylanDavidsonName = new DylanDavidsonName();
		Component decoratedDylanDavidsonName = SurroundsByParenthesisDecorator
				.newSurroundsByParenthesisDecorator(dylanDavidsonName);
		PrependingAsteriskDecorator twiceDecoratedDylanDavidsonName = PrependingAsteriskDecorator.newPrependingAsteriskDecorator(decoratedDylanDavidsonName, 5);
		
		assertEquals("*****(Dylan Davidson)", twiceDecoratedDylanDavidsonName.representation());

	}

}
