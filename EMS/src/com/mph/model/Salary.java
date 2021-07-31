package com.mph.model;
import com.mph.model.Salary;

public class Salary {
	private int basic;
	private int da;
	private int hrf;
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
		this.da = basic*50/100;
	}
	public int getHrf() {
		return hrf;
	}
	
	public void setHrf(int basic) {
		this.hrf = basic*40/100;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int basic) {
		this.pf = basic*10/100;
	}
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary() {
		this.grossSalary = basic + da + hrf + pf;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary() {
		this.netSalary = grossSalary-pf;
	}
	
	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", da=" + da + ", hrf=" + hrf + ", pf=" + pf + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + "]";
	}
}
