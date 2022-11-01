package programmers;

public class Prime {
    public int solution(String numbers) {
        int answer = 0;

        return answer;
    }
    public boolean isPrime(int num) {

        for (int i = 2; i < num-1; i++) {
            if(num % i != 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        prime.isPrime(10);

    }
}
