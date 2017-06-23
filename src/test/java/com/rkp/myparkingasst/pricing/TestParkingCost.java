package com.rkp.myparkingasst.pricing;

import junit.framework.TestCase;

import org.junit.Test;

import com.rkp.myparkingasst.beans.ParkingSlot;
import com.rkp.myparkingasst.constants.ParkingAreaDetails.ParkingType;

public class TestParkingCost extends TestCase {
	
	private ParkingSlot parkingSlot;
	
	private ParkingSlot getParkingSlotHourly() {
		parkingSlot = new ParkingSlot();
		parkingSlot.setSlotNumber("B1_J_10");
		parkingSlot.setOccupied(true);
		parkingSlot.setDuration(4);
		parkingSlot.setParkingCostPerDuration(20.0);
		return parkingSlot;
		
	}
	
	@Test
	public void testHourlyParking() {
		ParkingSlot parkingSlot = getParkingSlotHourly();
		ParkingCostCalculator parkingCostCalculator = ParkingCostCalculator.getInstance();
		
		assertEquals(parkingCostCalculator.calculateParkingCost(parkingSlot), 80.0);
		
	}

}
