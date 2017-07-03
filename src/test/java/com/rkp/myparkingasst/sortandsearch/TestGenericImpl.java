package com.rkp.myparkingasst.sortandsearch;

import org.junit.Test;

import junit.framework.TestCase;

public class TestGenericImpl extends TestCase {
	@Test
	public void testPrintArray() {
		Integer [] intArray = new Integer[] {1, 2, 3, 4, 5};
		String [] stringArray = new String[] {"One", "Two", "Three", "Four", "Five"};
		Double [] doubleArray = new Double[] {1.2d, 2.3d, 3.4d, 4.5d, 5.6d};
		
		GenericImpl.printArray(intArray);
		GenericImpl.printArray(stringArray);
		GenericImpl.printArray(doubleArray);
		
	}
	
	@Test 
	public void testAccessRestriction() {
		ParentClass parentClass = new ParentClass();
		ChildClass childClass = new ChildClass();
		
		Shape shape1 = parentClass.testOverrideMethod(new Shape());
		Shape shape2 = childClass.testOverrideMethod(new Rectangle());
		
		assertTrue (shape1 instanceof Shape);
		assertTrue (shape2 instanceof Rectangle);
		assertTrue (shape2 instanceof Shape);
	}

}
