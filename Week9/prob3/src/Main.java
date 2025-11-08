//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account a1 = new Account("ABC", "Dodhpur, Aligarh");

        a1.deposit(10000);
        a1.withdraw(5000);
        double si = a1.calculateSimpleInterest(10000, 12, 3);
        double ci = a1.calculateCompoundInterest(10000, 12, 3);
        System.out.println("SI: " + si + ", CI: " + ci);
    }
}