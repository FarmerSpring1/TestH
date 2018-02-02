package com.zj.dao;

import com.oracle.jdbc.util.Dao;
import com.zj.vo.Operator;

public class OptratorDaoImpl implements OperatorDao {

	public void insert(Operator o) {
		Dao.executeSql("INSERT INTO `toperator` (`O_ID`, `O_NAME`, `O_PWD`, `IS_ADMIN`) VALUES (?,?,?,?)", o.getO_id(),o.getO_name(),o.getO_pwd(),o.getIs_Admin());
	}

}
