package math.sample;

public class MathOps {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
    public static int square(int a) {
        return a * a;
    }
    public static double sqrt(double a) {
        if (a < 0) throw new ArithmeticException("Square root of negative number");
        return Math.sqrt(a);
    }
    public static int fib(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative index for Fibonacci");
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    public static double log(double a) {
        if (a <= 0) throw new ArithmeticException("Logarithm of non-positive number");
        return Math.log(a);
    }
}