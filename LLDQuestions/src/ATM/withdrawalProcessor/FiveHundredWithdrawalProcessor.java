package ATM.withdrawalProcessor;

import ATM.atmMachine.ATM;
import ATM.atmMachine.NoteType;

public class FiveHundredWithdrawalProcessor extends CashWithdrawalProcessor{
    public FiveHundredWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdrawAmount(ATM atm, int remainingAmount){
        System.out.println("FiveHundredProcessor: remainingAmount: "+remainingAmount);
        int fiveHundredNotesRequired = (int)remainingAmount/500;
        int fiveHundredNotesPresentInAtm = atm.getFiveHundredNotes();
        if(fiveHundredNotesRequired <= fiveHundredNotesPresentInAtm){
         //   fiveHundredNotesPresentInAtm -= fiveHundredNotesRequired;
            remainingAmount -= fiveHundredNotesRequired*500;
            atm.updateNotesToATM(NoteType.FiveHundred, fiveHundredNotesPresentInAtm-fiveHundredNotesRequired);
        }
        else {
            remainingAmount -= fiveHundredNotesPresentInAtm*500;
            atm.updateNotesToATM(NoteType.FiveHundred, 0);
        }
        atm.setAmountProcessedSuccessfully(true);
        if(remainingAmount > 0){
            atm.setAmountProcessedSuccessfully(false);
            super.withdrawAmount(atm, remainingAmount);
        }
    }
}
