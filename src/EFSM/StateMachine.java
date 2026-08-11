package EFSM;

import EFSM.States.*;
import Output.OutputProcessor;
import AbstractFactory.AbstractFactory;

/*
    this class acts as the state machine in the state pattern.
 */

public class StateMachine {

    static final int Attempts = 0;

    //instantiate each state
    State start = new Start(this);
    State idle = new Idle(this);
    State checkPin = new CheckPin(this);
    State ready = new Ready(this);
    State s1 = new S1(this);
    State overdrawn = new Overdrawn(this);
    State locked = new Locked(this);
    State suspended = new Suspended(this);
    State close = new Close(this);


    public AbstractFactory af = null;
    public OutputProcessor op = null;
    public State state = null;
    public int numAttempts;
    public int acc;

    public StateMachine(AbstractFactory af, OutputProcessor op, int acc) {
        this.state = new Start(this);
        this.op = op;
        this.af = af;
        numAttempts = Attempts;
        this.acc = acc;
    }

        /*
            State operations
         */

        public void open(){
            if(!(state instanceof Start)){
                printNotAValidOperation();
            } else {
                ((Start)state).open();
            }
            printCurState();
        }

        public void Login(){
            if(!(state instanceof Idle)){
                printNotAValidOperation();
            } else {
                ((Idle)state).Login();
            }
            numAttempts = Attempts;
            printCurState();
        }

        public void IncorrectPin(int max){
            if(!(state instanceof CheckPin)){
                printNotAValidOperation();
            } else {
                ((CheckPin)state).IncorrectPin(max);
            }
            printCurState();
        }

        public void CorrectPinBelowMin(){
            if(!(state instanceof CheckPin)){
                printNotAValidOperation();
            }else {
                ((CheckPin)state).CorrectPinBelowMin();
            }
            printCurState();
        }

        public void Deposit(){
           if((state instanceof Overdrawn)) {
               ((Overdrawn)state).Deposit();
           }
           else if((state instanceof Ready)){
               ((Ready)state).Deposit();
           }
           else{
               printNotAValidOperation();
           }
           printCurState();
        }

        public void Logout() {
            if((state instanceof Overdrawn)) {
                ((Overdrawn)state).Logout();
            } else if ((state instanceof Ready)) {
                ((Ready)state).Logout();
            }
            else {
                printNotAValidOperation();
            } printCurState();
        }

        public void CorrectPinAboveMin(){
            if(!(state instanceof CheckPin )){
                printNotAValidOperation();
            } else {
                ((CheckPin)state).CorrectPinAboveMin();
            }
            printCurState();
        }

        public void AboveMinBalance(){
            if((state instanceof Ready)){

            }
            else if (!(state instanceof S1)) {
                printNotAValidOperation();
            }else{
                ((S1)state).AboveMinBalance();
            }
            printCurState();
        }

        public void Balance() {
            if ((state instanceof Overdrawn)) {
                ((Overdrawn) state).Balance();
            } else if ((state instanceof Ready)) {
                ((Ready) state).Balance();
            } else if ((state instanceof Suspended)) {
                ((Suspended) state).Balance();
            } else {
                printNotAValidOperation();
            }
            printCurState();
        }

        public void Withdraw(){
          if((state instanceof Overdrawn)) {
              ((Overdrawn)state).Withdraw();
          } else if((state instanceof Ready)) {
              ((Ready)state).Withdraw();
          } else {
              printNotAValidOperation();
          }
          printCurState();
        }

        public void WithdrawBelowMin(){
            if(!(state instanceof S1)) {
                printNotAValidOperation();
            } else {
                ((S1)state).WithdrawBelowMin();
            }
            printCurState();
        }

        public void Activate(){
           if(!(state instanceof  Suspended)) {
               printNotAValidOperation();
           } else {
               ((Suspended)state).Activate();
           } printNotAValidOperation();
        }

        public void BelowMinBalance(){
            if(!(state instanceof S1)) {
                printNotAValidOperation();
            } else {
                ((S1)state).BelowMinBalance();
            } printCurState();
        }

        public void Suspend(){
           if(!(state instanceof Ready)) {
               printNotAValidOperation();
           } else {
               ((Ready)state).Suspend();
           } printCurState();
        }

        public void close(){
            if(!(state instanceof Suspended)) {
                printNotAValidOperation();
            } else {
                ((Suspended)state).close();
            } printCurState();
        }

        public void Unlock(){
           if(!(state instanceof Locked)) {
               printNotAValidOperation();
           } else {
               ((Locked)state).Unlock();
           } printCurState();
        }

        public void IncorrectUnlock(){
            if(!(state instanceof Locked)) {
                printNotAValidOperation();
            } else {
                ((Locked)state).IncorrectUnlock();
            } printCurState();
        }

        public void Lock(){
            if((state instanceof Overdrawn)) {
                ((Overdrawn)state).Lock();
            } else if ((state instanceof Ready)) {
                ((Ready)state).Lock();
            } else {
                printNotAValidOperation();
            } printCurState();
        }

        public void IncorrectLock(){
            if(!(state instanceof Locked)) {
                printNotAValidOperation();
            } else {
                ((Ready)state).IncorrectLock();
            } printCurState();
        }

        public void IncorrectLogin(){
            if(!(state instanceof Idle)) {
                printNotAValidOperation();
            } else {
                ((Idle)state).IncorrectLock();
            } printCurState();
        }

        public void NoFunds(){
            if(!(state instanceof Ready)) {
                printNotAValidOperation();
            } else {
                ((Ready)state).NoFunds();
            }printCurState();
        }
/*
    Setters and Getters
 */
    public int getAttempts() {
        return this.Attempts;
    }

    public State getStart() {
        return this.start;
    }

    public void setStart(State start) {
        this.start = state;
    }

    public State getIdle() {
        return this.idle;
    }

    public void setIdle(State idle) {
        this.idle = state;
    }

    public State getCheckPin() {
        return this.checkPin;
    }

    public void setCheckPin(State checkPin) {
        this.checkPin = state;
    }

    public State getReady() {
        return this.ready;
    }

    public void setReady(State ready) {
        this.ready = state;
    }

    public State getS1() {
        return this.s1;
    }

    public void setS1(State s1) {
        this.s1 = state;
    }

    public State getOverdrawn() {
        return this.overdrawn;
    }

    public void setOverdrawn(State overdrawn) {
        this.overdrawn = state;
    }

    public State getLocked() {
        return this.locked;
    }

    public void setLocked(State locked) {
        this.locked = state;
    }

    public State getSuspended() {
        return this.suspended;
    }

    public State getClose() {
        return this.close;
    }

    public void setClose(State close) {
        this.close = state;
    }

    public void setSuspended(State suspended) {
        this.suspended = state;
    }

    public AbstractFactory getAf() {
        return this.af;
    }

    public void setAf(AbstractFactory af) {
        this.af = af;
    }

    public OutputProcessor getOp() {
        return this.op;
    }

    public void setOp(OutputProcessor op) {
        this.op = op;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getNumAttempts() {
        return this.numAttempts;
    }

    public void setNumAttempts(int numAttempts) {
        this.numAttempts = numAttempts;
    }

    public int getAcc() {
        return this.acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }
    /*
        Default Messages for No OP and printing state.
     */

    private void printCurState() {

        System.out.println("Current State : "+state.getClass().getName());
    }
    private void printNotAValidOperation() {

        System.out.println("Not a valid operation");
    }
}
