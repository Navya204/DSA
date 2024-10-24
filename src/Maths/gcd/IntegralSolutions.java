package Maths.gcd;

import java.util.Scanner;

class Result {
    int x, y;
    public Result(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class IntegralSolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int gcd=0;
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Result result = new Result(0, 0);
            if(a>b){
                gcd=ex_gcd(a,b,result);
            }else{
                gcd = ex_gcd(b, a, result);
            }

            if (c % gcd == 0) {
                int x0 = result.x * (c / gcd);
                int y0 = result.y * (c / gcd);
                System.out.println(x0 + " " + y0);
            } else {
                System.out.println("Case " + i + ": No");
            }
        }
    }

    public static int ex_gcd(int a, int b, Result result) {
        if (b == 0) {
            result.x = 1;
            result.y = 0;
            return a;
        }
        Result  tempResult = new Result(0, 0);
        int gcd = ex_gcd(b, a % b, tempResult);
        result.x = tempResult.y;
        result.y = tempResult.x - (a / b) * tempResult.y;
        return gcd;
    }
}


