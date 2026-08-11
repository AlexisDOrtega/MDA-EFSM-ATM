package Output.Penalty;
import Data.Data;
import Data.DataAccount1;
/*
    this class serves as the Penalty class for Account 1
 */

public class Penalty1 extends  Penalty{


    // applies penalty (decreases balance by the amount of penalty)
    @Override
    public void penalty(Data ds) {
        ((DataAccount1)ds).applyPenalty();
        System.out.println("Account 1: a penalty charge of $20 has been applied to your account. Your current Balance is " + ((DataAccount1) ds).getBalance());
    }
}
