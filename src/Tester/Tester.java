package Tester;

import java.util.Scanner;
class Tester {
    public static void main(String[] args) {
        // Implement your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=(int)Math.pow(2,i);
            System.out.println(sum);

        }
    }



}
