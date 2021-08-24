package com.tp.tpback;

import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class TransportBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transportBookingID;

	private double distance;
	private double transportCost;
	private int noOfPeople;
	private String startLocation;
	private String endLocation;

	@OneToOne
	@JoinColumn(name = "modeID")
	private int modeID;
	
	@Temporal(TemporalType.DATE)
	private Calendar onwardDate;
	
	@Temporal(TemporalType.DATE)
	private Calendar returnDate;

	public TransportBooking() {
		super();
	}

	public TransportBooking(int transportBookingID, double distance, double transportCost, int noOfPeople,
			String startLocation, String endLocation, int modeID, Calendar onwardDate, Calendar returnDate) {
		super();
		this.transportBookingID = transportBookingID;
		this.distance = distance;
		this.transportCost = transportCost;
		this.noOfPeople = noOfPeople;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.modeID = modeID;
		this.onwardDate = onwardDate;
		this.returnDate = returnDate;
	}

	public int getTransportBookingID() {
		return transportBookingID;
	}

	public void setTransportBookingID(int transportBookingID) {
		this.transportBookingID = transportBookingID;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTransportCost() {
		return transportCost;
	}

	public void setTransportCost(double transportCost) {
		this.transportCost = transportCost;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public int getModeID() {
		return modeID;
	}

	public void setModeID(int modeID) {
		this.modeID = modeID;
	}

	public Calendar getOnwardDate() {
		return onwardDate;
	}

	public void setOnwardDate(Calendar onwardDate) {
		this.onwardDate = onwardDate;
	}

	public Calendar getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Calendar returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "TransportBooking [transportBookingID=" + transportBookingID + ", distance=" + distance
				+ ", transportCost=" + transportCost + ", noOfPeople=" + noOfPeople + ", startLocation=" + startLocation
				+ ", endLocation=" + endLocation + ", modeID=" + modeID + ", onwardDate=" + onwardDate + ", returnDate="
				+ returnDate + "]";
	}
	
}
