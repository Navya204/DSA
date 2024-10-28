package Arrays;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr={0,1,3,6,2,4};
        int n=arr.length;
        System.out.println(missing1(arr,n));
    }
    public static int missing1(int[] nums,int n){
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans ^ i;
        }
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

}
