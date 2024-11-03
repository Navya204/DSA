package Arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args){
        int[] nums={-9,3,-5,-1,7,4};
        int[] ans=rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[neg]=nums[i];
                neg+=2;
            }else{
                ans[pos]=nums[i];
                pos+=2;
            }
        }
        return ans;
    }
}
