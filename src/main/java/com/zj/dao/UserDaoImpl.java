package com.zj.dao;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.zj.vo.User;

public class UserDaoImpl implements UserDao {
	@Transactional
	public void insert(User u) {
		System.out.println(u.toString());
		Dao.executeSql("INSERT INTO `tuser` (`M_NUMBER`, `R_STATUS`, `COM_LEVEL`, `C_ID`) VALUES (?,?,?,?)", u.getM_number(),u.getR_status(),u.getCom_level(),u.getC_id());
		Dao.executeSql("UPDATE `tmobiles` SET `IS_AVAILABLE`='F' WHERE (`M_NUMBER`=?)", u.getM_number());
	}

}
