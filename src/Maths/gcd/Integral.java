package Maths.gcd;

import java.util.Scanner;

public class Integral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int a,b,c,res;
        for(int i=1;i<=t;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a>b){
                res=findGcd(a,b);
            }else{
                res=findGcd(b,a);
            }
            if(c%res==0){
                System.out.println("Case "+i+": Yes");
            }else{
                System.out.println("Case "+i+": No");
            }
        }

    }
    public static int findGcd(int a,int b){
        if(b==0)
            return a;
        return findGcd(b,a%b);
    }
}
