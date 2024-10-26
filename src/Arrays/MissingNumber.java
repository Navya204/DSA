package Arrays;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr={1,3,4,5,6};
        int n=arr.length+1;
        System.out.println(missing1(arr,n));
        System.out.println(missing2(arr,n));
    }
    public static int missing1(int[] arr,int n){
        int missing=-1;
        if(arr[arr.length-1]!=n){
            return n;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                missing=i+1;
                //whenever we find our answer ,we have to break the loop
                break;
            }
        }
        return missing;
    }
    public static int missing2(int[] arr,int n){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor1^=arr[i];
            xor2^=(i+1);
        }
        xor1^=n;
        return xor1^xor2;
    }
}
