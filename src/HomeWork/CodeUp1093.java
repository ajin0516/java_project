package HomeWork;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[24];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[num-1]++;
        }

        for (int i = 0; i <arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



