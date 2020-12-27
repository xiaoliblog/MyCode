package com.cheng.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cheng.Bean.User;
import com.cheng.service.UserService;
import com.cheng.serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class validateServlet
 */
@WebServlet("/validateServlet")
public class validateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		UserService us = new UserServiceImpl();
		User user = us.findUserByName(name);
		if (user != null) {
			// 表示已经存在这个用户
			response.getWriter().print("<font color='red'>用户名已经存在</font> ");
		} else {
			// 表示该用户不存在，可以注册
			response.getWriter().println("<font color='green'>用户名可以使用</font> ");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
