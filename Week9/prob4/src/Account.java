public abstract class Account {
    String id;
    String account_holder_name;
    String address;

    public Account() {
        this.id = "none";
        this.account_holder_name = "none";
        this.address = "null";
    }

    public Account(String account_holder_name, String address) {
        this.id = "0001";
        this.account_holder_name = account_holder_name;
        this.address = address;
    }

    abstract void deposit(int amount);

    abstract void withdraw(int amount);
}
