package BitManipulation;

import java.util.Scanner;

public class NoOfDigitsBaseB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int count = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println((int)Math.log10(n)+1);
        System.out.println(count);
    }
}
