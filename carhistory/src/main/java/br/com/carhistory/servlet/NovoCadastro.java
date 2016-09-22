package br.com.carhistory.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class NovoCadastro extends HttpServlet{
	
	private static final long serialVersionUID = -7822140236163958974L;
	
	private static final Logger LOGGER = Logger.getLogger(NovoCadastro.class);
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		LOGGER.info("Passou por aqui");
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOGGER.info(req.getParameter("firstname"));
		LOGGER.info(req.getParameter("lastname"));
		LOGGER.info(req.getParameter("email"));
		LOGGER.info(req.getParameter("password"));
		
		super.doPost(req, resp);
	}

}
