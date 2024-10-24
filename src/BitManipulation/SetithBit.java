package BitManipulation;

import java.util.Scanner;

public class SetithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(setith(n, k));
    }
    public static int setith(int n,int k){
        return n |(1<<(k-1));
    }

}
