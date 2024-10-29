package Arrays;
import java.util.*;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr={2,2,2,1,0,0,1,2,0,0};
        sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortZeroOneTwo(int[] arr) {
        int mid=0;
        int low=0;
        int n=arr.length;
        int high=n-1;
        for(int i=0;i<n;i++){
            if(arr[mid]==0){
                swap(mid,low,arr);
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                swap(mid,high,arr);
                high--;
            }
        }
    }
    public static void swap(int a,int b,int[] arr){
        int temp=arr[a];;
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
