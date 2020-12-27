package com.cheng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cheng.Bean.User;
import com.cheng.service.UserService;
import com.cheng.serviceImpl.UserServiceImpl;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public loginServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		User st = new User();
		HttpSession session = request.getSession();
		UserService ss = new UserServiceImpl();
		st.setName(request.getParameter("name"));
		st.setPassword(request.getParameter("password"));
		boolean flag = ss.login(st);
		if(!flag) {
			session.setAttribute("msg", "Ture");
			request.getRequestDispatcher("/msg.jsp").forward(request, response);
		} else {
			session.setAttribute("msg", "false");
			request.getRequestDispatcher("/msg.jsp").forward(request, response);
		}
		
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
