package EFSM.States;
/*
    the start state
 */

import EFSM.StateMachine;

public class Start extends State {
StateMachine sm = null;

    public Start(StateMachine sm) {
     this.sm = sm;
    }

    @Override
    public void open(){
        super.open();
        sm.setState(sm.getIdle());
        sm.op.storeData();
    }

}
