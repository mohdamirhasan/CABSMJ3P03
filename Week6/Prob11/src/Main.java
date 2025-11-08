import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] freq = new int[256];
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        System.out.println("Character Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("'" + (char) i + "': " + freq[i]);
            }
        }
        sc.close();
    }
}