package Arrays;

public class SyntaxArray {
    public static void main(String[] args) {
        int[] arr=new int[3];
        int[] arr1={1,2,3};
        int arr2[] =new int[4];
        //int arr3=new int[3]; ->error
        /*int[] arr4;
        System.out.println(arr4[0]); ->error because of not intializing the array*/
      //  int[9] arr6=new int[9]; ->error
        int[] arr4={1,2,3};
        System.out.println(arr2[2]);


        //2-D array
        int[][] arr5=new int[2][];
        System.out.println(arr5[1]);// null because it is object now
        //  System.out.println(arr5[1][0]) ->error; we didnt intialize the column
        // -> int[][] arr7=new int[][5]; row should intialize
        int[][] arr8=new int[4][7];
       //int[3][] arr9=new int[][];
        //we should not intialize the array when compilation time i.e left side

        int arr9[][]=new int[5][4];
        System.out.println(arr9[4][1]);


    }
}
