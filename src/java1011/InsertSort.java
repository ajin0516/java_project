package java1011;

import javax.print.attribute.standard.PrinterResolution;

public class InsertSort {

    public int Solution(int n){
        // % 연산 이용 몫, 나머지
        // Currency
        int result = 0;
//        int n = n; // 공간복잡도 증가 origin -> n(파라미터)으로 변경

        // for문으로 가능할까?
        while (n>0) {
            result += n % 10;
            n = n / 10;
            System.out.printf("n : %d  result : %d\n", n, result);
        }
        return result;
    }

    public static void main(String[] args) {
        InsertSort ins = new InsertSort();

        int result = ins.Solution(1234);


        if(result == 10){
            System.out.println("테스트 통과");
        }else
            System.out.println("테스트 실패 result : " + result);


    }
}
