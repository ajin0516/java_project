package HomeWork;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day1 = sc.nextInt();
        int day2 = sc.nextInt();
        int day3 = sc.nextInt();

        int day = 1;

        while (day % day1 != 0 || day % day2 != 0 || day % day3 != 0){
            day++;
        }
        System.out.println(day);
    }
}



