// 7# Write a Java program to calculate the area of a rectangle given its length and breadth. 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("Area of the rectangle is: " + area);
        sc.close();
    }
}