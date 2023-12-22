package ATM.withdrawalProcessor;

import ATM.atmMachine.ATM;
import ATM.atmMachine.NoteType;

public class TwoHundredWithdrawalProcessor extends CashWithdrawalProcessor{
    public TwoHundredWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdrawAmount(ATM atm, int remainingAmount){
        System.out.println("TwoHundredProcessor : remainingAmount : "+remainingAmount);
        int twoHundredNotesRequired = (int)remainingAmount/200;
        int twoHundredNotesPresentInAtm = atm.getTwoHundredNotes();
        if(twoHundredNotesRequired <= twoHundredNotesPresentInAtm){
     //       twoHundredNotesPresentInAtm -= twoHundredNotesRequired;
            remainingAmount -= twoHundredNotesRequired*200;
            atm.updateNotesToATM(NoteType.TwoHundred, twoHundredNotesPresentInAtm-twoHundredNotesRequired);
        }
        else {
            remainingAmount -= twoHundredNotesPresentInAtm*200;
            atm.updateNotesToATM(NoteType.TwoHundred, 0);
        }
        atm.setAmountProcessedSuccessfully(true);
        if(remainingAmount > 0){
            atm.setAmountProcessedSuccessfully(false);
            super.withdrawAmount(atm, remainingAmount);
        }
    }
}
