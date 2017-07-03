package com.rkp.myparkingasst.sortandsearch;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

import junit.framework.TestCase;

public class TestReversalImplementations extends TestCase {
	
	@Test
	public void testStringReversal() {
		ReversalImpl reversalImpl = new ReversalImpl();
		assertEquals(reversalImpl.getReversedString("Rajasimha Karanam"), "manaraK ahmisajaR");
	}
	
	@Test
	public void testIntegerArrayReversal() {
		ReversalImpl reversalImpl = new ReversalImpl();
		int [] returnArray = reversalImpl.getReversedArray(new int[] { 100, 200, 300, 400});
		
		assertEquals(returnArray[0], 400);
		assertEquals(returnArray[1], 300);
		assertEquals(returnArray[2], 200);
		assertEquals(returnArray[3], 100);

	}
	
	@Test
	public void testIntegerArrayReversalOddSize() {
		ReversalImpl reversalImpl = new ReversalImpl();
		int [] returnArray = reversalImpl.getReversedArray(new int[] { 100, 200, 300, 400, 500});
		
		assertEquals(returnArray[0], 500);
		assertEquals(returnArray[1], 400);
		assertEquals(returnArray[2], 300);
		assertEquals(returnArray[3], 200);
		assertEquals(returnArray[4], 100);
	}
	
	@Test
	public void testDates() {
		Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("IST"));
		Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("DST"));
		
		cal1.setTimeInMillis(200);
		cal2.setTimeInMillis(100);
		
		Date date1 = cal1.getTime();
		Date date2 = cal2.getTime();
		
		System.out.print("Date1: " + date1.toString() + "; Date2: " + date2.toString());
		
		assertTrue(date1.after(date2));
		
	}

}
