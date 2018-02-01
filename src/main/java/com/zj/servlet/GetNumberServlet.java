package com.zj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zj.dao.CardDao;
import com.zj.dao.CardDaoImpl;



public class GetNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public GetNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进来啦");
		request.setCharacterEncoding("utf-8");
		System.out.println("111");
		CardDao dao=ServiceFactory.getObject(CardDaoImpl.class);
		String str=dao.selectAll();
		System.out.println(str);
		response.setContentType("text/plain;charset=utf-8");
		response.getWriter().append(str);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
