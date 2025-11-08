//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.details();
        m.connect();
    }
}

//Create two interfaces Printer and Scanner, both having methods connect()
//and details() (details() is a default method). Create a class
//MultiFunctionMachine that implements both interfaces. In
//MultiFunctionMachine, override the details() method to resolve ambiguity
//and call the details() methods of both interfaces. Call all methods of
//MultiFunctionMachine in the main() method.