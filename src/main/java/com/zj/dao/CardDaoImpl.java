package com.zj.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.zj.vo.Mobiles;
import com.zj.vo.Operator;

public class CardDaoImpl implements CardDao {

	public void insert(String a, String b,String type) {
		Object[] o=Dao.queryOne("select max(tmobiles.CARD_NUMBER) FROM tmobiles");
		Long cardid=Long.parseLong(String.valueOf(o[0]));
		for( Long i=Long.parseLong(a);i<Long.parseLong(b);i++ ){
			cardid=cardid+1;
			Dao.executeSql("INSERT INTO `tmobiles` (`M_NUMBER`, `M_TYPE`, `CARD_NUMBER`, `IS_AVAILABLE`) VALUES (?, ?, ?, 'T') ",i,type,cardid );
		}
		
	}

	public void update(String number) {
		Dao.executeSql("UPDATE `tmobiles` SET `IS_AVAILABLE`='F' WHERE (`M_NUMBER`='?')", number);
		
	}

	public String selectAll() {
		List<Mobiles> list=Dao.query("select tmobiles.CARD_NUMBER,tmobiles.M_NUMBER from tmobiles WHERE tmobiles.IS_AVAILABLE='T'", Mobiles.class);
		StringBuffer sb=new StringBuffer();
//		sb.append("<form action='SendMess.do'>");
		for(Mobiles m:list){
			sb.append("<input type='radio' name='id' value='"+m.getCard_number()+"'><span>"+m.getM_number()+"</span>");		
		}	
//		sb.append("</form>");
		return sb.toString();
		
	
	}

	public Mobiles select(String number) {
		// TODO Auto-generated method stub
		return null;
	}

}
