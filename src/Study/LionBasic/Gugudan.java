package Study.LionBasic;

interface Operation {
    int operation(int a, int b);
}

public class Gugudan {

    public void printGugudanTemlate(int dan, String operator, Operation operation) {

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, operator, i, operation.operation(dan, i));
        }
    }


    public void PrintGugudaPlus(int dan) {
        printGugudanTemlate(dan, "+", (a, b) -> a + b);
    }

    public void PrintGugudaMultiple(int dan) {
        printGugudanTemlate(dan, "*", (a, b) -> a * b);
    }

    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();

        gugudan.PrintGugudaPlus(3);

        gugudan.PrintGugudaMultiple(3);
    }


}
