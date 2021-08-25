package com.tp.tpback;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int bookingId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date bookingDate;
	 
	@OneToOne
	@JoinColumn(name = "packageBookingID")
	private int packageBookingID;
	 
	@OneToOne
	@JoinColumn(name = "transportBookingID")
	private int transportBookingID;
	
	@OneToOne
	@JoinColumn(name = "customerID")
	private int customerID;
	 
	private boolean bookingStatus;
	private double totalCost;
	
	public Booking() {
		super();
	}
	
	public Booking(int bookingId, Date bookingDate, int packageBookingID, int transportBookingID, int customerID,
			boolean bookingStatus, double totalCost) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.packageBookingID = packageBookingID;
		this.transportBookingID = transportBookingID;
		this.customerID = customerID;
		this.bookingStatus = bookingStatus;
		this.totalCost = totalCost;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getPackageBookingID() {
		return packageBookingID;
	}

	public void setPackageBookingID(int packageBookingID) {
		this.packageBookingID = packageBookingID;
	}

	public int getTransportBookingID() {
		return transportBookingID;
	}

	public void setTransportBookingID(int transportBookingID) {
		this.transportBookingID = transportBookingID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public boolean isBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", packageBookingID="
				+ packageBookingID + ", transportBookingID=" + transportBookingID + ", customerID=" + customerID
				+ ", bookingStatus=" + bookingStatus + ", totalCost=" + totalCost + "]";
	}
	
}
