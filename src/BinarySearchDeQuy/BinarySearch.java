package BinarySearchDeQuy;

import java.sql.Array;

public class BinarySearch {
    // function to input elemnet in array
    public static int[] inputArray(int sizeArray){
        int[] newArray = new int[sizeArray];
        for(int i = 0; i < sizeArray; i++){
            newArray[i] = Validation.checkEventPositiveNumber("Enter element " + i +": ", 0, Integer.MAX_VALUE);
        }
        return newArray;
    }
    public static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };
        return i;
    }
    // function to quicksort
    public static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }
    // function to binary search
    public static int binarySearch(int[] array, int left, int right, int value){
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(array, left, middle - 1, value);
        } else {
            return binarySearch(array, middle + 1, right, value);
        }
    }
}
