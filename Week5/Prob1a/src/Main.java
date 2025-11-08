  import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = 10*(i + 1);
        }

        for (int e:a){
            System.out.print(e + ", ");
        }
    }
}