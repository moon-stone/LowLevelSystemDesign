package ATM.user;

public class User {
    BankAccount bankAccount;
    DebitCard debitCard;

    public User(BankAccount bankAccount, DebitCard debitCard){
        this.bankAccount = bankAccount;
        this.debitCard = debitCard;
    }

    public BankAccount getBankAccountDetails(){
        return bankAccount;
    }

    public DebitCard getDebitCard(){
        return debitCard;
    }
}
