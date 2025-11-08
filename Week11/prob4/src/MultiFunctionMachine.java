public class MultiFunctionMachine implements Printer, Scanner{

    public void connect() {
        System.out.println("Connecting");
    }

    @Override
    public void details() {
        Printer.super.details();
        Scanner.super.details();
    }
}
