package com.zj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zj.dao.OperatorDao;
import com.zj.dao.OptratorDaoImpl;
import com.zj.vo.Operator;

/**
 * Servlet implementation class OperatorServlet
 */
public class OperatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public OperatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("o_id");
		String name=request.getParameter("o_name");
		String password=request.getParameter("o_password");
		String admin=request.getParameter("o_admin");
		OperatorDao dao=ServiceFactory.getObject(OptratorDaoImpl.class);
		dao.insert(new Operator(id,name,password,Integer.parseInt(admin)));
		response.sendRedirect("saveOpe.jsp");
	}

}
