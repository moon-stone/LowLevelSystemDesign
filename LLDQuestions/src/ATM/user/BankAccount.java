package ATM.user;

public class BankAccount {
    String bankAccountNumber;
    String nameAccountHolder;
    int accountBalance;

    public BankAccount(String bankAccountNumber, String nameAccountHolder, int accountBalance){
        this.accountBalance = accountBalance;
        this.bankAccountNumber = bankAccountNumber;
        this.nameAccountHolder = nameAccountHolder;
    }

    public void updateAccountBalance(int amount){
        accountBalance = amount;
    }
    public int getAccountBalance(){
        return accountBalance;
    }
}
