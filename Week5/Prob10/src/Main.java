import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.print("Enter choice: \n1.Decimal to Hexa-decimal\n2.Hexa-decimal to Decimal\n3.Exit\n(1, 2, 3): ");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.print("Enter a Decimal number: ");
                int num = sc.nextInt();
                String s = "";
                while (num != 0) {
                    int r = num % 16;
                    String rem = Integer.toString(r);
                    if (r < 10)
                        s = rem + s;
                    else if (r == 10)
                        s = "A" + s;
                    else if (r == 11)
                        s = "B" + s;
                    else if (r == 12)
                        s = "C" + s;
                    else if (r == 13)
                        s = "D" + s;
                    else if (r == 14)
                        s = "E" + s;
                    else if (r == 15)
                        s = "F" + s;
                    num = num / 16;
                }
                System.out.println("Hexa-decimal : " + s);
            } else if (n == 2) {
                sc.nextLine();
                System.out.print("Enter a Hexa-decimal number: ");
                String Num = sc.nextLine().toUpperCase();
                int len = Num.length();
                int dec = 0;
                for (int i = 0; i < len; i++) {
                    char c = Num.charAt(len - i - 1);

                    if (c == 'A')
                        dec = dec + (10 * (int) Math.pow(16, i));
                    else if (c == 'B')
                        dec = dec + (11 * (int) Math.pow(16, i));
                    else if (c == 'C')
                        dec = dec + (12 * (int) Math.pow(16, i));
                    else if (c == 'D')
                        dec = dec + (13 * (int) Math.pow(16, i));
                    else if (c == 'E')
                        dec = dec + (14 * (int) Math.pow(16, i));
                    else if (c == 'F')
                        dec = dec + (15 * (int) Math.pow(16, i));
                    else {
                        int a = c - '0';
                        dec = dec + (a * (int) Math.pow(16, i));
                    }
                }
                System.out.println(dec);
            }
            else if(n == 3){
                System.out.println("Exiting...");
                break;
            }
        }
    }
}