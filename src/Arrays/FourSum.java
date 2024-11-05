package Arrays;

import java.util.*;

public class FourSum {
    public static void main(String[] args){
        int[] nums={1,-1,4,0,-4,3,2,-1};
        List<List<Integer>> ans=fourSum(nums,5);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for the first number

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicates for the second number

                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) k++; // Skip duplicates for the third number
                        while (k < l && nums[l] == nums[l + 1]) l--; // Skip duplicates for the fourth number
                    }
                }
            }
        }

        return ans;
    }
}
