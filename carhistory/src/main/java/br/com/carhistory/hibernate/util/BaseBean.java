package br.com.carhistory.hibernate.util;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class BaseBean implements Serializable {
	
	private static final long serialVersionUID = -2318509327538936420L;
	
	@Override
	public String toString() {		
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	@Override
	public boolean equals(Object obj) {		
		return EqualsBuilder.reflectionEquals(this, obj);
	}

}
