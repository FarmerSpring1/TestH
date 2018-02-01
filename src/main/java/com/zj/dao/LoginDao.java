package com.zj.dao;

import com.zj.vo.Operator;

public interface LoginDao {
	public Operator login(String username,String password);
}
