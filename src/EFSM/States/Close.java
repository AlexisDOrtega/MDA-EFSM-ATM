package EFSM.States;
import EFSM.StateMachine;

/*
    class for the close state. doesn't really do anything significant as the set Close state option actually returns the
    program to the Start State for the purpose of continuity.
 */
public class Close extends State {
    StateMachine sm = null;

    public Close(StateMachine sm){

        this.sm =sm;
    }
}
