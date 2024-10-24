package Recursion;

public class Reverse {
    public static void main(String[] args) {
        reverse(7342);


    }
    static int sum=0;
    public static void reverse(int n){
        if(n==0){
            System.out.println(sum);
            return;
        }
        int a=n%10;
        sum=sum*10+a;
        reverse(n/10);
    }
}
