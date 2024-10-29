package Arrays;
import java.util.*;
public class LeaderArray {
    public static void main(String[] args) {
        int[] arr={12,3,20,4,8,5};
        System.out.println(leader(arr));
    }
    public static ArrayList<Integer> leader(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int max = arr[n - 1];
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
