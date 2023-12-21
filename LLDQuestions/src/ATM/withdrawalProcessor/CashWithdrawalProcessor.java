package ATM.withdrawalProcessor;

import ATM.atmMachine.ATM;

public abstract class CashWithdrawalProcessor {
    CashWithdrawalProcessor nextProcessor;

    public CashWithdrawalProcessor(CashWithdrawalProcessor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

    public void withdrawAmount(ATM atm, int remainingAmount){
        if(nextProcessor != null){
            nextProcessor.withdrawAmount(atm, remainingAmount);
        }
    }
}
