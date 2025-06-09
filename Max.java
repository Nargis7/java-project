 public class Max {
	public static void main(String[] args) {
		// Implement your code here 
		int num1 = 3;
		int num2 = 4;
		int num3 = 1;
		int max;
		if(num1 >=num2 && num2 >= num1){
		    max=num1;
		}
		else if(num2> num3){
		    max=num2;
		}
		else{
		    max=num3;
		}
        System.out.println("The maximum number is: " + max);
	}
}

