package Arrays;
import java.util.ArrayList;
public class IntersectionSortedArrays {
    public static void main(String[] args) {
        int[] a={1,2,2,3,5,6};
        int[] b={0,2,2,5,6,6,7};
        ArrayList<Integer> list=findIntersection(a,b);
        System.out.println(list);

    }
    public static ArrayList<Integer> findIntersection(int a[], int b[]) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length &&j<b.length){
            if(a[i]==b[j]){
                list.add(a[i]);
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }else{
                i++;
            }
        }
        return list;
    }
}
