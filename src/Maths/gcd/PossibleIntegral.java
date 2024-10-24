package Maths.gcd;

import java.util.Scanner;

class Output {
    int x, y;
    public Output(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class PossibleIntegral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            Output result1 = new Output(0, 0);
            int gcd = ex_gcd(a, b, result1);

            if (c % gcd == 0) {
                int x1 = result1.x * (c / gcd);
                int y1 = result1.y * (c / gcd);

                int lLimit = (int) Math.ceil((double)(-x1 * gcd) / b);
                int uLimit = (int) Math.floor((double)(y1 * gcd) / a);

                boolean foundSolution = false;
                int count = 0;

                for (int j = lLimit; j <= uLimit; j++) {
                    int resX = x1 + (b / gcd) * j;
                    int resY = y1 - (a / gcd) * j;
                    if (resX > 0 && resY > 0) {
                        if (!foundSolution) {
                            foundSolution = true;
                        }
                        count++;
                        System.out.println(resX + " " + resY);
                    }
                }

                if (!foundSolution) {
                    System.out.println(0);
                } else {
                    System.out.println(count);
                }
            } else {
                System.out.println("0");
            }
        }
    }

    public static int ex_gcd(int a, int b, Output result1) {
        if (b == 0) {
            result1.x = 1;
            result1.y = 0;
            return a;
        }
        Output tempResult = new Output(0, 0);
        int gcd = ex_gcd(b, a % b, tempResult);
        result1.x = tempResult.y;
        result1.y = tempResult.x - (a / b) * tempResult.y;
        return gcd;
    }
}
