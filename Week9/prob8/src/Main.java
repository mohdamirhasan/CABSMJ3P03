//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WashingMachine a1 = new WashingMachine();
        Refrigerator a2 = new Refrigerator();

        a1.turnOn();
        a2.turnOn();
        a1.turnOff();
        a2.turnOff();
    }
}
