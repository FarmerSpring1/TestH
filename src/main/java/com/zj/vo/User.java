package com.zj.vo;

public class User {
	int user_ID;
	String m_number;
	String r_status;
	String com_level;
	int c_id;
	String is_available;
	public int getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}
	public String getM_number() {
		return m_number;
	}
	public void setM_number(String m_number) {
		this.m_number = m_number;
	}
	public String getR_status() {
		return r_status;
	}
	public void setR_status(String r_status) {
		this.r_status = r_status;
	}
	public String getCom_level() {
		return com_level;
	}
	public void setCom_level(String com_level) {
		this.com_level = com_level;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getIs_available() {
		return is_available;
	}
	public void setIs_available(String is_available) {
		this.is_available = is_available;
	}
	public User(int user_ID, String m_number, String r_status, String com_level, int c_id, String is_available) {
		super();
		this.user_ID = user_ID;
		this.m_number = m_number;
		this.r_status = r_status;
		this.com_level = com_level;
		this.c_id = c_id;
		this.is_available = is_available;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [user_ID=" + user_ID + ", m_number=" + m_number + ", r_status=" + r_status + ", com_level="
				+ com_level + ", c_id=" + c_id + ", is_available=" + is_available + "]";
	}
	public User(String m_number, String r_status, String com_level, int c_id) {
		super();
		this.m_number = m_number;
		this.r_status = r_status;
		this.com_level = com_level;
		this.c_id = c_id;
	}
	
}
