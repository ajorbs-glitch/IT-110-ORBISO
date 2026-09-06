package ACTIBATERBONITY;

import java.util.Scanner;

public class MainProduct {
	public static void main(String[] args) {

		// create Scanner for user input
		Scanner input = new Scanner(System.in);
		
		// getting product details from user
		System.out.print("Enter Product Name: ");
		String productName = input.nextLine();
		
		System.out.print("Enter Price: ");
		double price = input.nextDouble();
		
		System.out.print("Enter Quantity: ");
		int quantity = input.nextInt();
		
		// create product object using inputted info
		Product product = new Product(
				productName,
				price,
				quantity
		);
		
		// display complete order info
		product.displayOrder();
		
		// close Scanner
		input.close();
	}
}
