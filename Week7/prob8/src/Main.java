import java.util.Scanner;

public class Main {

    static boolean areAnagram(String s1, String s2){
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++){
            char c = Character.toLowerCase(s1.charAt(i));

            if ( c >= 'a' && c <= 'z')
                freq[c - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++){
            char c = Character.toLowerCase(s2.charAt(i));

            if ( c >= 'a' && c <= 'z')
                freq[c - 'a']--;
        }

        for (int c : freq){
            if (c != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if(areAnagram(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}