import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        System.out.println("Sum of the digits: " + sum);
        sc.close();
    }
}