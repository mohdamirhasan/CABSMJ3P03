//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Saving s = new Saving();
        s.deposit();
        s.withdraw();
        Current c = new Current();
        c.deposit();
        c.withdraw();
    }
}

//Create an interface Account having methods- deposit(), withdraw() and
//aboutBank() (abountBank() is a static method). Create two classes Saving
//and Current which implement the Account interface. Call the methods of
//Saving and Current classes in main method.