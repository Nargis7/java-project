public class BinarySearch{
    public static void main(String[] args){
        int arrayOfElements[] = {2,4,6,9,11, 12, 14 , 20 , 36 , 48};
        int elementToBeSearched = 36;
        int result = searchElement(arrayOfElements, elementToBeSearched);
        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
    public static int searchElement(int arrayOfElements[], int elementToBeSearched){
        int low = 0;
        int high = arrayOfElements.length - 1;
        int mid;
        while(low <= high)  {
            mid = (low + high)  / 2;
            if(arrayOfElements[mid] == elementToBeSearched) {
                return mid; // return index of the found element
            }
             
                if(arrayOfElements[mid] < elementToBeSearched)
                  {
                    low = mid + 1; // search in the right half
                  }
                
                else{
                    high = mid -1; // search in the left half
                }
                                   
                }
                return -1; // if not found
    }       
}
