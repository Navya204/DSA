package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args){
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int[][] ans = merge(arr);
        System.out.print("The merged intervals are: \n");
        for (int[]it : ans) {
            System.out.print("[" + it[0] + ", " + it[1] + "] ");
        }
        System.out.println();
    }
    public static int[][] merge(int[][] arr) {
        int n = arr.length; // size of the array
        // Sort the intervals by their start values:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        // List to hold merged intervals:
        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) { // select an interval:
            int start = arr[i][0];
            int end = arr[i][1];

            // Skip all the merged intervals:
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
                continue;
            }

            // Check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(new int[]{start, end});
        }

        // Convert the list to a 2D array:
        return ans.toArray(new int[ans.size()][]);
    }
}
