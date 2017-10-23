/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.mytime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateTimeTest {

	public static void main(String[] args) {
		testNow();
		testCreateAndGetValues();
		testParse();
		testFormat();
	}
  
	/**
	 * TASK: create current date, time, and date-time via now() and print them.
	 */
  public static void testNow() {
    // DONE
    LocalDate today = LocalDate.now();
	System.out.println(today);

	LocalTime now = LocalTime.now();
	System.out.println(now);

	LocalDateTime timestamp = LocalDateTime.now();
	System.out.println(timestamp);
  }
  
	public static void testCreateAndGetValues() {
		// DONE: create your birthday via of() and verify some of the fields are correct
		LocalDate bday = LocalDate.of(1966, 12, 5);
		System.out.format("Year is: %d\n",bday.getYear());
		System.out.format("Month is: %s\n", bday.getMonth());
		System.out.format("Day of month is: %d\n", bday.getDayOfMonth());
	}
	
	/**
	 * NOTE: verify these via visual inspection (sysout)
	 */
	public static void testParse() {
		// DONE: create your birthday by parsing a text representation in standard format
		LocalDate bday = LocalDate.parse("1966-12-05");
		if (!LocalDate.of(1966, 12, 5).equals(bday)) {
			System.out.println("Dates not equal");
		}


		// DONE OPTIONAL: create the training class start date-time by parsing text in the form "2/15/2016 @ 8:30am"
		// Note: the 'am' is deliberately lowercase.
		// solution 1: use a formatter builder to remove case sensitivity from the parse (example in coursebook).
		DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
		builder.parseCaseInsensitive().appendPattern("M/d/yyyy '@' h:mma");
		DateTimeFormatter formatter = builder.toFormatter();

		LocalDateTime classDateTime1 = LocalDateTime.parse("2/15/2016 @ 8:30am", formatter);
		if (!LocalDateTime.of(2016, 2, 15, 8, 30).equals(classDateTime1)) {
			System.out.println("classDateTime1 not equal");
		}

		// solution 2: pre-process the input text for easier parsing.
		String inputText = "2/15/2016 @ 8:30am";
		LocalDateTime classDateTime2 = LocalDateTime.parse(inputText.toUpperCase(), DateTimeFormatter.ofPattern("M/d/yyyy '@' h:mma"));
		if (!LocalDateTime.of(2016, 2, 15, 8, 30).equals(classDateTime2)) {
			System.out.println("classDateTime2 not equal");
		}
	}
	
	/**
	 * TASK: create format strings from the date below in these formats:
	 *  10/14/1066
	 *  14-10-1066
	 */
	public static void testFormat() {
	  LocalDate hastings = LocalDate.of(1066, 10, 14);

		// DONE: 10/14/1066
		String slashDate = hastings.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
		if (!slashDate.equals("10/14/1066")) {
			System.out.println("slashDate not equal");
		}

		// DONE: 14-10-1066
		String dashDate = hastings.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		if (!dashDate.equals("14-10-1066")) {
			System.out.println("dashDate not equal");
		}
	}
}