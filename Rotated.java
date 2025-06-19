class Rotated {
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target==arr[mid]){
                return mid;
            }
            // Check if the left part is sorted
            if(arr[start] <= arr[mid]){
                // Target is in the left part
                if(arr[start] <= target &&  target <= arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            // Right part is sorted
                else{
                    if(arr[mid] <= target && target <= arr[end]){
                        start = mid + 1;
                    }else{
                        end = mid - 1;
                    }
                }
            }
         return -1;
    }
}