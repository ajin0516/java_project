package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strarr = str.split("");

        for(int i=0; i < strarr.length; i++) {
            System.out.print("[" + strarr[i]);

            for(int j = strarr.length-1; j>i; j--){
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}
