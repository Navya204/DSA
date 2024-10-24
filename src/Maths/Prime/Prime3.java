package Maths.Prime;

import java.util.Scanner;
//what if the question print prime numbers upto this range

public class Prime3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //no of test cases
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            if(isPrime3(i)) {
                System.out.println(i);
            }
        }
        //time complexity of this loop is o(n)
    }
    public static boolean isPrime3(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //time complexity of this function is o(sqrt(n))
    //so total complexity is o(n *sqrt(n))
    //to optimize this ,**seive of erastosthenes**
}


