package com.benpot.model.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

public class DateConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		System.out.println("c1");
		if(values != null && values.length > 0 ) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				return sdf.parse(values[0]);
			} catch (ParseException e) {
				throw new TypeConversionException(e);
			}
		}
		return null;
	}

	@Override
	public String convertToString(Map contect, Object o) {
		System.out.println("c2");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if(o instanceof Date) {
			return sdf.format(o);
		}
		return null;
	}

}
