package HomeWork;

import java.util.Scanner;
// 97 ~ 122 a~z
public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        for (int i = 97; i <= a ; i++) {
            char b = (char)i;
            System.out.print(b);
            System.out.print(" ");
        }

    }
}


