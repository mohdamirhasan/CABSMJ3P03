public class Saving implements Account{
    public void deposit(){
        System.out.println("Deposit money in your savings account");
    }
    public void withdraw(){
        System.out.println("Withdraw money from your savings account");
    }

    @Override
    public void takeLoan(){
        System.out.println("Take loan to saving account");
    }
}
