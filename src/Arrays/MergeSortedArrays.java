package Arrays;
import java.util.*;
public class MergeSortedArrays {
    public static void main(String[] args){
        int[] arr1={1,4,10,12};
        int[] arr2={3,5,9,0};
        merge(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void merge(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if(left<n && right>=n){
                    swap(arr1,arr2,left,right-n);
                }else if(left>=n){
                    swap(arr2,arr2,left-n,right-n);
                }else{
                    swap(arr1,arr1,left,right);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
    }
    public static void swap(int[] arr1,int[] arr2,int ind1,int ind2){
        if(arr1[ind1]>arr2[ind2]){
            int temp=arr1[ind1];
            arr1[ind1]=arr2[ind2];
            arr2[ind2]=temp;
        }
    }
}
