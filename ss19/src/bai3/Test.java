package bai3;

import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("nhap a: ");
            int a = scanner.nextInt();
            System.out.print("nhap b: ");
            int b = scanner.nextInt();

            // Sử dụng method reference trực tiếp
            System.out.println("Add: " + MathOperations.add(a, b));
            System.out.println("Subtract: " + MathOperations.subtract(a, b));
            System.out.println("Multiply: " + MathOperations.multiply(a, b));
            System.out.println("Divide: " + MathOperations.divide(a, b));



        }
    }

