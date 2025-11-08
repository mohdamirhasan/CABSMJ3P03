public class Saving extends Account{
    int minBalance;

    public Saving(String account_holder_name, String address, int minBalance) {
        super(account_holder_name, address);
        this.minBalance = minBalance;
    }

    void display(){
        System.out.println("Savings account, Min Bal: " + minBalance);
        System.out.println("Account Holder: " + super.account_holder_name);
        System.out.println("Address: " + super.address);
    }

    void deposit (int amount){
        System.out.println(amount + " deposited in your savings account");
    }

    void withdraw (int amount){
        System.out.println(amount + " withdrawn from your savings account");
    }
}
