
public class Account {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    public Account(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    public void checkBalance(){
        System.out.println("Ваш баланс "+balance);
    }
    public void withdraw(int money){
        if (balance >= money){
            balance-=money;
        }else {
            System.err.println(" Недостаточно средств ");
        }
    }
    public  void deposit(int money){
        balance+=money;
    }
}
