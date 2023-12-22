package ATM;

import ATM.atmMachine.ATM;
import ATM.atmMachine.AtmOperations;
import ATM.user.BankAccount;
import ATM.user.DebitCard;
import ATM.user.User;

public class mainATMRoom {
    ATM Atm;
    User User;
    public static void main(String[] args){
        mainATMRoom atmRoom = new mainATMRoom();
        atmRoom.initialise();
        atmRoom.Atm.showAtmStatus();
        System.out.println();
        atmRoom.Atm.getCurrentAtmState().insertCard(atmRoom.Atm, atmRoom.User.getDebitCard());
        atmRoom.Atm.getCurrentAtmState().authenticatePin(atmRoom.Atm, atmRoom.User.getDebitCard(), 4321);
        atmRoom.Atm.getCurrentAtmState().selectOperation(atmRoom.Atm, atmRoom.User.getDebitCard(), AtmOperations.CashWithdrawal);
        atmRoom.Atm.getCurrentAtmState().cashWithdrawal(atmRoom.Atm, atmRoom.User.getDebitCard(), 2700);
        System.out.println();
        atmRoom.Atm.showAtmStatus();
    }

    private void initialise(){
        Atm = new ATM();
        Atm.setAtmAmountBalance(5000, 6, 5, 10);
        this.User = createUser();
    }

    private User createUser() {
        BankAccount bankAccount = createBankAccount();
        DebitCard debitCard = createDebitCard(bankAccount);
        return new User(bankAccount, debitCard);
    }

    private DebitCard createDebitCard(BankAccount bankAccount) {
        DebitCard debitCard = new DebitCard(bankAccount, "Rohit", "10/12", 123, "852963963698");
        debitCard.setPin(4321);
        return debitCard;
    }

    private BankAccount createBankAccount() {
        return new BankAccount("1234567890", "Rohit", 10000);
    }
}
