package Arrays;
import java.util.Arrays;
//problem link:https://leetcode.com/problems/move-zeroes/

public class MoeZeroes {
    public static void main(String[] args) {
        int[] nums={1,0,4,0,0,3,5,6};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));


    }
    public static void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j!=-1){
            for(int i=j+1;i<nums.length;i++){
                if(nums[i]!=0){
                    swap(i,j,nums);
                    j++;
                }
            }
        }
    }
    public static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
