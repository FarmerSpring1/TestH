package com.zj.vo;

public class Operator {
	String o_id;
	String o_name;
	String o_pwd;
	String is_Admin;
	public String getO_id() {
		return o_id;
	}
	public void setO_id(String o_id) {
		this.o_id = o_id;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getO_pwd() {
		return o_pwd;
	}
	public void setO_pwd(String o_pwd) {
		this.o_pwd = o_pwd;
	}
	public String getIs_Admin() {
		return is_Admin;
	}
	public void setIs_Admin(String is_Admin) {
		this.is_Admin = is_Admin;
	}
	public Operator(String o_id, String o_name, String o_pwd, String is_Admin) {
		super();
		this.o_id = o_id;
		this.o_name = o_name;
		this.o_pwd = o_pwd;
		this.is_Admin = is_Admin;
	}
	public Operator(String o_id, String o_pwd, String is_Admin) {
		super();
		this.o_id = o_id;
		this.o_pwd = o_pwd;
		this.is_Admin = is_Admin;
	}
	public Operator() {
		super();
	}
	@Override
	public String toString() {
		return "Operator [o_id=" + o_id + ", o_name=" + o_name + ", o_pwd=" + o_pwd + ", is_Admin=" + is_Admin + "]";
	}
	
}
