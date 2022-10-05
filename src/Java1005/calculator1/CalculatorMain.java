package Java1005.calculator1;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ByPassNumberCreator(),200);
        calculator.plus(10);

    }
}
