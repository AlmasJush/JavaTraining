package com.almas.stackanswer;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormat {

	public static void main(String[] args) {
		
		DateFormat locateDate = DateFormat.getTimeInstance(DateFormat.SHORT, new Locale("vi", "VN"));

		System.out.println(DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN).format(new Date()));
		System.out.println(locateDate.format(new Date()));
	}

}
