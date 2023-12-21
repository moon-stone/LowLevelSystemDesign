package ATM.withdrawalProcessor;

public class OneHundredWithdrawalProcessor extends CashWithdrawalProcessor{
    public OneHundredWithdrawalProcessor(CashWithdrawalProcessor nextProcessor) {
        super(nextProcessor);
    }
}
