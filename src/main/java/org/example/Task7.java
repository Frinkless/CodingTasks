package org.example;

public class Task7 {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        printFibonacciSeries(n);
    }

    // Function to print the Fibonacci series
    public static void printFibonacciSeries(int n) {
        int firstNum = 0, secondNum = 1;
        System.out.println("First " + n + " numbers of Fibonacci series:");
        System.out.print(firstNum + " " + secondNum + " ");

        for (int i = 2; i < n; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}

