public interface Account {

    void deposit();
    void withdraw();
    static void aboutBank(){
        System.out.println("A bank is body that works on the function of depositing money and taking loan.");
    }
}
