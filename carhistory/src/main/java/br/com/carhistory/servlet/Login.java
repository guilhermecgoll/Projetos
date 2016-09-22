package br.com.carhistory.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;



public class Login extends HttpServlet {

	private static final long serialVersionUID = -2642927509268007094L;

	private static final Logger LOGGER = Logger.getLogger(Login.class);

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LOGGER.info("Passou por aqui");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		if (Validate.checkUser(email, pass)) {
			RequestDispatcher rs = request.getRequestDispatcher("Home.jsp");
			rs.forward(request, response);
		} else {
			LOGGER.info("Usuario ou senha inválidos");
			out.println("Username or Password incorrect");
			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
			rs.include(request, response);
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOGGER.info("Passou no service");
		super.service(req, resp);
	}

}
