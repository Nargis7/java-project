public class ArrayLoop {
    // This program demonstrates how to loop through an array of restaurant contact numbers
	public static void main(String[] args) {
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		for (int index = 0; index < restaurantContacts.length; index++) {
			// Accessing element at position index
			System.out.println(restaurantContacts[index]);
		}
	}
}
// Output:
// 9992346725
