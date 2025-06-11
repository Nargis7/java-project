import java.util.Arrays;
public class PassinginFunction{
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums)); // Output: 1
        change(nums);
        System.out.println(Arrays.toString(nums)); // Output: 10

    }
    public static void change(int[] arr){
        arr[0] = 10; // This will change the first element of the array to 10
    }
}
/* Arrays in Java are passed by reference, so changes inside the function affect the original array. */