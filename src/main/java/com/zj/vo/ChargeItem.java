package com.zj.vo;

public class ChargeItem {
	String func_id;
	String func_name;
	String charge_code;
	public String getFunc_id() {
		return func_id;
	}
	public void setFunc_id(String func_id) {
		this.func_id = func_id;
	}
	public ChargeItem(String func_name, String charge_code) {
		super();
		this.func_name = func_name;
		this.charge_code = charge_code;
	}
	public String getFunc_name() {
		return func_name;
	}
	public void setFunc_name(String func_name) {
		this.func_name = func_name;
	}
	public String getCharge_code() {
		return charge_code;
	}
	public void setCharge_code(String charge_code) {
		this.charge_code = charge_code;
	}
	public ChargeItem(String func_id, String func_name, String charge_code) {
		super();
		this.func_id = func_id;
		this.func_name = func_name;
		this.charge_code = charge_code;
	}
	public ChargeItem() {
		super();
	}
	@Override
	public String toString() {
		return "ChargeItem [func_id=" + func_id + ", func_name=" + func_name + ", charge_code=" + charge_code + "]";
	}
	
}
