package Arrays;

public class AppearOnce {
    public static void main(String[] args) {
        int[] arr={1,2,1,5,5,3,3};
        System.out.println(appearOnce(arr));

    }
    public static int appearOnce(int[] arr){
        int unique=0;
        for(int i:arr){
            unique^=i;
        }
        return unique;
    }
}
