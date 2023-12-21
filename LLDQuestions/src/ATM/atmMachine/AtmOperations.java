package ATM.atmMachine;

public enum AtmOperations {
    BalanceEnquiry,
    PinChange,
    CashWithdrawal;

    public static void showOperation(){
        for(AtmOperations operations : AtmOperations.values()){
            System.out.println(operations.name());
        }
    }
}
