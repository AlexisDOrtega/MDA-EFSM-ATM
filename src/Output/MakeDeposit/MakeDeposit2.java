package Output.MakeDeposit;

import Data.Data;
import Data.DataAccount2;

public class MakeDeposit2 extends MakeDeposit {

            @Override
        public void makeDeposit(Data ds) {
            ((DataAccount2)ds).deposit();
            System.out.println("Account 2: Your new balance is: " + ((DataAccount2) ds).getBalance());
        }
    }