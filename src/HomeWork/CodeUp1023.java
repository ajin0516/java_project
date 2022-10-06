package HomeWork;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String arr[] = str.split("[.]");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
