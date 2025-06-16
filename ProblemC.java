// smallest integer in the array that is greater than or equal to the target
public class  ProblemC {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;
        int ans = findCeil(arr, target);
        // System.out.println("Ceiling of " + target + " is: " + arr[ans]);
        System.out.println(ans);
    }

    public static int findCeil(int[] arr, int target){
        if(target > arr[arr.length - 1]){
            return -1; // No ceiling exists
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start; // index of the ceiling
    }
}
