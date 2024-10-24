package BitManipulation;

import java.util.Scanner;
//in place of 3 , we can put any odd number

public class AppearsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(appearsUniqueInOdd(arr));
    }
    public static int appearsUniqueInOdd(int[] arr){
        int res=0;
        for(int i=0;i<32;i++){
            int sum=0;
            for(int num:arr){
                if((num &(1<<i)) !=0){
                    sum++;
                }
            }
            if(sum%3!=0){
                res=res|(1<<i);
            }
        }
        return res;
    }

}
