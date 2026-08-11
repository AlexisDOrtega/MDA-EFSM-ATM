package EFSM.States;
import EFSM.StateMachine;
public class Locked extends State {
    StateMachine sm = null;

    public Locked(StateMachine sm) {
        this.sm = sm;
    }

    @Override
    public void Unlock() {
        super.Unlock();
        sm.setState(sm.getS1());
    }

    @Override
    public void IncorrectUnlock(){
        super.IncorrectUnlock();
        sm.op.incorrectUnLockMsg();
    }
}
