package com.zj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zj.dao.LoginDao;
import com.zj.dao.LoginDaoImpl;
import com.zj.vo.Operator;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("123");
		String name=request.getParameter("username");
		String pwd=request.getParameter("password");
		LoginDao dao=ServiceFactory.getObject(LoginDaoImpl.class);
		Operator o1=dao.login(name, pwd);
		if(o1!=null){
			request.getSession().setAttribute("ope",o1);
			response.sendRedirect("main.jsp");
		}else{
			response.sendRedirect("index.jsp");
		}
	}

}
