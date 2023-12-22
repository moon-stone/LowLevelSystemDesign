package ATM.states;

import ATM.atmMachine.ATM;
import ATM.user.DebitCard;

public class HasCardState extends ATMState{
    public HasCardState(){
        System.out.println("HasCardState : ");
    }
    @Override
    public void authenticatePin(ATM atm, DebitCard debitCard, int pin){
        if(debitCard.getPin() == pin){
            atm.setAtmState(new SelectOperationState());
        }
        else{
            System.out.println("IncorrectPin, transaction Cancelled");
            atm.setAtmState(new IdleState());
        }
    }

    @Override
    public void Exit(ATM atm, DebitCard debitCard){
        System.out.println("TransactionCancelled");
        removeCard();
        atm.setAtmState(new IdleState());
    }

    @Override
    public void removeCard(){
        System.out.println("Remove your Card");
    }
}
