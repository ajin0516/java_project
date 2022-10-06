package HomeWork;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strarr =str.split("[.]");
        System.out.printf("%s-%s-%s",strarr[2], strarr[1], strarr[0]);

    }
}

