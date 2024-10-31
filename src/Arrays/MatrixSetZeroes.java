package Arrays;
import java.util.Arrays;

public class MatrixSetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0, 1},
                {1, 1, 1, 1}
        };
        setZeroes(matrix);
        for(int[] it:matrix){
            System.out.println(Arrays.toString(it));
        }
    }

    public static void setZeroes ( int[][] matrix){
            int n = matrix.length;
            int m = matrix[0].length;
            int col0 = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == 0) {
                        //mark ith row
                        matrix[i][0] = 0;
                        //mark jth col
                        if (j != 0) {
                            matrix[0][j] = 0;
                        } else {
                            col0 = 0;
                        }
                    }
                }
            }
            // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (matrix[i][j] != 0) {
                        if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                            matrix[i][j] = 0;
                        }
                    }
                }
            }
            //step 3: Finally mark the 1st col & then 1st row:
            if (matrix[0][0] == 0) {
                for (int j = 0; j < m; j++) {
                    matrix[0][j] = 0;
                }
            }
            if (col0 == 0) {
                for (int i = 0; i < n; i++) {
                    matrix[i][0] = 0;
                }
            }
    }
}
