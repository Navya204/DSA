package Arrays;
import java.util.*;

public class CountSubXOR {
    public static void main(String[] args){
        ArrayList<Integer> A= new ArrayList<>(Arrays.asList(4,2,2,6,4));
        System.out.println(solve(A,6));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        Map<Integer,Integer> mp=new HashMap<>();
        int xr=0;
        int count=0;
        mp.put(xr,1);
        for(int i=0;i<n;i++){
            xr=xr^A.get(i);
            int x=xr^B;
            if(mp.containsKey(x)){
                count+=mp.get(x);
            }
            if(mp.containsKey(xr)){
                mp.put(xr,mp.get(xr)+1);

            }else{
                mp.put(xr,1);
            }
        }
        return count;
    }
}
