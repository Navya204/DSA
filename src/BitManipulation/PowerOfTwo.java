package BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //optimized way
        boolean isPower= n>0 && (n&(n-1))==0;
        System.out.println(isPower);
        System.out.println(checkPower(n));
    }
    public static boolean checkPower(int n){
        //brute force
        int count=0;
        if(n==0 ||n==1){
            return false;
        }
       for(int i=0;i<32;i++){
           if((n&1)==1){
               count++;
           }
           n=n>>1;
       }
       return count==1;
    }
}
