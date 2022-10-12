package HomeWork;

import java.util.Scanner;

public class CodeUp1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(~a);

    }
}

/*
~n = -n-1
-n = ~n+1
 */
