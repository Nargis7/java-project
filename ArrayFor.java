public class ArrayFor {
    // This program demonstrates the use of an array and a for loop to print restaurant contact numbers.
	public static void main(String[] args) {
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		for (long contactNumber : restaurantContacts) {
			System.out.println(contactNumber);
		}
	}
}
