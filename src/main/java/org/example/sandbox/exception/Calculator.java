package org.example.sandbox.exception;

public class Calculator {

        public static void main(String[] args) {

            Calculator calculator = new Calculator();

            try {
                System.out.println(calculator.divide(10, 0));
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }

            try {
                System.out.println(calculator.divide(10, 2));
            } catch (ArithmeticException e) {
                e.printStackTrace();
}

            public int divide(int a, int b) {
                int returnValue = 0;

                try {
                    returnValue = a / b;
                } catch (ArithmeticException e) {
                    System.err.println("Can't divide by zero");
                }

                return returnValue;
            }
            }

        }
