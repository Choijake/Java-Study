package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //public 메서드 : 입금 기능
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("invalid");
        }
    }

    public void withdraw(int amount){
        if(isAmountValid(amount) && balance-amount>0){
            balance -= amount;
        }else{
            System.out.println("invalid");
        }
    }

    public int getBalance(){
        return balance;
    }

    private boolean isAmountValid(int amount){
        //금액이 0보다 커야함
        return amount > 0;
    }
}
