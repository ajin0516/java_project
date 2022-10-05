package Java1005.ex;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator cal = new CalculatorImple(10,new RandomNumberCreator());
        cal.plus();
        cal.minus();
        System.out.println();

        Calculator cal2 = new CalculatorImple(10, new SpecificNumberCreator());
        cal2.minus();
        cal2.plus();
    }
}
