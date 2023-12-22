package ATM.states;

import ATM.atmMachine.ATM;
import ATM.atmMachine.AtmOperations;
import ATM.user.DebitCard;

public class SelectOperationState extends ATMState{
    public SelectOperationState(){
        System.out.println("SelectOperationState");
    }

    public void selectOperation(ATM atm, DebitCard debitCard, AtmOperations atmOperations){
        AtmOperations.showOperation();
        switch (atmOperations){
            case AtmOperations.BalanceEnquiry -> atm.setAtmState(new BalanceEnquiryState());
            case AtmOperations.CashWithdrawal -> atm.setAtmState(new CashWithdrawalState());
            case AtmOperations.PinChange -> atm.setAtmState(new PinChangeState());
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
