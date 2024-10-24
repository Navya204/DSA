package Maths.Prime;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class SegmentedSeive {
    static boolean[] p = new boolean[31623];
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            System.out.println("Enter the value:");
            int N = sc.nextInt();
            int M = sc.nextInt();
            segSeive(N, M);
            System.out.println();
            t--;
        }
        sc.close();
    }

    public static void segSeive(int N, int M) {
        // Step 1: Create sieve up to sqrt(M)
        int sqrt = (int) (Math.sqrt(M));
        // Clear previous data
        p = new boolean[sqrt + 1];
        list.clear();
        for (int i = 2; i * i <= sqrt; i++) {
            if (!p[i]) {
                for (int j = i * i; j <= sqrt; j += i) {
                    p[j] = true;
                }
            }
        }
        // Storing in ArrayList
        for (int i = 2; i <= sqrt; i++) {
            if (!p[i]) {
                list.add(i);
            }
        }

        // Step 2: Create boolean array for range [N, M]
        boolean[] prime = new boolean[M - N + 1];
        for (int i = 0; i <= M - N; i++) {
            prime[i] = true;
        }

        // Step 3: Marking non-prime numbers
        for (int i : list) {
            int start = Math.max(i * i, (N + i - 1) / i * i); // n/i ..*i first multiple >= N
            for (int j = start; j <= M; j += i) {
                prime[j - N] = false;
            }
        }

        // Edge case for 1 if it's in the range
        if (N == 1) {
            prime[0] = false;
        }

        // Step 4: Printing primes in the range
        for (int i = 0; i <= M - N; i++) {
            if (prime[i]) {
                System.out.println(N + i);
            }
        }
    }
}
