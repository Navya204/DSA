package Arrays;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args){
        int[] nums={1,-1,4,0,-4,3,2,-1};
        List<List<Integer>> ans=threeSum(nums);
        for(List<Integer> list:ans){
            System.out.println(list);
        }

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k &&nums[j]==nums[j-1]){
                        j++;
                    }while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}
