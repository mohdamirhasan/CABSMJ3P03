// 6# Write a Java program to swap two numbers using a temporary variable. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("First number (a): " + a);
        System.out.println("Second number (b): " + b);
        scanner.close();
    }
}
