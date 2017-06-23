package com.rkp.myparkingasst.pricing;

import com.rkp.myparkingasst.beans.ParkingSlot;

public class ParkingCostCalculator {
	
	private static ParkingCostCalculator parkingCostCalculator;
	
	private ParkingCostCalculator() {
		
	}
	
	public static ParkingCostCalculator getInstance() {
		if (parkingCostCalculator == null) {
			parkingCostCalculator = new ParkingCostCalculator();
		}
		return parkingCostCalculator;
	}
	
	public static double calculateParkingCost(ParkingSlot parkingSlot) {
		return parkingSlot.getDuration() * parkingSlot.getParkingCostPerDuration();
		
	}

}
