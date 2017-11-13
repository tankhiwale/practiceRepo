package com.test;

import com.base.Calendar;
import com.factory.CalendarFactory;

/**
 * @author arehmani
 *
 */
public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*common object creation process*/
		//Calendar calendar = new Calendar();
		
		/*Object creation using factory*/
		Calendar calendar1 = CalendarFactory.getCalendar("arshad");
		Calendar calendar2 = CalendarFactory.getCalendar(null);
		
		System.out.println("calendar1= "+calendar1.getCalendarName());
		System.out.println("calendar2= "+calendar2.getCalendarName());
		
		
	}

}
