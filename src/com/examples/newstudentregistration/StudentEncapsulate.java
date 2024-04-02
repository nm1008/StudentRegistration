package com.examples.newstudentregistration;

public class StudentEncapsulate {
	private String first_name, last_name, course;
	private int year;
	private char section;

	StudentEncapsulate(String first_name, String last_name, String course, int year, char section) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.course = course;
		this.year = year;
		this.section = section;
	}

	void introduceSelf() {
		System.out.println("First Name: " + first_name);
		System.out.println("Last Name: " + last_name);
		System.out.println("Course: " + course);
		System.out.println("Year: " + year);
		System.out.println("Section: " + section);
		System.out.println();

	}
}
