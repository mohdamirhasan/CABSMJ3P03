//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BuySomething a = new BuySomething();
        a.details();
        a.offer();
    }
}

//Create interfaces Bike and Scooty, both of which have two methods-
//offer() and details() (details() is default method). Create a new class
//BuySomething which implements both interfaces. To remove ambiguity,
//create a method details() in BuySomething class as well in which call the
//        details() method of both interfaces. Call the methods of BuySomething
//class in main method.