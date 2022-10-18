package HomeWork;

import java.util.Scanner;
// 시간초과
public class CodeUp1084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int count = 0;

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                for (int k = 0; k < num3; k++) {
                    System.out.printf("%d %d %d\n",i,j,k);
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}


