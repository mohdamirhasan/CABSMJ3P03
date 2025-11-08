public class Current extends Account{
    int max_withdrawl_limit;

    public Current(String account_holder_name, String address, int max_withdrawl_limit) {
        super(account_holder_name, address);
        this.max_withdrawl_limit = max_withdrawl_limit;
    }

    void display(){
        System.out.println("Current Account, Max Withdrawl Limit: " + max_withdrawl_limit);
        System.out.println("Account Holder: " + super.account_holder_name);
        System.out.println("Address: " + super.address);
    }

    void deposit (int amount){
        System.out.println(amount + " deposited in your current account");
    }

    void withdraw (int amount){
        System.out.println(amount + " withdrawn from your current account");
    }
}
