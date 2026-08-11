package Output.DisplayBalance;
/*

    Abstract Display Balance class for action strategy.
    All display Balance "actions" under this abstract class. This is so that each account can choose which class to implement.

 */
import Data.Data;

public abstract class DisplayBalance {
//    Data data;
//    public DisplayBalance(Data data) {
//        this.data = data;
//
//    }
    public abstract void displayBalance(Data ds);

}
