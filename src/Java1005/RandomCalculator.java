package Java1005;

public class RandomCalculator {
    private int a;
    private int b;

    public RandomCalculator(int a) {
        this.a = a;
        this.b = (int) (Math.random() * 10);
        System.out.println("a는 " + this.a + ", 랜덤 숫자는 " + this.b);
    }

    public void plus() {
        System.out.println(a + b);
    }

    public void minus() {
        System.out.println(a - b);
    }

    public void multiple() {
        System.out.println(a * b);
    }

    public void divide() {
        try {
            float result = a/b;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("나누는 수가 0입니다. 다시 한번 더 실행해주세요");
        }
    }

}
