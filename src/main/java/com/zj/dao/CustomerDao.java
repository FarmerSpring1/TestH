package com.zj.dao;

import com.zj.vo.Customer;

public interface CustomerDao {
	public int insert(Customer c);
	public Customer select(String number,String type);
}
