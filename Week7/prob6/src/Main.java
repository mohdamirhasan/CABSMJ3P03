import java.util.Scanner;

public class Main {
    static void fibonacci(int n){
        System.out.print("0, ");
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < n - 1; i++){
            if(i == n - 2)
                System.out.print(n2);
            else
                System.out.print(n2 + ", ");
            int t = n2;
            n2 = n1 + n2;
            n1 = t;

        }
    }
    static int fibonacciR(int n){
        if (n <= 1){
            return n;
        }
        else{
            return fibonacciR(n-2) + fibonacciR(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series Non-Recursive: ");
        fibonacci(n);
        System.out.print("\nFibonacci Series Recursive: ");
        for (int i = 0; i < n; i++){
            if( i == n)
                System.out.print(fibonacciR(i));
            else
                System.out.print(fibonacciR(i) + ", ");
        }
    }
}