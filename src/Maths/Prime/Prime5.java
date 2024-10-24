package Maths.Prime;
import java.util.ArrayList;
import java.util.Scanner;
//print kth prime number

public class Prime5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=86028121;//this is 5000000th prime number ,change according to the question
        boolean[] primes2=new boolean[n+1];
        seiveEra(n,primes2);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=2;i<=n;i++){
            if(!primes2[i]){
                list.add(i);
            }
        }
        System.out.println(list.get(k));

    }
    public static void seiveEra(int n,boolean[] primes2) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes2[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes2[j] = true;
                }
            }
        }

    }

}
