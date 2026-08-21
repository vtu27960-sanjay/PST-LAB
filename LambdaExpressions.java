import java.io.*;
import java.util.*;

public class Solution {

    interface PerformOperation {
        boolean check(int a);
    }

    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return n -> {
            if (n < 2) {
                return false;
            }

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            int original = n;
            int reversed = 0;

            while (n > 0) {
                reversed = reversed * 10 + n % 10;
                n /= 10;
            }

            return original == reversed;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int condition = sc.nextInt();
            int number = sc.nextInt();

            PerformOperation op;

            if (condition == 1) {
                op = isOdd();
                System.out.println(op.check(number) ? "ODD" : "EVEN");
            } 
            else if (condition == 2) {
                op = isPrime();
                System.out.println(op.check(number) ? "PRIME" : "COMPOSITE");
            } 
            else {
                op = isPalindrome();
                System.out.println(op.check(number) ? "PALINDROME" : "NOT PALINDROME");
            }
        }

        sc.close();
    }
}
