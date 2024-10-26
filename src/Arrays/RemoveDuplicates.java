package Arrays;
//problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1433865217/
public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,3,6};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }else if(nums[i]==nums[j]){
            }
        }
        return i+1;
    }
}
