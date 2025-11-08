import java.util.Scanner;

public class Main {

    static int gcd(int n1, int n2){
        int a = n1 > n2 ? n1 : n2;
        int b = n1 < n2 ? n1 : n2;
        while ( b != 0 ){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    static int gcdR ( int n1, int n2 ){
        int a = n1 > n2 ? n1 : n2;
        int b = n1 < n2 ? n1 : n2;
        if ( b == 0){
            return a;
        }
        return gcdR(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = gcd(n1, n2);
        int hcfR = gcdR(n1, n2);
        System.out.println("GCD without recursion: " + hcf);
        System.out.println("GCD by recursion: " + hcfR);
    }
}