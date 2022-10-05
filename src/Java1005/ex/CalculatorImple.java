package Java1005.ex;

public class CalculatorImple implements Calculator {
    // 변수
    private int num;
    private int random;
    private NumberCreator numberCreator;

    // 생성자
    public CalculatorImple(int num, NumberCreator numberCreator){
       this.num = num;
       this.numberCreator = numberCreator;
       random = numberCreator.create();
    }

    // 함수
    @Override
    public void plus() {
        System.out.printf("%d + %d = %d", num , random, num+random);
        System.out.println();
    }

    // 함수
    @Override
    public void minus() {
        System.out.printf("%d - %d = %d", num , random, num-random);
        System.out.println();
    }
}
