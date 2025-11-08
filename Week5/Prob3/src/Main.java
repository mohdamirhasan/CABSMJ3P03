
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            for (int i = n - 1 - j; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i < j + 2; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}