package br.com.crmob.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityUtil {

	private static BCryptPasswordEncoder encoder;
	
	private SecurityUtil(){
		encoder = new BCryptPasswordEncoder();
	}
	
	public static String encode(String text){
		return encoder.encode(text);
	}
}
