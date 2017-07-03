package com.rkp.myparkingasst.patterns;

import org.junit.Test;

import junit.framework.TestCase;

public class TestShapeFactory extends TestCase {
	
	@Test
	public void testShapeFactoryDemoNull() {
		assertNull(ShapeFactory.getShape(null));
	}
	
	@Test
	public void testShapeFactoryDemoEmpty() {
		assertNull(ShapeFactory.getShape(""));
	}
	
	@Test
	public void testShapeFactoryDemoCircle() {
		Shape shape1 = ShapeFactory.getShape("CIRCLE");
		assertEquals (shape1.draw(), "Drawing Circle");
		
		Shape shape2 = ShapeFactory.getShape("SQUARE");
		assertEquals (shape2.draw(), "Drawing Square");
	}

}
