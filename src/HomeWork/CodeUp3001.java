package HomeWork;

import java.util.Scanner;

public class CodeUp3001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt(); // nums개
        int[] numsbers = new int[nums]; // nums개만큼 입력하기
        for (int i = 0; i < nums; i++) {
            numsbers[i] = sc.nextInt();
        }
        int findnum = sc.nextInt(); // 찾을 숫자
        // 찾으면 위치 반환, 못찾으면 -1 반환
        for (int i = 0; i < nums; i++) {
            if(numsbers[i] == findnum){
                System.out.println(i+1);
            }else {
                numsbers.
            }
        }
    }
}



