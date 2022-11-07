package programmers;

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

        // 자릿수의 합 구하기
        int result = 0;
        while (x > 0) {
            result += x % 10;
            x = x / 10;
        }
        System.out.println(result);

        // 나누어 떨어지는 지 check
        if (x / result == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Harshad harshad = new Harshad();
        harshad.solution(687);
    }
}
