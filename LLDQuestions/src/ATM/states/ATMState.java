package ATM.states;

import ATM.atmMachine.AtmOperations;
import ATM.user.DebitCard;
import ATM.atmMachine.ATM;

public abstract class ATMState {
    public void insertCard(ATM atm, DebitCard debitCard){
        System.out.println("Something went wrong");
    }

    public void authenticatePin(ATM atm, DebitCard debitCard, int pin){
        System.out.println("Something went wrong");
    }

    public void selectOperation(ATM atm, DebitCard debitCard, AtmOperations atmOperations){
        System.out.println("Something went wrong");
    }

    public void cashWithdrawal(ATM atm, DebitCard debitCard, int withdrawAmount){
        System.out.println("Something went wrong");
    }

    public void balanceEnquiry(ATM atm, DebitCard debitCard){
        System.out.println("Something went wrong");
    }

    public void pinChange(ATM atm, DebitCard debitCard, int newPin){
        System.out.println("Something went wrong");
    }

    public void Exit(ATM atm, DebitCard debitCard){
        System.out.println("Something went wrong");
    }

    public void removeCard(){
        System.out.println("Something went wrong");
    }
}
