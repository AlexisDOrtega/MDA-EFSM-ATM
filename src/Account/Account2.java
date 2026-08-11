package Account;
import Data.DataAccount2;
import Data.Data;
import EFSM.StateMachine;

public class Account2 {
    //This class serves as the Account 2 Input Processor.

    static final int minBalForPenalty = 0;
    static final int maxAttempts = 2;
    public StateMachine sm = null;
    public Data ds = null;

    public Account2(StateMachine sm, Data ds) {
        this.sm = sm;
        this.ds = ds;
    }
    // open an account where p is a pin, y is an user’s identification #, and a is a balance
    public void OPEN(int p, int y, float a) {
        ((DataAccount2)ds).setTemp_p(p);
        ((DataAccount2)ds).setTemp_y(y);
        ((DataAccount2)ds).setTemp_a(a);
        sm.open();
    }
    // provides pin #
    public void PIN(int x) {
        if(x == ((DataAccount2)ds).getTemp_p()) {
            if(((DataAccount2)ds).getTemp_a() > minBalForPenalty) {
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
    public void DEPOSIT(float d) {
        ((DataAccount2)ds).setTemp_d(d);
        sm.Deposit();
        if(((DataAccount2)ds).getTemp_a() > minBalForPenalty) {
            sm.AboveMinBalance();
        } else{
            sm.BelowMinBalance();
        }
    }
    // withdraw amount w
    public void WITHDRAW(float w) {
        ((DataAccount2)ds).setTemp_w(w);
        sm.Withdraw();
        if(((DataAccount2)ds).getTemp_w() >minBalForPenalty) {
            sm.AboveMinBalance();
        } else {
            sm.WithdrawBelowMin();
        }
    }
    // display the current balance
    public void BALANCE() {
        sm.Balance();
    }

    // login where y is a client’s identification #
    public void LOGIN(int y) {
        if(y==((DataAccount2)ds).getId()){
            sm.Login();
        } else {
            sm.IncorrectLogin();
        }
    }
// logout from the account
    public void LOGOUT() {
        sm.Logout();
    }
// suspends an account
    public void suspend()
    {
        sm.Suspend();
    }
// activates a suspended account
    public void activate () {
        sm.Activate();
    }
// an account is closed
    public void close() {
        sm.close();
    }

}
