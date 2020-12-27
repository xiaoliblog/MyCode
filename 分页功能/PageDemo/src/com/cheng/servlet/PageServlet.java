package com.cheng.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cheng.Bean.Page;
import com.cheng.service.PageService;
import com.cheng.serviceImpl.PageServiceImpl;

@WebServlet("/pageServlet")
public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Ω” ’“≥¬Î
		int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
		PageService productService = new PageServiceImpl();
		Page page = productService.findUserByPage(pageIndex);
		request.setAttribute("page", page);
		try {
			request.getRequestDispatcher("/list.jsp").forward(request, response);
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
