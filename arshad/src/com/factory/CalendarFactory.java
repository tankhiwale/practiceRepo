package com.factory;

import com.base.ArshadCalendar;
import com.base.Calendar;
import com.base.GenericCalendar;

public class CalendarFactory {

	public static Calendar getCalendar(String type) {
		
		if(null == type) {
			return new GenericCalendar();
		}
		
		switch(type) {
			case "arshad" :  return new ArshadCalendar();
			default : return new GenericCalendar();
		}
		
		
	}
}
