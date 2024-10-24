package Maths.Euler;
import java.util.Scanner;

public class EulerTotient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=findEuler(n);
        System.out.println(res);
    }
    public static int findEuler(int n){
        int ans=n;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    n=n/i;
                }
                ans=ans-ans/i;
            }
        }
        if(n>1){
            ans=ans-ans/n;
        }
        return ans;
    }
}
