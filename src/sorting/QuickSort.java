package sorting;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 50, 9, 1, 2, 9, 24};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[], int low, int high) {
        // code here
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        // your code here
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[low];
        arr[low]= arr[j];
        arr[j]= temp;
        return j;
    }
}

