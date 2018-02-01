package com.zj.dao;

import com.oracle.jdbc.util.Dao;
import com.zj.vo.Charge;
import com.zj.vo.ChargeItem;

public class ChargeDaoImpl implements ChargeDao {

	public void uodate(Charge c) {
		System.out.println(c.toString());
		Dao.executeSql("update tcharge SET tcharge.CHARGE= ? WHERE tcharge.C_name=?", c.getCharge(),c.getC_name());

	}

	public void insertcharge(ChargeItem c1) {
		Object[] obj=Dao.queryOne("select max(func_id) from tcharge_rule");
		String str=String.valueOf(obj[0])+"a";
		Dao.executeSql("INSERT INTO `tcharge_rule` (`FUNC_ID`, `CHARGE_CODE`, `FUNC_NAME`) VALUES (?,?,?)",str,c1.getCharge_code(),c1.getFunc_name());
		
	}

}
