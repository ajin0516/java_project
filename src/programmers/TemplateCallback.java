package programmers;

public class TemplateCallback {
    boolean someOperation(int a, int b){
        return a < b;
    }

    boolean isPrime(int num) {
        // i < num
        // i < num / 2
        // i * i < num

        for (int i = 2; someOperation(1, num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        TemplateCallback templateCallback = new TemplateCallback();
        boolean r = templateCallback.isPrime(10);
        System.out.println(r);
    }
}
