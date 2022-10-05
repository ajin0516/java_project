package Java1005.calculator1;

public class Calculator {
    // 사칙 연산한 결과를 출력한다
    private NumberCreator numberCreator;
    private int baseNum;

    public Calculator(NumberCreator numberCreator, int baseNum) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }

    public void plus(int num){
        System.out.println(num + numberCreator.create(10));
    }
}
