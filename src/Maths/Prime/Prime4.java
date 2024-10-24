package Maths.Prime;
import java.util.Scanner;
//to print primes upto range

public class Prime4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] primes=new boolean[n+1];
        seive(n,primes);
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.println(i+" ");
            }
        }

    }
    public static void seive(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*i;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
    }
}
//time complexity is 0(nloglog(n))
