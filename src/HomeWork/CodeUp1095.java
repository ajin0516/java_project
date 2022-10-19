package HomeWork;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        int min = arr[0];
        for (int j = 1; j < n; j++) {
                if(min > arr[j]){
                    min = arr[j];
            }
        }
        System.out.println(min);
    }
}



