package ATM.states;

import ATM.atmMachine.ATM;
import ATM.user.DebitCard;

public class IdleState extends ATMState {
    public IdleState(){
        System.out.println("IdleState: ");
    }
    @Override
    public void insertCard(ATM atm, DebitCard debitCard){
        System.out.println("Welcome : Your debitCard is inside the ATM");
        atm.setAtmState(new HasCardState());
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
