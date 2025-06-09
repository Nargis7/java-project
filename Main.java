public class Main {
    public static void main(String[] args) {
        // Declare variables
        double principal = 5000;     // in currency
        double rate = 10;            // annual interest rate in %
        double time = 5;             // time in years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest is: " + simpleInterest);
    }
    }