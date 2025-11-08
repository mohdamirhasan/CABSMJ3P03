//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Current c = new Current("XYZ", "Shamshad Market", 100000);
        Saving s = new Saving("ABC", "Dodhpur", 5000);
        c.display();
        s.display();
    }
}