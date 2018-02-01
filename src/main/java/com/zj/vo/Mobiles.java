package com.zj.vo;

public class Mobiles {
	String m_number;
	String m_type;
	String card_number;
	int is_available;
	public String getM_number() {
		return m_number;
	}
	public void setM_number(String m_number) {
		this.m_number = m_number;
	}
	public String getM_type() {
		return m_type;
	}
	public void setM_type(String m_type) {
		this.m_type = m_type;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public int getIs_available() {
		return is_available;
	}
	public void setIs_available(int is_available) {
		this.is_available = is_available;
	}
	public Mobiles(String m_number, String m_type, String card_number, int is_available) {
		super();
		this.m_number = m_number;
		this.m_type = m_type;
		this.card_number = card_number;
		this.is_available = is_available;
	}
	public Mobiles() {
		super();
	}
	@Override
	public String toString() {
		return "Mobiles [m_number=" + m_number + ", m_type=" + m_type + ", card_number=" + card_number
				+ ", is_available=" + is_available + "]";
	}
	
}
