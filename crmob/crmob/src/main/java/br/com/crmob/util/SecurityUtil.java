package br.com.crmob.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityUtil {

	private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();;
	
	private SecurityUtil(){
	}
	
	public static String encode(String text){
		return encoder.encode(text);
	}
}
