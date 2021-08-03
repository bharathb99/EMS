package com.tp.tpback;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Package {
	String itenary;
	String package_name;
	@Id
	int package_id;
	String location;
	@OneToOne
	@JoinColumn(name = "USERID")
	int user_id;
	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Package(String itenary, String package_name, int package_id, String location, int user_id,
			String mode_of_transport, int cost_per_day, String hotel) {
		super();
		this.itenary = itenary;
		this.package_name = package_name;
		this.package_id = package_id;
		this.location = location;
		this.user_id = user_id;
		this.mode_of_transport = mode_of_transport;
		this.cost_per_day = cost_per_day;
		this.hotel = hotel;
	}

	String mode_of_transport;
	int cost_per_day;
	String hotel;
	public String getItenary() {
		return itenary;
	}
	public void setItenary(String itenary) {
		this.itenary = itenary;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public int getPackage_id() {
		return package_id;
	}
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getMode_of_transport() {
		return mode_of_transport;
	}
	public void setMode_of_transport(String mode_of_transport) {
		this.mode_of_transport = mode_of_transport;
	}
	public int getCost_per_day() {
		return cost_per_day;
	}
	public void setCost_per_day(int cost_per_day) {
		this.cost_per_day = cost_per_day;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "Package [itenary=" + itenary + ", package_name=" + package_name + ", package_id=" + package_id + ", location="
				+ location + ", user_id=" + user_id + ", mode_of_transport=" + mode_of_transport + ", cost_per_day="
				+ cost_per_day + ", hotel=" + hotel + "]";
	}


}
