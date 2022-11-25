package HomeWork;

import java.util.Scanner;

public class CodeUp2623 {
    private static int gcd(int num1, int num2) {
        if (num1 == num2) {
           return num1;
        }

        return gcd(num1 > num2 ? num1-num2 :num1, num1 < num2 ? num2 - num1 : num2) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(gcd(num1, num2));

    }
}
