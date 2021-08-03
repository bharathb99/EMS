package com.tp.tpback;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue
	private int BookingID;
	
	@Column
	private  Date BookingDate;
=======
public class Booking {
	
	private String bookingStatus;
	private int people;
	private int 
	
>>>>>>> f11162447bbd7a7ac7a404036824fd3ad4918450
}
