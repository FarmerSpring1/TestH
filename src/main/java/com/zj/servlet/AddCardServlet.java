package com.zj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zj.dao.CardDao;
import com.zj.dao.CardDaoImpl;


public class AddCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AddCardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		String number1=request.getParameter("number1");
		String number2=request.getParameter("number2");
		CardDao dao=ServiceFactory.getObject(CardDaoImpl.class);
		dao.insert(number1, number2,type);
		response.sendRedirect("saveCustomer.jsp");
	}

}
