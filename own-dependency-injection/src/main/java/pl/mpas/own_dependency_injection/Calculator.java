package pl.mpas.own_dependency_injection;

public class Calculator {

    private int result;

    public void add(int a, int b) {
        result = a + b;
    }

    public void printResult() {
        System.out.println("Result = " + result);
    }
}
