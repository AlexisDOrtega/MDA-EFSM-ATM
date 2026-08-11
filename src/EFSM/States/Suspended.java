package EFSM.States;
import EFSM.StateMachine;
/*
    this class is for the Suspended state
 */
public class Suspended extends State {
    StateMachine sm = null;

    public Suspended(StateMachine sm){

        this.sm = sm;
    }

    @Override
    public void Balance() {
        super.Balance();
        sm.op.displayBalance();
    }

    @Override
    public void Activate(){
        super.Activate();
        sm.setState(sm.getReady());
    }
    @Override
    public void close(){
        super.close();
        sm.setState(sm.getStart());
    }
}
