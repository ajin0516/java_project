package HomeWork;

import java.util.Scanner;

public class CodeUp2623_X {
    private static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a-b;
            } else if (a < b) {
                b = b-a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
}
