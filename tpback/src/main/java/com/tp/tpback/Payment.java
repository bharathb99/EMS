package com.tp.tpback;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentID;
	 
	@Temporal(TemporalType.TIMESTAMP)
	private Date paymentDate;
	 
	private String paymentMode;
	private boolean paymentStatus;
	private boolean refundStatus;
	
	@OneToOne
	@JoinColumn(name = "bookingID")
	private Booking booking;

	public Payment() {
		super();
	}

	public Payment(int paymentID, Date paymentDate, String paymentMode, boolean paymentStatus, boolean refundStatus,
			Booking booking) {
		super();
		this.paymentID = paymentID;
		this.paymentDate = paymentDate;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.refundStatus = refundStatus;
		this.booking = booking;
	}

	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public boolean isRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(boolean refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Payment [paymentID=" + paymentID + ", paymentDate=" + paymentDate + ", paymentMode=" + paymentMode
				+ ", paymentStatus=" + paymentStatus + ", refundStatus=" + refundStatus + ", booking=" + booking + "]";
	}
	
}
