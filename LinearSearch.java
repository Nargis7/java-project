public class LinearSearch{
    public static void main(String[] args){
        int[] arrayOfElement = {10, 20, 30, 40, 50};
        int elementToBeSearch = 30;
        
        int index = Search(arrayOfElement, elementToBeSearch);
        
        if(index != -1){
            // System.out.println("Element found at index: " + index);
                        System.out.println("Element found at index: " + index + ", Value: " + arrayOfElement[index]);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
    public static int Search(int arrayOfElement[] , int elementToBeSearch){
        for(int index = 0; index < arrayOfElement.length; index++){
            if(arrayOfElement[index] == elementToBeSearch){
                return index; // Return the index of the found element
            }
        }      
          return -1; // Return -1 if the element is not found
    }
}