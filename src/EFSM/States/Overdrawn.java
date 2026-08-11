package EFSM.States;
import EFSM.StateMachine;
/*
    the class for the overdrawn state
 */
public class Overdrawn extends State {
    StateMachine sm = null;

    public Overdrawn(StateMachine sm) {
       this.sm =sm;
    }

    @Override
    public void Deposit(){
        super.Deposit();
        sm.op.makeDeposit();
        sm.setState(sm.getS1());
    }

    @Override
    public void Balance(){
        super.Balance();
        sm.op.displayBalance();
    }
    @Override
    public void Withdraw(){
        super.Withdraw();
        sm.op.noFundsMsg();
    }

    @Override
    public void Lock(){
        super.Lock();
        sm.setState(sm.getLocked());
    }
    @Override
    public void Logout(){
        super.Logout();
        sm.setState(sm.getIdle());
    }
}
