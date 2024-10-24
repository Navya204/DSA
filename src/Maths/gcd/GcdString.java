package Maths.gcd;
import java.util.Scanner;

public class GcdString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String res = gcdOfStrings(str1, str2);
        System.out.println(res);
    }

    public static String gcdOfStrings(String str1, String str2) {
        String remainder;
        if (str2.equals("")) {
            return str1;
        }

        if (str1.length() > str2.length()) {
            return gcdOfStrings(str2, str1);
        }

        // If str2 starts with str1, continue to remove str1 from the start of str2
        if (str2.startsWith(str1)) {
            return gcdOfStrings(str1, str2.substring(str1.length()));
        }

        // If str2 doesn't start with str1, no common divisor exists
        return "";
    }
}

