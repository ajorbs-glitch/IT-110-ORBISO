package ACTIBATERBONITY;

import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
		
		// create Scanner object for user inputs
		Scanner input = new Scanner(System.in);
		
		// getting employee details from user
		System.out.print("Enter Employee Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Hourly Rate: ");
		float rate = input.nextFloat();
		
		System.out.print("Enter Hours Worked: ");
		float hours = input.nextFloat();
		
		// creates employee object using the inputted information
		Employee employee = new Employee(name, rate, hours);
		
		// display employee info and calculated salary
		employee.displayEmployeeInfo();
		
		// closes Scanner
		input.close();
	}

}
