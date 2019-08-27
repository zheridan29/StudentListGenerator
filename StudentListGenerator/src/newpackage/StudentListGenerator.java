package newpackage;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StudentListGenerator {

	static ArrayList<Student> studentDatabase = new ArrayList<Student>();

	public static void main(String[] args) {

		studentMain();

	}

	static void studentMain() {
		System.out.println(studentDatabase.size());
		System.out.println("=============================================");
		System.out.println("==Welcome to Student List Generator - Main!==");
		System.out.println("=============================================\n");

		System.out.println("Please choose an option.");
		System.out.println("1. Create Student Database.");
		System.out.println("2. Display Student Information.");
		System.out.println("3. Thank you for using the system!");

		int choice = Integer.parseInt(
				JOptionPane.showInputDialog("1. Create Student Database\n2. Display Student Information\n3. Exit"));

		if (choice == 1) {
			createStudentDatabase();
		} else if (choice == 2) {
			displayStudentInformation();
		} else if (choice == 3) {
			System.out.println("Thank you for using the system!");
			System.exit(0);
		} else {
		}
		System.out.println("Invalid Input!");
	}

	static void createStudentDatabase() {
		String name, course;
		int number;

		// declare a student object
		Student student;

		System.out.println("================================================");
		System.out.println("==Welcome to Studen List Generator - Database!==");
		System.out.println("================================================");

		// Input Data below
		name = JOptionPane.showInputDialog("Enter student name:");

		number = Integer.parseInt(JOptionPane.showInputDialog("Enter student number:"));

		course = JOptionPane.showInputDialog("Enter student course: ");

		// initialized the student object using the inputed data
		student = new Student(name, number, course);

		// add the student object to the arraylist
		if (studentDatabase.add(student)) {
			System.out.println("New Student Added!");
			JOptionPane.showMessageDialog(null, "New Student Added!");
		} else {
			System.out.println("Invalid Input!");
			JOptionPane.showMessageDialog(null, "Invalid Input!!");
		}

		// Option to create another student object or go to main menu

		int choice = Integer
				.parseInt(JOptionPane.showInputDialog("1. Add another student into Database\n2. Go to main menu"));

		System.out.println("Please select an option.");
		if (choice == 1) {

			// recursion calling a method within its own method
			createStudentDatabase();

		} else if (choice == 2) {

			// calling program main methods
			studentMain();
		} else {
			System.out.println("Invalid input!");
		}

	}

	static void displayStudentInformation() {

		// check 1st if Database is not empty
		if (studentDatabase.size() == 0) {
			JOptionPane.showMessageDialog(null, "Populate the Database first!");
			studentMain();
		}

		System.out.println("===========================================================");
		System.out.println("==Welcome to Studen List Generator - Display Information!==");
		System.out.println("===========================================================");

		int stdNum = Integer.parseInt(JOptionPane.showInputDialog("Enter the student number: "));

		int num = 0, found = 0;
		String name = "", course = "";

		// find the student tru student number using the database
		for (Student s : studentDatabase) {

			// if there is a match between user input and student number in the database,
			// get the info
			if (s.getStudentNumber() == stdNum) {
				name = s.getStudentName();
				num = s.getStudentNumber();
				course = s.getStudentCourse();
				found = 1;
			} else {
				// System.out.println("Student Record Not Found!");
				found = 0;
			}

		}

		// if there is a match
		if (found == 1) {

			System.out.println("Student Record Found!");
			System.out.println("Name: " + name);
			System.out.println("Student No: " + num);
			System.out.println("Course: " + course);

		} else if (found == 0) {
			JOptionPane.showMessageDialog(null, "Student Record Not Found!");
		}

		int choice = Integer
				.parseInt(JOptionPane.showInputDialog("1. Display Information of other student. \n2. Go to main menu"));

		System.out.println("Please select an option.");
		if (choice == 1) {

			// recursion calling a method within its own method
			displayStudentInformation();

		} else if (choice == 2) {

			// calling program main methods
			studentMain();
		} else {
			System.out.println("Invalid input!");
		}

	}

}
