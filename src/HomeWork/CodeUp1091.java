package HomeWork;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        long n = sc.nextInt();

        long f = a;

        for (int i = 0 ; i < n-1; i++) {
            if(i==0){
                f = a;
            }
            f = f * m + d;
        }
        System.out.println(f);
    }
}



