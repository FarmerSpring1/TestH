package com.zj.vo;

import java.sql.Date;

public class Customer {
	int c_ID;
	String id_type;
	String id_number;
	String c_name;
	Date c_birthday;
	String c_sex;
	String c_address;
	public int getC_ID() {
		return c_ID;
	}
	public void setC_ID(int c_ID) {
		this.c_ID = c_ID;
	}
	public String getId_type() {
		return id_type;
	}
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public Date getC_birthday() {
		return c_birthday;
	}
	public void setC_birthday(Date c_birthday) {
		this.c_birthday = c_birthday;
	}
	public String getC_sex() {
		return c_sex;
	}
	public void setC_sex(String c_sex) {
		this.c_sex = c_sex;
	}
	public String getC_address() {
		return c_address;
	}
	public void setC_address(String c_address) {
		this.c_address = c_address;
	}
	public Customer(int c_ID, String id_type, String id_number, String c_name, Date c_birthday, String c_sex,
			String c_address) {
		super();
		this.c_ID = c_ID;
		this.id_type = id_type;
		this.id_number = id_number;
		this.c_name = c_name;
		this.c_birthday = c_birthday;
		this.c_sex = c_sex;
		this.c_address = c_address;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [c_ID=" + c_ID + ", id_type=" + id_type + ", id_number=" + id_number + ", c_name=" + c_name
				+ ", c_birthday=" + c_birthday + ", c_sex=" + c_sex + ", c_address=" + c_address + "]";
	}
	public Customer(String id_type, String id_number) {
		super();
		this.id_type = id_type;
		this.id_number = id_number;
	}
	public Customer(String id_type, String id_number, String c_name, Date c_birthday, String c_sex, String c_address) {
		super();
		this.id_type = id_type;
		this.id_number = id_number;
		this.c_name = c_name;
		this.c_birthday = c_birthday;
		this.c_sex = c_sex;
		this.c_address = c_address;
	}
	
}
