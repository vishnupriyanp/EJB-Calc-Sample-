package com.vishnu.tut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class VishnuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	VishnuSessionBean VishnuSessionBean;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String value = VishnuSessionBean.VishnuSessionBeanMethod().toString();
		request.setAttribute("name", value);
		request.getRequestDispatcher("printRes.jsp").forward(request, response);
	}

}
