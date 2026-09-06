package ACTIBATERBONITY;

public class Student {
	
	// attributes for student
	private String name; 
	private float prelim;
	private float midterm;
	private float finalGrade;
	
	// constructor to initialize student info
	public Student(String name, float prelim, float midterm, float finalGrade) {
		this.name = name;
		this.prelim = prelim;
		this.midterm = midterm;
		this.finalGrade = finalGrade;
	}
	
	// calculate student's average grade
	public double calculateAverage() {
		return (prelim + midterm + finalGrade) / 3;
	}
	
	// determine whether student passed or failed based on average grade
	public String getStatus() {
		if (calculateAverage() >= 75) {
			return "PASSED";
		} else {
			return "FAILED";
		}
	}
	
	// determine letter grade based on average grade
	public String getLetterGrade() {
		double average = calculateAverage();
		
		if (average >= 95) {
			return "A";
		} else if (average >= 90) {
			return "A-";
		} else if (average >= 80) {
			return "B";
		} else if (average >= 75) {
			return "C";
		} else {
			return "F";
		}
	}
	
	// display student's info and grades
	public void displayStudentInfo() {
		System.out.println("\nStudent Name: " + name);
		System.out.printf("Average: %.2f%n", calculateAverage());
		System.out.println("Status: " + getStatus());
		System.out.println("Letter Grade: " + getLetterGrade());
	}
	
}
