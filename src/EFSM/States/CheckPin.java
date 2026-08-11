package EFSM.States;
/*
    State CheckPin in the EFSM Model
 */

import EFSM.StateMachine;

public class CheckPin extends State {
    StateMachine sm = null;

    public CheckPin(StateMachine sm) {
       this.sm = sm;
    }

    @Override
    public void CorrectPinBelowMin() {
        super.CorrectPinBelowMin();
        sm.op.displayMenu();
        sm.setState(sm.getOverdrawn());
    }
    @Override
    public void CorrectPinAboveMin() {
        super.CorrectPinAboveMin();
        sm.op.displayMenu();
        sm.setState(sm.getReady());
    }

    @Override
    public void IncorrectPin(int max){
        super.IncorrectPin(max);
        if(sm.numAttempts >=max) {
            sm.op.incorrectPinMsg();
            sm.op.tooManyAttemptsMsg();
            sm.setState(sm.getIdle());
        } else if(sm.numAttempts < max) {
            sm.numAttempts++;
            sm.op.incorrectPinMsg();
        }

    }

    }
