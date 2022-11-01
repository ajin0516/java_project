package programmers;

public class Prime {
    public int solution(String numbers) {
        int answer = 0;

        return answer;
    }

    public boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i != 0) return false; // 나머지가 0이 아니면 소수잖아? 왜 false?
        }
        return true;  // false하면 안돼!!!
    }
}

