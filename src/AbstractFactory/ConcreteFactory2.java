package AbstractFactory;

import Data.*;
import Output.DisplayBalance.*;
import Output.DisplayMenu.*;
import Output.IncorrectIdMsg.*;
import Output.IncorrectLockMsg.*;
import Output.IncorrectPinMsg.*;
import Output.IncorrectUnlockMsg.*;
import Output.MakeDeposit.*;
import Output.MakeWithdraw.*;
import Output.NoFundsMsg.*;
import Output.Penalty.*;
import Output.PromptForPin.*;
import Output.StoreData.*;
import Output.TooManyAttemptsMsg.*;

/*
    This class is the factory that produces the necessary driver objects for Account 2
    It instantiates the proper action strategies for the shared data structure.
    Output Processor objects will be instantiated with an object of this class when it needs to
    display output for Account2. OP will call these methods in order to bind Account2 specific actions.
 */

public class ConcreteFactory2 extends AbstractFactory {
    Data ds = new DataAccount2();
    DisplayBalance db = new DisplayBalance2();
    DisplayMenu dm = new DisplayMenu2();
    IncorrectPinMsg ip = new IncorrectPinMsg2();
    MakeDeposit md = new MakeDeposit2();
    MakeWithdraw mw = new MakeWithdraw2();
    Penalty p = new Penalty2();
    TooManyAttemptsMsg tma = new TooManyAttemptsMsg2();
    IncorrectIdMsg incId = new IncorrectIdMsg2();
    IncorrectLockMsg il = new IncorrectLockMsg2();
    IncorrectUnlockMsg iu = new IncorrectUnlockMsg2();
    NoFundsMsg nf = new NoFundsMsg2();
    StoreData sd = new StoreData2();
    PromptForPin pfp = new PromptForPin2();





    public Data getData() {
        return this.ds;
    }
    @Override
    public Data createDataObj() {
        return this.ds;
    }

    @Override
    public DisplayBalance createDisplayBalance() {
        return this.db;
    }
    /*
        Returns the DisplayMenu class that displays the appropriate Menu for Account1
     */
    @Override
    public DisplayMenu getDisplayMenu() {
        return this.dm;
    }
    /*
        Returns the IncorrectUnlockMsg class that displays the appropriate Incorrect Unlock Msg for Account1
     */

    @Override
    public IncorrectUnlockMsg getIncorrectUnlockMsg() {
        return this.iu;
    }
    /*
        Returns the IncorrectPinMsg class that displays the appropriate Incorrect Pin Msg for Account 1
     */
    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        return this.ip;
    }
    /*
        Returns the IncorrectIdMsg class that displays the appropriate Incorrect Id Msg for Account 1
     */

    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        return this.incId;
    }
    /*
        Returns the IncorrectLockMsg class that displays the appropriate Incorrect Lock Msg for Account 1
     */

    @Override
    public IncorrectLockMsg getIncorrectLockMsg() {
        return this.il;
    }
    /*
        Returns the MakeDeposit class for Account 1
     */
    @Override
    public MakeDeposit getMakeDeposit() {
        return this.md;
    }
    /*
        Returns the MakeWithdraw class for Account 1
     */
    @Override
    public MakeWithdraw getMakeWithdraw() {
        return this.mw;
    }
    /*
        Returns the NoFundsMsg class that displays the appropriate Incorrect Lock Msg for Account 1
     */

    @Override
    public NoFundsMsg getNoFundsMsg() {
        return this.nf;
    }
    /*
        Returns the Penalty class that displays the appropriate Penalty message and applies it for Account 1
     */
    @Override
    public Penalty getPenalty() {
        return this.p;
    }
    /*
        Returns the PromptForPin class that displays the appropriate Prompt For Pin for Account 1
     */

    @Override
    public PromptForPin getPromptForPin() {
        return this.pfp;
    }
    /*
        Returns TooManyAttemptsMsg class that displays the appropriate Too Many Attempts Msg for Account1
     */

    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        return this.tma;
    }

    /*
        Returns the StoreData class that stores the appropriate Data for Account1
     */
    @Override
    public StoreData getStoreData() {
        return this.sd;
    }
}