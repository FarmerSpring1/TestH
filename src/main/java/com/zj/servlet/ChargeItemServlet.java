package com.zj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zj.dao.ChargeDao;
import com.zj.dao.ChargeDaoImpl;
import com.zj.vo.ChargeItem;


public class ChargeItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ChargeItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item=request.getParameter("item");
		String[] charge=request.getParameterValues("charge");
		StringBuffer sb=new StringBuffer();
		for(String s:charge){
			sb.append(s+" ");
		}
		ChargeItem c1=new ChargeItem(sb.toString(),item);
		ChargeDao dao=ServiceFactory.getObject(ChargeDaoImpl.class);
		dao.insertcharge(c1);
		response.sendRedirect("savechargeitem.jsp");
	}

}
