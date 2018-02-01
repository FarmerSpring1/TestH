package com.zj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zj.dao.CardDao;
import com.zj.dao.CardDaoImpl;
import com.zj.dao.UserDao;
import com.zj.dao.UserDaoImpl;
import com.zj.vo.User;


public class NewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String number=request.getParameter("number");
		String status=request.getParameter("status");
		String level=request.getParameter("level");
		String id=request.getParameter("C_id");
		System.out.println(id);
		User u=new User(number,status,level,Integer.parseInt(id));
		System.out.println(u.toString());
		UserDao dao=ServiceFactory.getObject(UserDaoImpl.class);
		dao.insert(u);
		

		
		response.sendRedirect("saveinfo.jsp");
	}

}
