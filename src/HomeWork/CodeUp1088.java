package HomeWork;

import java.util.Scanner;

public class CodeUp1088 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        while (i < num){
            i++;
            if(i % 3 == 0){
              continue;
            }
            System.out.print(i + " ");
        }

    }
}



