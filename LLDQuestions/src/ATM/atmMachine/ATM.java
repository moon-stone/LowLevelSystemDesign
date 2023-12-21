package ATM.atmMachine;

import ATM.states.ATMState;
import ATM.states.IdleState;

public class ATM {
    ATMState state;
    int atmAmountBalance;
    int fiveHundredNotes;
    int twoHundredNotes;
    int oneHundredNotes;

    public ATM(){
        atmAmountBalance = 0;
        fiveHundredNotes = 0;
        twoHundredNotes = 0;
        oneHundredNotes = 0;
        this.state = new IdleState();
    }

    public void setAtmAmountBalance(int atmAmountBalance, int fiveHundredNotes, int twoHundredNotes, int oneHundredNotes){
        this.atmAmountBalance = atmAmountBalance;
        this.fiveHundredNotes = fiveHundredNotes;
        this.twoHundredNotes = twoHundredNotes;
        this.oneHundredNotes = oneHundredNotes;
    }

    public void addNotesToATM(NoteType noteType, int count){
        switch (noteType){
            case NoteType.FiveHundred -> {
                addCash(500, count);
                fiveHundredNotes += count;
            }
            case NoteType.TwoHundred -> {
                addCash(200, count);
                twoHundredNotes += count;
            }
            case NoteType.OneHundred -> {
                addCash(100, count);
                oneHundredNotes += count;
            }
        }
    }

    private void addCash(int type, int count) {
        atmAmountBalance = atmAmountBalance + type*count;
    }

    public int getAtmBalance(){
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

}
