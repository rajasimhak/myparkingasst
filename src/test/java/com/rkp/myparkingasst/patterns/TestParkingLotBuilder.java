package com.rkp.myparkingasst.patterns;

import org.junit.Test;

import junit.framework.TestCase;

public class TestParkingLotBuilder extends TestCase {
	
	@Test
	public void testParkingLotBuilderOnlyName() {
		ParkingLotBuilder parkingLotBuilder = new ParkingLotBuilder("Meenakshi Mall");
		assertEquals(new ParkingLot(parkingLotBuilder).toString(), "Meenakshi Mall");
		
	}
	
	@Test
	public void testParkingLotBuilderOnlyNameAndFloor() {
		ParkingLotBuilder parkingLotBuilder = new ParkingLotBuilder("Meenakshi Mall");
		ParkingLot parkingLot = parkingLotBuilder.floor("Basement1").build();
		assertEquals(parkingLot.toString(), "Meenakshi Mall, Basement1");
		
	}
	
	@Test
	public void testParkingLotBuilderOnlyNameFloorAndLiteral() {
		ParkingLotBuilder parkingLotBuilder = new ParkingLotBuilder("Meenakshi Mall");
		ParkingLot parkingLot = parkingLotBuilder.floor("Basement2").parkingLotLiteral("X").build();
		assertEquals(parkingLot.toString(), "Meenakshi Mall, Basement2, X");
		
	}
	
	@Test
	public void testParkingLotBuilderOnlyNameFloorLiteralAndNumeral() {
		ParkingLotBuilder parkingLotBuilder = new ParkingLotBuilder("Meenakshi Mall");
		ParkingLot parkingLot = parkingLotBuilder.floor("Basement3").parkingLotLiteral("X").parkingLotNumeral("12").build();
		assertEquals(parkingLot.toString(), "Meenakshi Mall, Basement3, X, 12");		
	}

}
