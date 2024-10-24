package Maths.Euler;

import java.util.Arrays;
import java.util.Scanner;

public class EulerPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array size
        int n = sc.nextInt();
        //no of queries
        int q=sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        //prefix sum array
        int[] pre = new int[n + 1];
        //initially filling all values with 0
        Arrays.fill(pre, 0);
        for (int i = 1; i <= n; i++) {
            //we are counting from value 1,so 0 index no need
            pre[i] = pre[i - 1];
            if (isPrime(findEuler(arr[i]))){
                pre[i]++;
            }
        }
        int l,r;
        for(int i=0;i<q;i++){
            l=sc.nextInt();
            r=sc.nextInt();
            System.out.println(pre[r]-pre[l-1]);
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int findEuler(int n) {
        int ans = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n = n / i;
                }
                ans = ans - ans / i;
            }
        }
        if (n > 1) {
            ans = ans - ans / n;
        }
        return ans;

    }
}
