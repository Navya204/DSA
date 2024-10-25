package Arrays;
//problem link :https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={12,78,78,30,23};
        System.out.println(getSecondLargest(arr));

    }
    public static int getSecondLargest(int[] arr) {
        int n=arr.length;
        if(n<2){
            return -1;
        }
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if((arr[i]!=largest) && (arr[i]>slargest)){
                slargest=arr[i];
            }
        }
        return slargest;
    }
}
