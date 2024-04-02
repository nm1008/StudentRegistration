package com.examples.newstudentregistration;

import java.util.Scanner;

public class StudentRegistrationRunner {

	public static void main(String[] args) {
//		StudentEncapsulate s1 = new StudentEncapsulate("Nikko", "Mallari", "HRM", 2024, 'A');

		Scanner input = new Scanner(System.in);

		// scanner to ask how many student to and pass the value to StudentEncapsulate[]
		System.out.println("Enter the number of students");
		int numberOfStudents = input.nextInt();
		System.out.println();

		// initializes to create an array (size depends on the scanner input)
		StudentEncapsulate[] student = new StudentEncapsulate[numberOfStudents];

		// loops over the code block depends on the student array length
		for (int i = 0; i < student.length; i++) {

			System.out.print("Enter first name: ");
			String first_name = input.next();

			System.out.print("Enter last name: ");
			String last_name = input.next();

			System.out.print("Enter course: ");
			String course = input.next();

			System.out.print("Enter year: ");
			int year = input.nextInt();

			System.out.print("Enter section: ");
			char section = input.next().charAt(0);

			System.out.println("Student " + (i + 1) + " was added to the list.");
			System.out.println();

			// adding the student details to the student array
			student[i] = new StudentEncapsulate(first_name, last_name, course, year, section);
		}

		// for each loop and calling s.introduceSelf()
		for (StudentEncapsulate s : student) {
			s.introduceSelf();
		}

	}
}
