 public class LargestArray {
    public int splitArray(int[] nums, int k) {
        int low = getMax(nums);
        int high = getSum(nums);
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canSplit(nums, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    // Get the maximum value in the array
    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    // Get the sum of all values in the array
    private int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    // Check if we can split the array into k or fewer parts with maxSum limit
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int parts = 1;
        int currentSum = 0;
        for (int num : nums) {
            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {
                parts++;
                currentSum = num;
                if (parts > k) return false;
            }
        }
        return true;
    }
}