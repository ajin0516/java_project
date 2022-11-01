package programmers;

interface StatementStrategy{
    boolean compare(int a, int b);
}

public class TemplateCallback {
//    boolean someOperation(int a, int b){
//        return a < b;
//    }

    boolean isPrime(int num, StatementStrategy stmt) {
        // i < num
        // i < num / 2
        // i * i < num
        for (int i = 2; stmt.compare(i, num); i++) {
            System.out.println(i);
            if (num % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        TemplateCallback templateCallback = new TemplateCallback();
        // 내부클래스
//        boolean r = templateCallback.isPrime(17, new StatementStrategy() {
//            @Override
//            public boolean compare(int a, int b) {
//                return a * a <= b;
//            }
//        });

        // 람다식 적용
        System.out.println(templateCallback.isPrime(13, (a, b)-> a < b));
        System.out.println(templateCallback.isPrime(17, (a, b)-> a < b/2));
        System.out.println(templateCallback.isPrime(19, (a, b)-> a * a < b));
    }
}
