package com.saajf.utilitarios.gener;

import java.time.LocalDate;
import java.time.LocalTime;

public class HelperDateTime {

	public static void main(String[] arg) {
		sqlDate();
	}

	public static java.sql.Date sqlDate() {
		java.sql.Date sqlDate = java.sql.Date.valueOf(LocalDate.now());
		System.out.println("date:" + sqlDate);
		return sqlDate;
	}

	public static java.sql.Date sqlDate(LocalDate localDate) {
		java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
		System.out.println("date:" + sqlDate);
		return sqlDate;
	}

	public static java.sql.Time sqlTime() {
		java.sql.Time sqlTime = java.sql.Time.valueOf(LocalTime.now());
		System.out.println("time:" + sqlTime);
		return sqlTime;
	}

	public static java.sql.Time sqlTime(LocalTime localTime) {
		java.sql.Time sqlTime = java.sql.Time.valueOf(localTime);
		System.out.println("time:" + sqlTime);
		return sqlTime;
	}
}
