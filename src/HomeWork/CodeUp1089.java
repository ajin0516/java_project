package HomeWork;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int result = a + (n-1) * b;
        System.out.println(result);
    }
}



