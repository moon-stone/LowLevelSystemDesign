package ATM.user;

public class DebitCard {
    BankAccount bankAccount;
    String nameOnCard;
    String cardNumber;
    String expDate;
    int cVV;
    int pin;

    public DebitCard(BankAccount bankAccount, String nameOnCard, String expDate, int cVV, String cardNumber){
        this.bankAccount = bankAccount;
        this.cardNumber = cardNumber;
        this.cVV = cVV;
        this.expDate = expDate;
        this.nameOnCard = nameOnCard;
    }

    public void setPin(int code){
        pin = code;
    }

    public int getPin(){
        return pin;
    }

    public int getCVV(){
        return cVV;
    }

    public BankAccount getBankAccount(){
        return bankAccount;
    }

    public String getExpDate(){
        return expDate;
    }
}
