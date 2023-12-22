package ATM.states;

import ATM.atmMachine.ATM;
import ATM.user.DebitCard;

public class PinChangeState extends ATMState{
    public PinChangeState(){
        System.out.println("PinChangeState:");
    }
    @Override
    public void pinChange(ATM atm, DebitCard debitCard, int newPin){
        debitCard.setPin(newPin);
        atm.setAtmState(new HasCardState());
        System.out.println("Pin changed Successfully");
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
