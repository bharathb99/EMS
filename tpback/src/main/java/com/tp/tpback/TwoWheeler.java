package com.tp.tpback;

import javax.persistence.*;

@Entity
@DiscriminatorValue("TwoWheeler")
public class TwoWheeler extends RentalTransport {

	private double chargesPerDay;
	private String vehicleType;//bike or scooter
	
	public TwoWheeler() {
		super();
	}
	
	public TwoWheeler(double chargesPerDay, String vehicleType) {
		super();
		this.chargesPerDay = chargesPerDay;
		this.vehicleType = vehicleType;
	}

	public double getChargesPerDay() {
		return chargesPerDay;
	}

	public void setChargesPerDay(double chargesPerDay) {
		this.chargesPerDay = chargesPerDay;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "TwoWheeler [chargesPerDay=" + chargesPerDay + ", vehicleType=" + vehicleType + "]";
	}
	
}
