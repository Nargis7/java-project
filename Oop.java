// Define the Customer class
class Customer {
    // Attributes
    String name;
    String contactNumber;
    String address;
    int id;

    // Method to display customer details
    void displayDetails() {
        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + address);
        System.out.println("Thank you for your order!");
        System.out.println("We will contact you soon.");
    }
}

// Main class to run the program
public class Oop {
    public static void main(String[] args) {
        // Creating an object (instance) of Customer
        Customer customer1 = new Customer();

        // Assigning values to attributes
        customer1.id = 101;
        customer1.name = "Nargis Perween";
        customer1.contactNumber = "9876543210";
        customer1.address = "Ranchi, Jharkhand";

        // Calling method to display details
        customer1.displayDetails();
    }
}
