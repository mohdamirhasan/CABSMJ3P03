
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        n3 = sc.nextInt();
        int avg = (n1 + n2 + n3) / 3;
        System.out.println("Average: " + avg);
        sc.close();
    }
}