package com.tp.tpback;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FourWheeler")
public class FourWheeler {

	private double chargesPerDay;
	private int noOfSeats;//4,5 or 7 seater
	
	public FourWheeler() {
		super();
	}
	
	public FourWheeler(double chargesPerDay, int noOfSeats) {
		super();
		this.chargesPerDay = chargesPerDay;
		this.noOfSeats = noOfSeats;
	}
	
	public double getChargesPerDay() {
		return chargesPerDay;
	}
	
	public void setChargesPerDay(double chargesPerDay) {
		this.chargesPerDay = chargesPerDay;
	}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	@Override
	public String toString() {
		return "FourWheeler [chargesPerDay=" + chargesPerDay + ", noOfSeats=" + noOfSeats + "]";
	}
		
}
