package com.zj.dao;

import java.util.List;

import com.zj.vo.Mobiles;

public interface CardDao {
	public void insert(String a,String b,String type);
	public void update(String number);
	public String selectAll();
	public Mobiles select(String number);
}
