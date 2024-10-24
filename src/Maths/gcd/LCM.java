package Maths.gcd;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd;
        if(a>b) {
            gcd = findGcd(a, b);
        }
        else{
            gcd=findGcd(b,a);
        }
        int lcm=Math.abs(a*b)/gcd;
        System.out.println(lcm);
    }
    public static int findGcd(int a,int b){
        if(b==0){
            return a;
        }
        return findGcd(b,a%b);
    }
}
