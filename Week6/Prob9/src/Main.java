import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the series: ");
        int n = sc.nextInt();
        System.out.print(0 + ", ");
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < n - 1; i++){
            if (i < n - 2)
                System.out.print(num2 + ", ");
            else
                System.out.print(num2);
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;
        }
    }
}