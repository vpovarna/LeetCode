package com.leetcode._500;

public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            var nr1 = 0;
            var nr2 = 1;
            for (int i = 2; i <= n; i++) {
                var tmpNr1 = nr2;
                nr2 = nr1 + nr2;
                nr1 = tmpNr1;
            }
            return nr2;
        }
    }

    public static void main(String[] args) {
        final FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.fib(3));
        System.out.println(fibonacciNumber.fib(4));
    }
}
