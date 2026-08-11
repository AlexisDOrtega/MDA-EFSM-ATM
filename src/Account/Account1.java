package Account;


import Data.*;
import EFSM.StateMachine;

/*
    This class serves as the Account 1 Input Processor.
 */

public class Account1 {
    static final int minBalForPenalty = 250;
    static final int maxAttempts = 3;
    StateMachine sm;
    Data ds;

    public Account1(StateMachine sm, Data ds) {
        this.sm = sm;
        this.ds = ds;
    }
    // open an account where p is a pin, y is an user’s identification #, and a is a balance
    public void open(int p, int y, int a) {
        ((DataAccount1)ds).setTemp_p(p);
        ((DataAccount1)ds).setTemp_y(y);
        ((DataAccount1)ds).setTemp_a(a);
        sm.open();
    }
    // provides pin #
    public void pin(int x) {
        if(x == ((DataAccount1)ds).getTemp_p()) {
            if(((DataAccount1)ds).getTemp_a() > minBalForPenalty) {
                sm.CorrectPinAboveMin();
            }
            else {
                sm.CorrectPinBelowMin();
            }
        }
        else{
            sm.IncorrectPin(maxAttempts);
        }
    }
    // deposit amount d
    public void deposit(int d) {
       ((DataAccount1)ds).setTemp_d(d);
        sm.Deposit();
        if(((DataAccount1)ds).getTemp_a() > minBalForPenalty) {
            sm.AboveMinBalance();
        } else{
            sm.BelowMinBalance();
        }
    }
    // withdraw amount w
    public void withdraw(int w) {
        ((DataAccount1)ds).setTemp_w(w);
        sm.Withdraw();
        if(((DataAccount1)ds).getTemp_w() >minBalForPenalty) {
            sm.AboveMinBalance();
        } else {
            sm.WithdrawBelowMin();
        }
    }
    // display the current balance
    public void balance() {
        sm.Balance();
    }
    // login where y is a client’s identification #
    public void login(int y) {
        if(y==((DataAccount1)ds).getId()){
            sm.Login();
        } else {
            sm.IncorrectLogin();
        }
    }
    // logout from the account
    public void logout() {
        sm.Logout();
    }

    // unlocks an account where x is a pin
    public void unlock(int x) {
        if(x ==((DataAccount1)ds).getPin()) {
            sm.Unlock();
            if(((DataAccount1)ds).getTemp_a() >minBalForPenalty){
                sm.AboveMinBalance();
            } else {
                sm.BelowMinBalance();
            }
        } else {
            sm.IncorrectUnlock();
        }
    }

    // locks an account where x is a pin
    public void lock(int x){
        if(x==((DataAccount1)ds).getPin()){
            sm.Lock();
        }else{
            sm.IncorrectLock();
        }
    }


}
