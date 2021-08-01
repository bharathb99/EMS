package com.mph.model;

import java.io.Serializable;

public class Salary implements Serializable  {

	private int basic;
	private int da;
	private int hra;
	private int pf;
	private int grossSalary;
	private int netSalary;

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int basic) {
		this.da = basic * 36 / 100;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int basic) {
		this.hra = basic * 10 / 100;
	}

	public int getPf() {
		return pf;
	}

	public void setPf(int basic) {
		this.pf = basic * 12 / 100;
	}

	public int getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(int basic) {
		this.grossSalary = basic + this.da + this.hra + this.pf;
	}

	public int getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(int basic) {
		this.netSalary = basic + this.da + this.hra;
	}

	@Override
	public String toString() {
		return "Salary Basic=" + basic + ",DA=" + da + ",HRA=" + hra + ",PF=" + pf + ",Gross Salary="
				+ grossSalary + ",Net Salary=" + netSalary;
	}
}