package br.com.carhistory.servlet;

import br.com.carhistory.hibernate.dao.UsuarioDAO;
import br.com.carhistory.hibernate.util.DaoFactory;

public class Validate {
	
	UsuarioDAO usuarioDao = DaoFactory.usuarioInstance();
	
	public static boolean checkUser(String email, String pass) {
		boolean ret = false;
     
     return ret;                 
 }   

}
