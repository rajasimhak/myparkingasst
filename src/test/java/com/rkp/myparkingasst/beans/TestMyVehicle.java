package com.rkp.myparkingasst.beans;

import com.rkp.myparkingasst.beans.Vehicle;
import com.rkp.myparkingasst.constants.VehicleDetails.VehicleType;

import junit.framework.TestCase;

public class TestMyVehicle extends TestCase {
	public void testMyVehicle() {
		Vehicle myVehicle = new Vehicle("KA05MH5882", "2010", "RITZ", 5, VehicleType.HATCH_BACK);
		
		assertEquals(myVehicle.getRegNumber(), "KA05MH5882");
		assertEquals(myVehicle.getMake(), "2010");
		assertEquals(myVehicle.getModel(), "RITZ");
		assertEquals(myVehicle.getSeatingCapacity(), 5);
		assertEquals(myVehicle.getVehicleType(), VehicleType.HATCH_BACK);
	}

}
