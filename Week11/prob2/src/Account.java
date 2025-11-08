public interface Account {

    void deposit();
    void withdraw();

    default void takeLoan() {
        System.out.println("Take Loan from the Bank");
    }

    static void aboutBank(){
        System.out.println("A bank is body that works on the function of depositing money and taking loan.");
    }
}
