package com.rkp.myparkingasst.pscalc;

import org.junit.Test;

import junit.framework.TestCase;

public class TestParkingSpaceUpdator extends TestCase {
	
	@Test
	public void testParkingSpaceUpdator() {
		ParkingSpaceUpdator parkingspaceUpdator = new ParkingSpaceUpdator("Meenakshi Mall Basement 1");
		ParkingSpaceUpdator parkingSpaceUpdator = new ParkingSpaceUpdator("Meenakshi Mall Basement 2");
		
		parkingspaceUpdator.start();
		parkingSpaceUpdator.start();
		
	}

}
