package BitManipulation;

import java.util.Scanner;

public class ResetithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(resetith(n, k));
    }
    public static int resetith(int n,int k){
        return n & ~(1<<(k-1));
    }
}
