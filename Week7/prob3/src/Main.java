//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "hello world";
        String rev = "";
        for (int i = 0; i < s.length(); i++){
            rev = rev + s.charAt(s.length()-i-1);
        }
        System.out.println("Reversed string: " + rev);
    }
}