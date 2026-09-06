package ACTIBATERBONITY;

public class Product {

	// attributes for product
	private String productName;
	private double price;
	private int quantity;
	
	// constructor to initialize product info
	public Product(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	// calculate total price by multiplying price and quantity
	public double calculateTotal() {
		return price * quantity;
	}
	
	// calculate discount based on total purchase
	public double calculateDiscount() {
		double total = calculateTotal();
		
		if (total >= 10000) {
			return total * 0.20;
		} 
		else if (total >= 9999) {
			return total * 0.15;
		} 
		else if (total >= 4999) {
			return total * 0.10;
		}
		else {
			return 0;
		}
	}
	
	// calculate final amount after subtracting discount
	public double calculateFinalAmount() {
		return calculateTotal() - calculateDiscount();
	}
	
	// display complete order info
	public void displayOrder() {
		System.out.println("\nProduct: " + productName);
		System.out.printf("Price: %.2f%n", price);
		System.out.println("Quantity: " + quantity);
		System.out.printf("Total: %.2f%n", calculateTotal());
		System.out.printf("Discount: %.2f%n", calculateDiscount());
		System.out.printf("Final Amount: %.2f%n", calculateFinalAmount());
		
	}
}
