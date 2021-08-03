package com.tp.tpback;

import javax.persistence.Embeddable;

@Embeddable
public class Transport {

	private String startLocation;
	private String endLocation;
	private String modeOfTransport;
	
	public Transport() {
		super();
	}
	
	public Transport(String startLocation, String endLocation, String modeOfTransport) {
		super();
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.modeOfTransport = modeOfTransport;
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
	
	public String getModeOfTransport() {
		return modeOfTransport;
	}
	
	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}
	
	@Override
	public String toString() {
		return "Transport [startLocation=" + startLocation + ", endLocation=" + endLocation + ", modeOfTransport="
				+ modeOfTransport + "]";
	}
	
}
