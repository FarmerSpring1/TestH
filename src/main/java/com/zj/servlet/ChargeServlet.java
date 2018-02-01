package com.zj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zj.dao.ChargeDao;
import com.zj.dao.ChargeDaoImpl;
import com.zj.vo.Charge;


public class ChargeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ChargeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String money=request.getParameter("money");
		System.out.println(name+"  "+money);
		Charge c=new Charge(name,Double.parseDouble(money));
		ChargeDao dao=ServiceFactory.getObject(ChargeDaoImpl.class);
		dao.uodate(c);
		response.sendRedirect("charge.jsp");
	}

}
