package Output;

import AbstractFactory.AbstractFactory;
import Output.DisplayBalance.DisplayBalance;
import Output.DisplayMenu.DisplayMenu;
import Output.IncorrectIdMsg.IncorrectIdMsg;
import Output.IncorrectLockMsg.IncorrectLockMsg;
import Output.IncorrectPinMsg.IncorrectPinMsg;
import Output.IncorrectUnlockMsg.IncorrectUnlockMsg;
import Output.MakeDeposit.MakeDeposit;
import Output.MakeWithdraw.MakeWithdraw;
import Output.NoFundsMsg.NoFundsMsg;
import Output.Penalty.Penalty;
import Output.PromptForPin.PromptForPin;
import Output.StoreData.StoreData;
import Output.TooManyAttemptsMsg.TooManyAttemptsMsg;
import Data.Data;
import EFSM.StateMachine;


/*
    This class is our output processor for our atm accounts. it will put through the actions.
    Each Account can chose which action strategy to use which is implemented through the Abstract Factory
    design as well. Each meta action in this class calls the platform specific implementation of the action.
    This class acts as the client of a normal strategy design pattern.

 */

public class OutputProcessor {


        public Data ds = null;
        public AbstractFactory af = null;
        public StateMachine sm = null;

        public OutputProcessor(Data ds, AbstractFactory af) {
            this.af = af;
            this.ds = ds;
        }

        public void displayBalance() {
            DisplayBalance dpObj = af.createDisplayBalance();
            dpObj.displayBalance(ds);
        }

        public void displayMenu() {
            DisplayMenu dmObj = af.getDisplayMenu();
            dmObj.displayMenu();
        }

        public void incorrectIdMsg() {
            IncorrectIdMsg iimObj = af.getIncorrectIdMsg();
            iimObj.incorrectIdMsg();
        }

        public void incorrectLockMsg() {
            IncorrectLockMsg ilmObj = af.getIncorrectLockMsg();
            ilmObj.incorrectLockMsg();
        }

        public void incorrectPinMsg() {
            IncorrectPinMsg ipmObj = af.getIncorrectPinMsg();
            ipmObj.incorrectPinMsg();
        }

        public void incorrectUnLockMsg() {
            IncorrectUnlockMsg iumObj = af.getIncorrectUnlockMsg();
            iumObj.incorrectUnlockMsg();
        }

        public void makeDeposit() {
            MakeDeposit mdObj = af.getMakeDeposit();
            mdObj.makeDeposit(ds);
        }

        public void makeWithdraw() {
            MakeWithdraw mwObj = af.getMakeWithdraw();
            mwObj.makeWithdraw(ds);
        }

        public void noFundsMsg() {
            NoFundsMsg nfmObj = af.getNoFundsMsg();
            nfmObj.noFundsMsg();
        }

        public void penalty() {
            Penalty pObj = af.getPenalty();
            pObj.penalty(ds);
        }

        public void promptForPin() {
            PromptForPin pfpObj = af.getPromptForPin();
            pfpObj.promptForPin();
        }

        public void storeData() {
            StoreData sdObj = af.getStoreData();
            sdObj.storeData(ds);
        }

        public void tooManyAttemptsMsg() {
            TooManyAttemptsMsg tmaObj = af.getTooManyAttemptsMsg();
            tmaObj.tooManyAttemptsMsg();
        }
    }



