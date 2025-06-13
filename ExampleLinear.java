 public class ExampleLinear {

    public static int searchElement(int[] elements, int elementToBeSearched) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == elementToBeSearched) {
                return i + 1; // return number of iterations to find the element
            }
        }
        return -1; // if not found
    }

    public static void main(String[] args) {
        int[] elements1 = {76, 24, 78, 98, 1};
        int elementToBeSearched1 = 78;
        System.out.println(searchElement(elements1, elementToBeSearched1)); // Output: 3

        int[] elements2 = {234, 345, 367, 387, 456, 675, 654};
        int elementToBeSearched2 = 346;
        System.out.println(searchElement(elements2, elementToBeSearched2)); // Output: -1
    }
}
