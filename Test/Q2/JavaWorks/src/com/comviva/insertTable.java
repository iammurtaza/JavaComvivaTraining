package com.comviva;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class insertTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		int empid = Integer.parseInt(request.getParameter("empid"));
		String empname = request.getParameter("empname");
		int empsal = Integer.parseInt(request.getParameter("empsal"));
		String empemail = request.getParameter("empemail");

		// check on a sql table if these values exist
		IinsertTableDAO dao = new insertTableDAO();
		boolean flag = dao.insertEmployee(empid, empname, empsal, empemail);
		System.out.println(flag ? "Inserted" : "Not Inserted");

		if (flag == true) {
			request.getRequestDispatcher("Success").include(request, response);
			request.getRequestDispatcher("LoginForm.html").include(request,
					response);
		}
		// not exist
		else {
			request.getRequestDispatcher("Failure").include(request, response);
			request.getRequestDispatcher("LoginForm.html").include(request,
					response);
		}
	}

}
