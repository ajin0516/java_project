package HomeWork;

import java.util.Scanner;

public class CodeUp1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if ((i == 3) || (i == 6) || (i == 9)) {
                System.out.print("X");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }

    }
}


