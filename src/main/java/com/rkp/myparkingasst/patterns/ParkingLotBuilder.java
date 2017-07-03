package com.rkp.myparkingasst.patterns;

public class ParkingLotBuilder {
	
	private String parkingLotNumeral = "";
	private String parkingLotLiteral = "";
	private String floor = "";
	private String parkingLotName;
	
	public ParkingLotBuilder(String parkingLotName) {
		this.parkingLotName = parkingLotName;
	}
	
	public ParkingLotBuilder floor(String floor) {
		this.floor = floor;
		return this;
	}
	
	public ParkingLotBuilder parkingLotNumeral(String numeral) {
		this.parkingLotNumeral = numeral;
		return this;
	}
	
	public ParkingLotBuilder parkingLotLiteral(String literal) {
		this.parkingLotLiteral = literal;
		return this;
	}
	
	public ParkingLot build() {
		ParkingLot parkingLot = new ParkingLot(this);
		return parkingLot;
	}

	public String getParkingLotName() {
		return this.parkingLotName;
	}
	
	public String getParkingLotNumeral() {
		return this.parkingLotNumeral;
	}
	
	public String getParkingLotLiteral() {
		return this.parkingLotLiteral;
	}

	public String getFloor() {
		return this.floor;
	}

}
