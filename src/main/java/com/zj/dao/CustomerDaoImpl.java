package com.zj.dao;

import com.oracle.jdbc.util.Dao;
import com.zj.vo.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public int insert(Customer c) {
		Dao.executeSql("INSERT INTO `tcustomer` (`ID_TYPE`, `ID_NUMBER`, `C_NAME`, `C_BIRTYDAY`, `C_SEX`, `C_ADDRESS`) VALUES (?, ?, ?, ?, ?, ?)", c.getId_type(),c.getId_number(),c.getC_name(),c.getC_birthday(),c.getC_sex(),c.getC_address());
		Customer c1=Dao.queryOne("select * from tcustomer where C_NAME=? AND id_number=?", Customer.class, c.getC_name(),c.getId_number());
		return c1.getC_ID();
	}

	public Customer select(String number, String type) {
		Customer c=Dao.queryOne("select * from tcustomer WHERE tcustomer.ID_TYPE=? AND tcustomer.ID_NUMBER=?", Customer.class,type,number );
		return c;
	}


}
