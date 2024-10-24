package BitManipulation;

import java.util.Scanner;

public class FindithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findith(n,k));
    }
    public static int findith(int n,int k){
        return (n&(1<<k-1))>>k-1;

    }

}
