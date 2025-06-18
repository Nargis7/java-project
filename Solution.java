/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);

        // Binary search in ascending part
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;

        // Binary search in descending part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }
    private int findPeak(MountainArray arr) {
        int start = 0, end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    private int binarySearch(MountainArray arr, int target, int start, int end, boolean ascending) {
    while (start <= end) {
        int mid = start + (end - start) / 2;
        int midVal = arr.get(mid);

        if (midVal == target) return mid;

        if (ascending) {
            if (target < midVal) end = mid - 1;
            else start = mid + 1;
        } else {
            if (target > midVal) end = mid - 1;
            else start = mid + 1;
        }
    }
    return -1;
}
}