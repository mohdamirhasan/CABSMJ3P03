//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bus b = new Bus();
        Train t = new Train();
        b.display();
        b.cost();
        t.display();
        t.cost();
    }
}