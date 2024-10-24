package Maths.Euler;

import java.util.Scanner;

public class EulerRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=100000;
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=i;
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==i){
                for(int j=i;j<=n;j+=i){
                    arr[j]-=arr[j]/i;
                    //like ans=ans-ans/p
                }
            }
        }
        int t=sc.nextInt();
        for(int  i=1;i<=t;i++ ){
            int res=sc.nextInt();
            System.out.println(arr[res]);
        }
    }
}
