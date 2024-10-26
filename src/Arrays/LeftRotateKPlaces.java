package Arrays;
import java.util.Arrays;

public class LeftRotateKPlaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if (k > 0) {
            reverse(0,k-1,nums);
            reverse(k,n-1,nums);
            reverse(0,n-1,nums);
        }
    }

    private static void reverse(int start, int end,int[] nums) {
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
