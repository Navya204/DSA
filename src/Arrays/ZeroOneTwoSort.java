package Arrays;
public class ZeroOneTwoSort {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,2,1,0,0,2,1,2};
        System.out.println(arr);
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(low,mid,arr);
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(mid,high,arr);
                high--;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void swap(int a,int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
