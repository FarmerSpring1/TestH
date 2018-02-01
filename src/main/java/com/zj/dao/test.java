package com.zj.dao;

import com.oracle.jdbc.util.Dao;
import com.zj.vo.Operator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Operator o1=Dao.queryOne("select max(tmobiles.CARD_NUMBER) FROM tmobiles");
		Object[] o=Dao.queryOne("select max(tmobiles.CARD_NUMBER) FROM tmobiles");
		Long cardid=Long.parseLong(String.valueOf(o[0]));
		for( Long i=Long.parseLong("13500000000");i<Long.parseLong("13500000009");i++ ){
			cardid=cardid+1;
			Dao.executeSql("INSERT INTO `tmobiles` (`M_NUMBER`, `M_TYPE`, `CARD_NUMBER`, `IS_AVAILABLE`) VALUES (?, ?, ?, 'T') ",i,"sim",cardid );
		};
	}

}
