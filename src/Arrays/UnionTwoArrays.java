package Arrays;
import java.util.ArrayList;
//problem link :https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

public class UnionTwoArrays {
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,8};
        int[] b={0,4,5,6,6,7};
        ArrayList<Integer> list=findUnion(a,b);
        System.out.println(list);

    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = a.length;
        int n2 = b.length;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                    list.add(b[j]);
                }
                j++;
            }
        }

        // Add remaining elements from array `a`
        while (i < n1) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }

        // Add remaining elements from array `b`
        while (j < n2) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }

        return list;
    }
}
