package EFSM.States;

import EFSM.StateMachine;

/*
    the class for the state S1
 */
public class S1 extends State {
    StateMachine sm = null;

    public S1(StateMachine sm){
        this.sm = sm;
    }

    @Override
    public void WithdrawBelowMin() {
        super.WithdrawBelowMin();
        sm.op.penalty();
        sm.setState(sm.getOverdrawn());
    }

    @Override
    public void AboveMinBalance() {
        super.AboveMinBalance();
        sm.setState(sm.getReady());
    }

    @Override
    public void BelowMinBalance(){
        super.BelowMinBalance();
        sm.setState(sm.getOverdrawn());
    }
}
