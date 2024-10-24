package Maths.Prime;
import java.util.Scanner;

import java.util.ArrayList;

public class Prime6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        boolean[] primes2=new boolean[1001];
        seiveEra(primes2);
        ArrayList<Integer> list=new ArrayList<>();
//        list.add(0);
        for(int i=2;i<=1000;i++){
            if(!primes2[i]){
                list.add(i);
            }
        }
//        System.out.println(list);
         int count=0;
        int a=0;
        int i=0;
        while(a<=n){
             a=list.get(i)+list.get(i+1)+1;
              i++;
            if(list.contains(a)){
                count++;
            }
            if(count>=k){
                System.out.println("true");
                return;
            }

        }

            System.out.println("false");

}
    public static void seiveEra(boolean[] primes2) {
        for (int i = 2; i * i <= 1000; i++) {
            if (!primes2[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    primes2[j] = true;
                }
            }
        }

    }
}
