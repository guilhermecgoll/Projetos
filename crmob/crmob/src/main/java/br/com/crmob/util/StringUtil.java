package br.com.crmob.util;

import com.google.common.base.CharMatcher;

public class StringUtil {

	/**
	 * Extrai apenas os caracteres numéricos da String informada.
	 * @param value
	 * @return String contendo apenas números
	 */
	public static String getOnlyNumbers(String value){
		return CharMatcher.inRange('0', '9').retainFrom(value);
	}
}
