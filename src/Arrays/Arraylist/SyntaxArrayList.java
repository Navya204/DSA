package Arrays.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyntaxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        System.out.println(list1);
//        System.out.println(list1.get(1)); ->error
        for(int i=4;i>0;i--){
            list2.add(i);
        }
        System.out.println(list2);
        System.out.println(list2.contains(7));
        Collections.sort(list2);
        System.out.println(list2);
    }
}
