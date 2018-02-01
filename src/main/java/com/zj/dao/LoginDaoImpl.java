package com.zj.dao;

import com.oracle.jdbc.util.Dao;
import com.zj.vo.Operator;

public class LoginDaoImpl implements LoginDao {
	public Operator login(String username,String password){
		//System.out.println("进行测验");
		Operator o=Dao.queryOne("select * from toperator where O_ID=? AND O_PWD=?", Operator.class, username,password);
		//System.out.println(o.toString());
		return o;
	}
}
