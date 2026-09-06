package ACTIBATERBONITY;

public class Employee {

	// attributes for employee
	private String name;
	private float rate;
	private float hours;
	
	// constructor to initialize employee info
	public Employee(String name, float rate, float hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	// calculate regular pay up to 40 hrs
	public double calculateRegularPay() {
		if (hours <= 40) {
			return rate * hours;
		} else {
			return rate * 40;
		}
	}
	
	// calculate overtime pay for working hours beyond 40
	public double calculateOvertimePay() {
		if (hours > 40) {
			return (hours - 40) * rate * 1.5;
		} else {
			return 0;
		}
	}
	
	// calculate total salary by combining regular and overtime pay
	public double calculateSalary() {
		return calculateRegularPay() + calculateOvertimePay();
	}
	
	// display all employee info and salary details
	public void displayEmployeeInfo() {
		System.out.println("\nEmployee Name: " + name);
		System.out.printf("Hourly Rate: %.2f%n", rate);
		System.out.printf("Hours Worked: %.2f%n", hours);
		
		System.out.printf("%nRegular Pay: %.2f%n",  calculateRegularPay());
		System.out.printf("Overtime Pay: %.2f%n", calculateOvertimePay());
		System.out.printf("Total Salary: %.2f%n", calculateSalary());
		
	}
	
}

