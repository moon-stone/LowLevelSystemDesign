package ATM.user;

public class User {
    String name;
    BankAccount bankAccount;
    DebitCard debitCard;

    public User(String name, BankAccount bankAccount, DebitCard debitCard){
        this.name = name;
        this.bankAccount = bankAccount;
        this.debitCard = debitCard;
    }

    public BankAccount getBankAccountDetails(){
        return bankAccount;
    }
}
