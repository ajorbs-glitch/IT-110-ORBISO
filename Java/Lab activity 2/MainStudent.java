package ACTIBATERBONITY;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		
		// create Scanner for user input
		Scanner input = new Scanner(System.in);
		
		// getting student details from user
		System.out.print("Enter Student Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Prelim Grade: ");
		float prelim = input.nextFloat();
		
		System.out.print("Enter Midterm Grade: ");
		float midterm = input.nextFloat();
		
		System.out.print("Enter Final Grade: ");
		float finalGrade = input.nextFloat();
		
		// create student object using inputted info
		Student student = new Student(name, prelim, midterm, finalGrade);
		
		// display student info and calculated grades
		student.displayStudentInfo();
		
		// close Scanner
		input.close();
		
	}
}
