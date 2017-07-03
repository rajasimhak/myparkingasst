package com.rkp.myparkingasst.patterns;

public class ParkingLot {
	private final String name;
	private final String literal;
	private final String numeral;
	private final String floor;
	
	public ParkingLot (ParkingLotBuilder parkingLotBuilder) {
		this.name = parkingLotBuilder.getParkingLotName();
		this.literal = parkingLotBuilder.getParkingLotLiteral();
		this.numeral = parkingLotBuilder.getParkingLotNumeral();
		this.floor = parkingLotBuilder.getFloor();
	}
	
	public String toString() {
		
		StringBuffer sbuffer = new StringBuffer(this.name);
		final String CONCAT = ", ";
		if (this.floor != null && !this.floor.equals("")) {
			sbuffer = sbuffer.append(CONCAT).append(this.floor);
		}
		
		if (this.literal != null && !this.literal.equals("")) {
			sbuffer = sbuffer.append(CONCAT).append(this.literal);
		}
		
		if (this.numeral != null && !this.numeral.equals("")) {
			sbuffer = sbuffer.append(CONCAT).append(this.numeral);
		}
		
		return sbuffer.toString();
	}

}
