package Output.DisplayBalance;
/*
    Account 2 DisplayBalance action responsible for printing the current balance of the account.
 */

import Data.Data;
import Data.DataAccount2;

public class DisplayBalance2 extends DisplayBalance {
//    public DisplayBalance1(Data data) {
//        super(data);
//    }

    /*
        displays the current value of the balance
         */
    @Override
    public void displayBalance(Data ds) {

        System.out.println("Account 1: Your new balance is: " + ((DataAccount2) ds).getBalance());;
    }

}