
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinated of first point (x1, y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter coordinated of second point (x2, y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.println("Distance between the points: " + distance);
        sc.close();
    }    
}
