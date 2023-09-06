package kz.mun.se.eckel.test;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.add(7, 8);
        if (result != 15) {
            System.out.println("incorrect!");
        }
    }
}
