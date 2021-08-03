package com.tp.tpback;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Package {

	@Id
	@GeneratedValue
	private int packageID;
	
	private String packageName;
	private String itenary;
	private String location;
	private String hotel;
	private int costPerDay;
	
	@OneToOne
	@JoinColumn(name = "userID", referencedColumnName = "USERID")
	private Employee employee;

	public Package() {
		super();
	}

	public Package(int packageID, String packageName, String itenary, String location, String hotel, int costPerDay,
			Employee employee) {
		super();
		this.packageID = packageID;
		this.packageName = packageName;
		this.itenary = itenary;
		this.location = location;
		this.hotel = hotel;
		this.costPerDay = costPerDay;
		this.employee = employee;
	}

	public int getPackageID() {
		return packageID;
	}

	public void setPackageID(int packageID) {
		this.packageID = packageID;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getItenary() {
		return itenary;
	}

	public void setItenary(String itenary) {
		this.itenary = itenary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public int getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Package [packageID=" + packageID + ", packageName=" + packageName + ", itenary=" + itenary
				+ ", location=" + location + ", hotel=" + hotel + ", costPerDay=" + costPerDay + ", employee="
				+ employee + "]";
	}
	
}
