public class Method {
    public static void main(String[] args) {
        CheckEvenOdd(8);

    }
    public static void CheckEvenOdd(int number){
        if(number %2==0){
            System.out.println(number + " Even Number:");
        }else {
            System.out.println(number + " odd number:");
        }
    }
}
// This code defines a method to check if a number is even or odd and prints the result.
// The main method calls this function with the number 8, which is even, so it will print "8 Even Number:".
// The CheckEvenOdd method uses the modulus operator to determine if the number is even or odd. If the remainder when divided by 2 is zero, it prints that the number is even; otherwise, it prints that the number is odd.