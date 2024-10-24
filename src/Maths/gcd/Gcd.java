package Maths.gcd;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res;
        while(a>0 &&b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            System.out.println(b);
            return;
        }
        System.out.println(a);
        if(a>b){
            res=gcd(a,b);
        }else{
            res=gcd(b,a);
        }
        System.out.println(res);

    }
    //it gives 0(log(min(a,b))
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

}
