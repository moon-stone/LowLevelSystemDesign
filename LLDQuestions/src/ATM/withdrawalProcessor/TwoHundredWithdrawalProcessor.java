package ATM.withdrawalProcessor;

public class TwoHundredWithdrawalProcessor extends CashWithdrawalProcessor{
    public TwoHundredWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        super(nextProcessor);
    }

}
