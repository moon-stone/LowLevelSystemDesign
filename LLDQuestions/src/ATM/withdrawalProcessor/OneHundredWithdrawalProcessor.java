package ATM.withdrawalProcessor;

import ATM.atmMachine.ATM;
import ATM.atmMachine.NoteType;

public class OneHundredWithdrawalProcessor extends CashWithdrawalProcessor{
    public OneHundredWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdrawAmount(ATM atm, int remainingAmount){
        System.out.println("OneHundredProcessor : remainingAmount : "+remainingAmount);
        int oneHundredNotesRequired = (int)remainingAmount/100;
        int oneHundredNotesPresentInAtm = atm.getOneHundredNotes();
        if(oneHundredNotesRequired <= oneHundredNotesPresentInAtm){
      //      oneHundredNotesPresentInAtm -= oneHundredNotesRequired;
            remainingAmount -= oneHundredNotesRequired*100;
            atm.updateNotesToATM(NoteType.OneHundred, oneHundredNotesPresentInAtm-oneHundredNotesRequired);
        }
        else {
            remainingAmount -= oneHundredNotesPresentInAtm*100;
            atm.updateNotesToATM(NoteType.OneHundred, 0);
        }
        atm.setAmountProcessedSuccessfully(true);
        if(remainingAmount > 0){
            System.out.println("Amount not available in ATM, try to withdraw less amount");
            atm.setAmountProcessedSuccessfully(false);
        }
    }
}
