package Output.MakeDeposit;

import Data.Data;
import Data.DataAccount1;
/*
    this class is the MakeDeposit class for Account1
 */
public class MakeDeposit1 extends MakeDeposit {




    @Override
    public void makeDeposit(Data ds) {
        ((DataAccount1)ds).deposit();
        System.out.println("Account 1: Your new balance is: " + ((DataAccount1) ds).getBalance());
    }
}
