package Arrays;

import java.util.ArrayList;

public class MissingRepeating {
    public static void main(String[] args){
        int[] arr={4,3,2,1,2,5};
        System.out.println(findTwoElement(arr));
    }
    public static ArrayList<Integer> findTwoElement(int arr[]) {
        long n=arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        // Expected Sum and Sum of squares
        long SN = (n * (n + 1L)) / 2;
        long S2N = (n * (n + 1L) * (2 * n + 1L)) / 6;

        // Actual Sum and Sum of squares
        long S = 0;
        long S2 = 0;
        for (int i = 0; i < arr.length; i++) {
            S += arr[i];
            S2 += (long) arr[i] * (long) arr[i];
        }

        long val1 = S - SN;     // x - y
        long val2 = S2 - S2N;   // x^2 - y^2

        long x = (val1 + val2 / val1) / 2;
        long y = x - val1;

        ans.add((int)x);  // Missing element
        ans.add((int)y);  // Repeated element

        return ans;
    }
}
