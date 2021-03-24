package calculator;

public class Calculator {
    private static double a = 0.1;
    private static double b = 0.2;

    public static void main(String[] args) {
        Calculator tmp = new Calculator();
        System.out.println(operSlojenie(tmp));
    }

    public static double operSlojenie (Calculator t) {
        double c = t.a + t.b;
        return c;
    }

    public static double operDelenie (Calculator t) {
        double c = t.a / t.b;
        return c;
    }

    public static double operYmnojenie (Calculator t) {
        double c = t.a * t.b;
        return c;
    }

    public static double operandVichitaniaA (Calculator t) {
        double c = --(t.a);
        return c;
    }

    public static double operandSlojeniaA (Calculator t) {
        double c = ++(t.a);
        return c;
    }

    public static double operandVichitaniaB (Calculator t) {
        double c = --(t.b);
        return c;
    }

    public static double operandSlojeniaB (Calculator t) {
        double c = ++(t.b);
        return c;
    }

    public static double getA() {
        return a;
    }

    public static void setA(double a) {
        Calculator.a = a;
    }

    public static double getB() {
        return b;
    }

    public static void setB(double b) {
        Calculator.b = b;
    }

    public static void outPut (Calculator t) {
        System.out.println("Значение a = " + t.a + " Значение b = " + t.b);
    }
}