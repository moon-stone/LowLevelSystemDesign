package ATM.states;

import ATM.atmMachine.ATM;
import ATM.atmMachine.NoteType;
import ATM.user.DebitCard;
import ATM.withdrawalProcessor.CashWithdrawalProcessor;
import ATM.withdrawalProcessor.FiveHundredWithdrawalProcessor;
import ATM.withdrawalProcessor.OneHundredWithdrawalProcessor;
import ATM.withdrawalProcessor.TwoHundredWithdrawalProcessor;

public class CashWithdrawalState extends ATMState{
    public CashWithdrawalState(){
        System.out.println("HasCardState");
    }
    @Override
    public void cashWithdrawal(ATM atm, DebitCard debitCard, int withdrawAmount){
        if(atm.getAtmBalance() < withdrawAmount){
            System.out.println("This much amount not available. Try some less amount");
            Exit(atm, debitCard);
            return;
        }
        else if(withdrawAmount % 100 != 0){
            System.out.println("Try amount in multiple of 100 only");
            Exit(atm, debitCard);
            return;
        }
        int fiveHundredNotes = atm.getFiveHundredNotes();
        int twoHundredNotes = atm.getTwoHundredNotes();
        int oneHundredNotes = atm.getOneHundredNotes();
        int atmBalance = atm.getAtmBalance();
        CashWithdrawalProcessor cashWithdrawalProcessor = new FiveHundredWithdrawalProcessor(new TwoHundredWithdrawalProcessor(new OneHundredWithdrawalProcessor(null)));
        cashWithdrawalProcessor.withdrawAmount(atm, withdrawAmount);
        if(!atm.isAmountProcessedSuccessfully()){
            System.out.println("Something went wrong. Please try some other amount");
            atm.setAtmAmountBalance(atmBalance, fiveHundredNotes, twoHundredNotes, oneHundredNotes);
        } else {
            System.out.println("Amount processed successfully, collect your cash");
            System.out.println("Collect 500 Notes : "+(fiveHundredNotes - atm.getFiveHundredNotes()));
            System.out.println("Collect 200 Notes : "+(twoHundredNotes - atm.getTwoHundredNotes()));
            System.out.println("Collect 100 Notes : "+(oneHundredNotes - atm.getOneHundredNotes()));
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
