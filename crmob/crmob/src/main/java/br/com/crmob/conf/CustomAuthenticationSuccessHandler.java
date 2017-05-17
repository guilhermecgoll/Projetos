package br.com.crmob.conf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import br.com.crmob.model.Usuario;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest httpRequest, HttpServletResponse httpResponse,
			Authentication auth) throws IOException, ServletException {
		
		//TODO definir logica para redirect do usuário de acordo com seu nível de permissão
		HttpSession session = httpRequest.getSession();
        Usuario authUser = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        session.setAttribute("username", authUser.getUsername());
        session.setAttribute("authorities", auth.getAuthorities());
 
        //set our response to OK status
        httpResponse.setStatus(HttpServletResponse.SC_OK);
 
        //since we have created our custom success handler, its up to us to where
        //we will redirect the user after successfully login
        httpResponse.sendRedirect("para-voce");
	}

}
