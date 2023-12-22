package ATM.atmMachine;

import ATM.states.ATMState;
import ATM.states.IdleState;

public class ATM {
    private ATMState state;
    private int atmAmountBalance;
    private int fiveHundredNotes;
    private int twoHundredNotes;
    private int oneHundredNotes;
    private boolean amountProcessedSuccessfully;

    public ATM(){
        atmAmountBalance = 0;
        fiveHundredNotes = 0;
        twoHundredNotes = 0;
        oneHundredNotes = 0;
        amountProcessedSuccessfully = false;
        this.state = new IdleState();
    }

    public void setAtmAmountBalance(int atmAmountBalance, int fiveHundredNotes, int twoHundredNotes, int oneHundredNotes){
        this.atmAmountBalance = atmAmountBalance;
        this.fiveHundredNotes = fiveHundredNotes;
        this.twoHundredNotes = twoHundredNotes;
        this.oneHundredNotes = oneHundredNotes;
    }

    public void updateNotesToATM(NoteType noteType, int count){
        switch (noteType){
            case NoteType.FiveHundred -> {
             //   addCash(500, count);
                fiveHundredNotes = count;
            }
            case NoteType.TwoHundred -> {
             //   addCash(200, count);
                twoHundredNotes = count;
            }
            case NoteType.OneHundred -> {
              //  addCash(100, count);
                oneHundredNotes = count;
            }
        }
    }

    public void setAtmState(ATMState state){
        this.state = state;
    }

    public ATMState getCurrentAtmState(){
        return state;
    }

/*    private void addCash(int type, int count) {
        atmAmountBalance = atmAmountBalance + type*count;
    }*/

    public int getAtmBalance(){
        atmAmountBalance = fiveHundredNotes*500 + twoHundredNotes*200 + oneHundredNotes*100;
        return atmAmountBalance;
    }

    public int getFiveHundredNotes(){
        return fiveHundredNotes;
    }

    public int getTwoHundredNotes(){
        return twoHundredNotes;
    }

    public int getOneHundredNotes(){
        return oneHundredNotes;
    }

    public void setAmountProcessedSuccessfully(boolean value){
        this.amountProcessedSuccessfully = value;
    }

    public boolean isAmountProcessedSuccessfully(){
        return amountProcessedSuccessfully;
    }

    public void showAtmStatus(){
        System.out.println("Balance : "+ getAtmBalance());
        System.out.println("500 notes : "+fiveHundredNotes);
        System.out.println("200 notes : "+twoHundredNotes);
        System.out.println("100 notes : "+oneHundredNotes);
    }


}
