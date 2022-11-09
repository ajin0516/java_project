package programmers.Level1;

/*
하샤드 수
// 자릿수의 합 구하기 – step1
// 나누어 떨어지는지 check하기 – step2

687 → 21
687 / 21 나누어 떨어지면 687은 하샤드 수 나누어 떨어지지 않으면 하샤드 수가 아님
 */
public class Harshad {
    public boolean solution(int x) {
        boolean answer = true;

        // 나머지
        int remainder = 0;
        int originX = x;  // x를 담아주지 않으면 while문에서 변화된 x의 값만 남게됨

        // 자릿수의 합 구하기
        while (x > 0) {
            remainder += x % 10;
            x = x / 10;
            System.out.println("X =" + x);
        }

        System.out.println("벗어난 x =" +x);
        System.out.println(remainder);

        // 나누어 떨어지는 지 확인
        if (originX % remainder != 0) {
            return false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Harshad harshad = new Harshad();
        System.out.println(harshad.solution(11));
    }
}
