//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Saving s = new Saving();
        s.deposit();
        s.withdraw();
        s.takeLoan();
        Current c = new Current();
        c.deposit();
        c.withdraw();
    }
}

//In the previous question, create a new method in Account interface-
//takeLoan() (takeLoan() is a default method). takeLoan()  method would be
//implemented by Saving class only. Call the methods of Saving and
//Current classes in main method.