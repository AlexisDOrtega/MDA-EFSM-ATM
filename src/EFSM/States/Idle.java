package EFSM.States;

import EFSM.StateMachine;

public class Idle extends State {
    static final int Attempts = 0;
    StateMachine sm = null;

    public Idle(StateMachine sm) {
        this.sm = sm;
    }

    @Override
    public void IncorrectLogin() {
        super.IncorrectLogin();
        sm.op.incorrectIdMsg();
    }

    @Override
    public void Login(){
        super.Login();
        sm.numAttempts = Attempts;
        sm.op.promptForPin();
        sm.setState(sm.getCheckPin());
        }

    }

