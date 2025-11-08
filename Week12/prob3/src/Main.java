class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}

class BankAccount{
    String holderName;
    int balance;

    public BankAccount(String holderName, int balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException{
        if(amount <= balance){
            balance -= amount;
            System.out.println(amount + " Withdrawl successful, Available balance: " + balance);
        }
        else{
            throw new InsufficientFundsException("Insuffiecien balance: " + balance);
        }
    }

    public void transfer(BankAccount a, int amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Insuffiecient balance: " + balance);
        }
        else{
            a.balance += amount;
            balance -= amount;
            System.out.println(amount + " Transfer successful, available balance: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Mahmood Madni", 12000);
        BankAccount a2 = new BankAccount("Ali", 10000);

        try{
            a2.withdraw(6000);
        }
        catch (InsufficientFundsException e){
            System.out.println("Transaction Failed, " + e.getMessage());
        }

        try{
            a2.transfer(a1, 5000);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed, " + e.getMessage());
        }
    }
}

//        You are developing an online banking system where users can transfer
//        money between accounts. If a user tries to withdraw more money than is
//        available in their account, an InsufficientFundsException should be
//        thrown.