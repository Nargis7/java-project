public class Switch {
    // This program demonstrates the use of switch statement to determine the unit price of a food item based on user input.
	public static void main(String[] args) {
		String orderedFood = "Pizza";
		switch (orderedFood) {
		case "Burger":
			System.out.println("You have ordered Burger. Unit price: $10");
			break;
		case "Pizza":
			System.out.println("You have ordered Pizza. Unit price: $15");
			break;
		case "Sandwich":
			System.out.println("You have ordered Sandwich. Unit price: $8");
			break;
		default:
			System.out.println("Invalid selection");
		}
	}
}
/* //Observe the output for different values of customerType
class Tester {
	public static void main(String[] args) {
		double discount;
		String customerType = "Premium";
		switch (customerType) {
		case "Regular":
			discount = 5;

		case "Premium":
			discount = 10;

		default:
			discount = 0;
		}
		System.out.println("Customer has got discount of " + discount + "%");
	}
} */