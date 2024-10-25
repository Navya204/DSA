package Arrays;
public class LongestElement {
    public static void main(String[] args){
        int[] arr={234,13,7,9,134};
        int n=arr.length;
        System.out.println(largest(arr,n));

    }

    public static int largest(int arr[], int n) {
        // Code Here
        int largest=arr[0];
        if(n==1){
            return largest;
        }
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;

    }



}
