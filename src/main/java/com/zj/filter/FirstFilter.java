package com.zj.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zj.vo.Operator;

@WebFilter({ "*.do", "*.jsp" })
public class FirstFilter implements Filter {
	List<String> list=new ArrayList();
    public FirstFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request1=(HttpServletRequest)request;
		HttpServletResponse response1=(HttpServletResponse)response;
		//获得session
		Operator o=(Operator)request1.getSession().getAttribute("ope");

		String uri=request1.getRequestURI(); 
		String path=request1.getContextPath();
		//获得路径
		uri=uri.replaceAll(path, "");
		request1.setCharacterEncoding("utf-8");
		if(o!=null){
		//	System.out.println("你已经登陆过");
			chain.doFilter(request1, response1);
		}else if(list.contains(uri)){
		//	System.out.println("去登陆");
			chain.doFilter(request1, response1);
		}else{
			response1.sendRedirect("index.jsp");
		}
	}


	public void init(FilterConfig fConfig) throws ServletException {
		list.add("/Login.do");
		list.add("/index.jsp");
	}

}
