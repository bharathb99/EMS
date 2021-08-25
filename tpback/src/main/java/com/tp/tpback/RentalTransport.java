package com.tp.tpback;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "RENTAL_TYPE")
@Entity
public class RentalTransport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rentalTransportID;
	
	@Column
	private String vehicleProvider;

	public RentalTransport() {
		super();
	}

	public RentalTransport(int rentalTransportID, String vehicleProvider) {
		super();
		this.rentalTransportID = rentalTransportID;
		this.vehicleProvider = vehicleProvider;
	}

	public int getRentalTransportID() {
		return rentalTransportID;
	}

	public void setRentalTransportID(int rentalTransportID) {
		this.rentalTransportID = rentalTransportID;
	}

	public String getVehicleProvider() {
		return vehicleProvider;
	}

	public void setVehicleProvider(String vehicleProvider) {
		this.vehicleProvider = vehicleProvider;
	}

	@Override
	public String toString() {
		return "RentalTransport [rentalTransportID=" + rentalTransportID + ", vehicleProvider=" + vehicleProvider + "]";
	}

}
