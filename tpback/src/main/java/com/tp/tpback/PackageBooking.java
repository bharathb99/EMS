package com.tp.tpback;

import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class PackageBooking {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int packageBookingID;
	
	private int noOfDays;
	private int noOfPeope;
	private double packageCost;
	
	@Temporal(TemporalType.DATE)
	private Calendar startDate;
	
	@Temporal(TemporalType.DATE)
	private Calendar endDate;
	
	@OneToOne
	@JoinColumn(name = "packageID")
	private Package pack;

	public PackageBooking() {
		super();
	}

	public PackageBooking(int packageBookingID, int noOfDays, int noOfPeope, double packageCost, Calendar startDate,
			Calendar endDate, Package pack) {
		super();
		this.packageBookingID = packageBookingID;
		this.noOfDays = noOfDays;
		this.noOfPeope = noOfPeope;
		this.packageCost = packageCost;
		this.startDate = startDate;
		this.endDate = endDate;
		this.pack = pack;
	}

	public int getPackageBookingID() {
		return packageBookingID;
	}

	public void setPackageBookingID(int packageBookingID) {
		this.packageBookingID = packageBookingID;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getNoOfPeope() {
		return noOfPeope;
	}

	public void setNoOfPeope(int noOfPeope) {
		this.noOfPeope = noOfPeope;
	}

	public double getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	public Package getPack() {
		return pack;
	}

	public void setPack(Package pack) {
		this.pack = pack;
	}

	@Override
	public String toString() {
		return "PackageBooking [packageBookingID=" + packageBookingID + ", noOfDays=" + noOfDays + ", noOfPeope="
				+ noOfPeope + ", packageCost=" + packageCost + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", pack=" + pack + "]";
	}
	
}
