package com.tp.tpback;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue
	private int bookingID;
	
	private  Date bookingDate = new Date();
	private String bookingStatus;
	private int numberOfPeople;
	private double totalCost;
	private Date tripStartDate = new Date();
	private Date tripEndDate = new Date();
	
	@Embedded
	private Transport transport;
	
	@ManyToOne
	@JoinColumn(name = "userID", referencedColumnName = "USERID")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name = "packageID", referencedColumnName = "PACKAGEID")
	private Package pack;

	public Booking() {
		super();
	}

	public Booking(int bookingID, Date bookingDate, String bookingStatus, int numberOfPeople, double totalCost,
			Date tripStartDate, Date tripEndDate, Transport transport, Customer customer, Package pack) {
		super();
		this.bookingID = bookingID;
		this.bookingDate = bookingDate;
		this.bookingStatus = bookingStatus;
		this.numberOfPeople = numberOfPeople;
		this.totalCost = totalCost;
		this.tripStartDate = tripStartDate;
		this.tripEndDate = tripEndDate;
		this.transport = transport;
		this.customer = customer;
		this.pack = pack;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Date getTripStartDate() {
		return tripStartDate;
	}

	public void setTripStartDate(Date tripStartDate) {
		this.tripStartDate = tripStartDate;
	}

	public Date getTripEndDate() {
		return tripEndDate;
	}

	public void setTripEndDate(Date tripEndDate) {
		this.tripEndDate = tripEndDate;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Package getPack() {
		return pack;
	}

	public void setPack(Package pack) {
		this.pack = pack;
	}

	@Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", bookingDate=" + bookingDate + ", bookingStatus=" + bookingStatus
				+ ", numberOfPeople=" + numberOfPeople + ", totalCost=" + totalCost + ", tripStartDate=" + tripStartDate
				+ ", tripEndDate=" + tripEndDate + ", transport=" + transport + ", customer=" + customer + ", pack="
				+ pack + "]";
	}
	
}
