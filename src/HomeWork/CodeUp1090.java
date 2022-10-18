package HomeWork;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int a = sc.nextInt();
        int n = sc.nextInt();

         long result = start * (long)Math.pow(a,n-1);
        System.out.println(result);
    }
}



