package HomeWork;

import java.util.Scanner;

public class CodeUp1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a == 1 && b == 1)||(a == 0 && b == 0)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}

