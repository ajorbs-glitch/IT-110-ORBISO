package ACTIBATERBONITY;

public class BankAccount {

	// bank account attributes
	private String accountNumber;
	private String accountName;
	private double balance;

	// constructor to initialize bank account info
	public BankAccount(String accountNumber, String accountName, double balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	// deposit method to add funds; negative deposits are not allowed
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful.");
		} else {
			System.out.println("Invalid deposit. Please input positive amount.");
		}
	}

	// withdraw method to remove funds; cannot withdraw more than the current balance
	public void withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println("Withdrawal Successful.");
		} else {
			System.out.println("Insufficient Balance.");
		}
	}

	// returns current account balance
	public double checkBalance() {
		return balance;
	}

	// display account information including account number, name, and remaining balance
	public void displayAccountInfo() {
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Account Name: " + accountName);
		System.out.printf("Remaining Balance: %.2f%n", balance);
	}

}
