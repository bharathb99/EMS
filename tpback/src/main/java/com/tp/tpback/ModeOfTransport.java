package com.tp.tpback;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ModeOfTransport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int modeID;
	
	@Column
	private String modeName;
	private double chargesPerKm;
	
	public ModeOfTransport() {
		super();
	}
	
	public ModeOfTransport(int modeID, String modeName, double chargesPerKm) {
		super();
		this.modeID = modeID;
		this.modeName = modeName;
		this.chargesPerKm = chargesPerKm;
	}

	public int getModeID() {
		return modeID;
	}

	public void setModeID(int modeID) {
		this.modeID = modeID;
	}

	public String getModeName() {
		return modeName;
	}

	public void setModeName(String modeName) {
		this.modeName = modeName;
	}

	public double getChargesPerKm() {
		return chargesPerKm;
	}

	public void setChargesPerKm(double chargesPerKm) {
		this.chargesPerKm = chargesPerKm;
	}

	@Override
	public String toString() {
		return "ModeOfTransport [modeID=" + modeID + ", modeName=" + modeName + ", chargesPerKm=" + chargesPerKm + "]";
	}
	
}
