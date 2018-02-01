package com.zj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zj.dao.CustomerDao;
import com.zj.dao.CustomerDaoImpl;
import com.zj.vo.Customer;

public class NewCustomerServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public NewCustomerServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		String number=request.getParameter("number");
		CustomerDao dao=ServiceFactory.getObject(CustomerDaoImpl.class);
		Customer c=dao.select(number, type);
	//	System.out.println(type+"   "+number);
	//	System.out.println(c.toString());
		if(c!=null){
		//	System.out.println("C!KONG");
			request.setAttribute("c", c);
			request.getRequestDispatcher("newCustomer2.jsp").forward(request, response);
		}else{
			Customer c1=new Customer(type,number);
		//	System.out.println("---------Servlet1");
		//	System.out.println(c1.toString());
			request.setAttribute("c", c1);
			request.getRequestDispatcher("newCustomer1.jsp").forward(request, response);
		}
	}

}
