package org.example;

public class FactorialCalculator {
    public int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        int n = 5;
        int factorial = calculator.calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
