public class Account {
    String id;
    String account_holder_name;
    String address;

    public Account(String account_holder_name, String address) {
        this.id = "0001";
        this.account_holder_name = account_holder_name;
        this.address = address;
    }

    void deposit(int amount){
        System.out.println(amount + " deposited in the account");
    }

    void withdraw(int amount){
        System.out.println(amount + " withdrawn from the account");
    }

    static double calculateSimpleInterest(int p, double r, int t){
        double s = (p * r * t)/100;
        return s;
    }

    static double calculateCompoundInterest(int p, double r, int t){
        double a = p* Math.pow((1+(r/100)), t);
        double ci = a - p;
        return ci;
    }
}
