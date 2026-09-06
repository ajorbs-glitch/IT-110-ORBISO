package ACTIBATERBONITY;

import java.util.Scanner;

public class MainBankAccount {
	public static void main(String[] args) {
		
		// create Scanner object for user input
		Scanner input = new Scanner(System.in);

		// getting bank account details from user
		System.out.print("Enter Account Number: ");
		String accountNumber = input.nextLine();

		System.out.print("Enter Account Name: ");
		String accountName = input.nextLine();

		System.out.print("Enter Initial Balance: ");
		double balance = input.nextDouble();

		// create bank account object using inputted info
		BankAccount account = new BankAccount(
				accountNumber,
				accountName,
				balance);

		// gets deposit amount and adds it to the account balance
		System.out.print("Enter Deposit Amount: ");
		double depositAmount = input.nextDouble();
		account.deposit(depositAmount);

		// gets withdrawal amount and attempts to withdraw it from the account balance
		System.out.print("\nEnter Withdrawal Amount: ");
		double withdrawAmount = input.nextDouble();
		account.withdraw(withdrawAmount);

		// display final account info
		account.displayAccountInfo();

		// close Scanner
		input.close();
	}
}
