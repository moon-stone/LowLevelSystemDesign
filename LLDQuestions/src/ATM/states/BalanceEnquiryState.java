package ATM.states;

import ATM.atmMachine.ATM;
import ATM.user.DebitCard;

public class BalanceEnquiryState extends ATMState{
    public BalanceEnquiryState(){
        System.out.println("BalanceEnquiryState : ");
    }
    public void balanceEnquiry(ATM atm, DebitCard debitCard){
        System.out.println("Balance in your account is : "+debitCard.getBankAccount().getAccountBalance());
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
