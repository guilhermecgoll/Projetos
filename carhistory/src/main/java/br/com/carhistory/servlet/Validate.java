package br.com.carhistory.servlet;

import br.com.carhistory.hibernate.dao.UsuarioDAO;
import br.com.carhistory.hibernate.util.DaoFactory;
import br.com.carhistory.model.Usuario;

public class Validate {
	
	public Validate(){
		super();
	}
	
	public static boolean checkUser(String email, String pass) {
		UsuarioDAO usuarioDao = DaoFactory.usuarioInstance();
		boolean ret = false;
		Usuario usuario = usuarioDao.getUserByEmailAndPass(email, pass);
		
		if (usuario != null) {
			ret = true;
		}
     
     return ret;                 
 }   

}
