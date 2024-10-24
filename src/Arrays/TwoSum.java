package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],i);
        }
        int target=13;
        System.out.println(Arrays.toString(twoSum(arr, mp, target)));

    }

    private static int[] twoSum(int[] arr, Map<Integer, Integer> mp, int target) {
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int more=target-a;
            if(mp.containsKey(more)){
                return new int[]{i,mp.get(more)};
            }
        }
        return new int[]{-1,-1};
    }
}
