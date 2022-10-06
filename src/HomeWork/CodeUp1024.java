package HomeWork;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 문자열을 문자로 뽑아내기
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){ // 공백이면 if문 종료
                System.out.printf("\'%c\'\n", ch);
            }
        }

    }
}
