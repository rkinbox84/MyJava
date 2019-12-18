package com.rk.java.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar one = new GregorianCalendar(2010, 07, 10);
	      int day = one.get(Calendar.DAY_OF_WEEK);
	      System.out.println(day);
		
		int dayV = DayOfWeek.getDay(28, 01, 2013);
		
		System.out.println("Day of the week" + dayV);

	}
	
	
	public static int getDay(int day, int month, int year) {
		
		Calendar calendar = new GregorianCalendar(year,month-1,day);
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		
		return dayOfWeek;
		
	}

}
