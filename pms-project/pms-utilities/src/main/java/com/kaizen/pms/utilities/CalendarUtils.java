package com.kaizen.pms.utilities;

import java.util.Calendar;
import java.util.Date;

public class CalendarUtils {
	
	public static long getYear(Date date) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		int year       = calendar.get(Calendar.YEAR);
		
		return year;
	}
	
	public static int getMonth(Date date) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		int month      = calendar.get(Calendar.MONTH);
		
		return month;
	}
	
	public static long getDayOfMonth(Date date) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
		
		return dayOfMonth;
	}

	public static long getDayOfWeek(Date date) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		
		return dayOfWeek;
	}
}
