// 10# Write a Java program to find the circumference of a circle given its radius. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
        sc.close();
    }
}