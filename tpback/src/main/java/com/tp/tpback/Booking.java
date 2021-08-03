package com.tp.tpback;

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
}
