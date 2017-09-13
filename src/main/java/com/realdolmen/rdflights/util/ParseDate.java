package com.realdolmen.rdflights.util;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDate {
	public Date convertToDate(String date){
		try {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			return format.parse(date);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
