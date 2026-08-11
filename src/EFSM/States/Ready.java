package EFSM.States;

import EFSM.StateMachine;
/*
    The ready state class.
 */
public class Ready extends State {
    StateMachine sm = null;

    public Ready(StateMachine sm) {
       this.sm = sm;
    }
    @Override
    public void Deposit() {
        super.Deposit();
        sm.op.makeDeposit();
    }
    @Override
    public void Withdraw() {
        super.Withdraw();
        sm.op.makeWithdraw();
        if(sm.acc ==1) {
            sm.setState(sm.getS1());
        } else {
            sm.setState(sm.getReady());
        }
    }
    @Override
    public void Balance(){
        super.Balance();
        sm.op.displayBalance();
    }

    @Override
    public void Lock() {
        super.Lock();
        sm.setState(sm.getLocked());;
    }
    @Override
    public void IncorrectLock() {
        super.IncorrectLock();
        sm.op.incorrectLockMsg();
    }
    @Override
    public void Logout() {
        super.Logout();
        sm.setState(sm.getIdle());
    }

    @Override
    public void Suspend(){
        super.Suspend();
        sm.setState(sm.getSuspended());
    }

}
