package BitManipulation;

import java.util.Scanner;
//this is for even appearance

public class AppearsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(appearsOnce(arr));
    }
    public static int appearsOnce(int[] arr){
        int unique=0;
        for(int i:arr){
            unique^=i;
        }
        return unique;
    }
}
