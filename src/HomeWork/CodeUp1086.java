package HomeWork;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double res=(double)a*b*c/8/1024/1024;
        System.out.printf("%.2f MB",res);
    }
}




