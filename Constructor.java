class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	Customer(String cId, String cName, long contact, String add) {
		customerId = cId;
		customerName = cName;
		contactNumber = contact;
		address = add;
	}
}
public class Constructor {
// This program demonstrates the use of a constructor to initialize customer details.
	public static void main(String args[]) {
		Customer customer1 = new Customer("C103", "Jacob", 5648394590L,
				"13th Street, New York");
		System.out.println(customer1.customerId);
		System.out.println(customer1.customerName);
		System.out.println(customer1.contactNumber);
		System.out.println(customer1.address);
	}
}
