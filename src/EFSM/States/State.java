package EFSM.States;
    /*
        This class is the abstract superclass for the de-centralized State Design Pattern.
        State classes are responsible for
        1. Performing Actions
        2. Changing States
     */

public abstract class State {


    public void open(){
    }

    public void Login(){
    }

    public void IncorrectPin(int max){
    }

    public void CorrectPinBelowMin(){
    }

    public void Deposit(){
    }

    public void Logout() {
    }

    public void CorrectPinAboveMin(){
    }

    public void Balance(){
    }

    public void Withdraw(){
    }

    public void WithdrawBelowMin(){
    }

    public void Activate(){
    }

    public void BelowMinBalance(){
    }

    public void AboveMinBalance(){
    }

    public void Suspend(){
    }

    public void close(){
    }

    public void Unlock(){
    }

    public void IncorrectUnlock(){
    }

    public void Lock(){
    }

    public void IncorrectLock(){
    }

    public void IncorrectLogin(){
    }

    public void NoFunds(){
    }


}
