// 9# Write a Java program that takes two integer inputs and computes their remainder and quotient.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int num2 = sc.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        sc.close();
    }
}