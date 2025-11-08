import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n / 2 > 10){
            n = n/2;
            System.out.println(n);
        }
    }
}