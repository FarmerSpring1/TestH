package com.zj.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zj.dao.CustomerDao;
import com.zj.dao.CustomerDaoImpl;
import com.zj.vo.Customer;


public class NewCustomerServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NewCustomerServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String oneid=request.getParameter("oneid");
		if(oneid!=null){
			request.setAttribute("id", oneid);
			request.getRequestDispatcher("newUser.jsp").forward(request, response);
		}else{
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String birth=request.getParameter("birth");
		String address=request.getParameter("address");
		String type=request.getParameter("type");
		String idnumber=request.getParameter("idnumber");
		//转化未sql类型的date
		Date date=null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(birth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date birth1=new java.sql.Date(date.getTime());  
		Customer c=new Customer(type,idnumber,name,birth1,sex,address);
		CustomerDao dao=ServiceFactory.getObject(CustomerDaoImpl.class);
		int id=dao.insert(c);
		request.setAttribute("id", id);
		request.getRequestDispatcher("newUser.jsp").forward(request, response);
	}
	}
}
