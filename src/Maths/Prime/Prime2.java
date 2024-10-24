package Maths.Prime;
import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //no of test cases
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            if (isPrime2(n)) {
                System.out.println("Yes Prime");
            } else {
                System.out.println("Not Prime");
            }
            t--;
        }
    }
    public static boolean isPrime2(int n){
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

}
//here time complexity is O(sqrt(n))

