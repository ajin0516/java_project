package HomeWork;

import java.util.Scanner;

public class CodeUp1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] m = new int[a];

        for (int i = 0; i < a; i++) {
            m[i] = sc.nextInt();
            System.out.println(m[i]);
        }
    }
}


