package com.zj.vo;

public class Charge {
	String c_code;
	String c_name;
	double charge;
	public String getC_code() {
		return c_code;
	}
	public void setC_code(String c_code) {
		this.c_code = c_code;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public Charge(String c_code, String c_name, double charge) {
		super();
		this.c_code = c_code;
		this.c_name = c_name;
		this.charge = charge;
	}
	public Charge() {
		super();
	}
	@Override
	public String toString() {
		return "Charge [c_code=" + c_code + ", c_name=" + c_name + ", charge=" + charge + "]";
	}
	public Charge(String c_name, double charge) {
		super();
		this.c_name = c_name;
		this.charge = charge;
	}
	
}
