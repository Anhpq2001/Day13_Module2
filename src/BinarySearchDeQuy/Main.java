package BinarySearchDeQuy;

public class Main {
    public static void main(String[] args) {
        int numberElementOfArray = Validation.checkEventPositiveNumber("Enter number of element array:", 0, Integer.MAX_VALUE);
        int[] array = BinarySearch.inputArray(numberElementOfArray);
        BinarySearch.quickSort(array, 0, numberElementOfArray - 1);
        int valueSearch = Validation.checkEventPositiveNumber("Enter number must search:", 0, Integer.MAX_VALUE);
        int foundIndex = BinarySearch.binarySearch(array, 0,numberElementOfArray-1, valueSearch);
        for(int i = 0; i<numberElementOfArray; i++){
            System.out.println(array[i]);
        }
        System.out.println("Found " + valueSearch + " at index: " + foundIndex);
    }
}
