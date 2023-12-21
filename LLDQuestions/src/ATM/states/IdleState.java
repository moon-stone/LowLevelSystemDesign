package ATM.states;

import ATM.atmMachine.ATM;
import ATM.user.DebitCard;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, DebitCard debitCard){
        System.out.println("debitCard is Inserted inside the ATM");

    }
}
