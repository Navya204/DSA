package Arrays;

import java.util.Arrays;
//problem link:https://leetcode.com/problems/rotate-array/description/

public class RightRotateKPlaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotateRight(arr,3);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotateRight(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        if (k > 0) {
            // Reverse first n-k elements
            reverse(arr, 0, n - k - 1);
            // Reverse last k elements
            reverse(arr, n - k, n - 1);
            // Reverse whole array
            reverse(arr, 0, n - 1);
        }
    }

    private static void reverse(int[] nums,int start, int end) {
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
