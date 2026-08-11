package AbstractFactory;

import Data.Data;
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
    This class serves as the abstract superclass for the concrete factories.
    It will define the methods that will return the Account specific actions components
    which all ConcreteFactory classes will need.
 */


public abstract class AbstractFactory {

    public abstract Data createDataObj();

    public abstract DisplayBalance createDisplayBalance();

    public abstract DisplayMenu getDisplayMenu();

    public abstract IncorrectUnlockMsg getIncorrectUnlockMsg();

    public abstract IncorrectPinMsg getIncorrectPinMsg();

    public abstract IncorrectIdMsg getIncorrectIdMsg();

    public abstract IncorrectLockMsg getIncorrectLockMsg();

    public abstract MakeDeposit getMakeDeposit();

    public abstract MakeWithdraw getMakeWithdraw();

    public abstract NoFundsMsg getNoFundsMsg();

    public abstract Penalty getPenalty();

    public abstract PromptForPin getPromptForPin();

    public abstract TooManyAttemptsMsg getTooManyAttemptsMsg();

    public abstract StoreData getStoreData();




}
