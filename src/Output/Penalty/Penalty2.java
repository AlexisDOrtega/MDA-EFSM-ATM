package Output.Penalty;
import Data.Data;
import Data.DataAccount2;
/*
    this class serves as the Penalty class for Account 2
 */

public class Penalty2 extends  Penalty{
    @Override
    public void penalty(Data ds) {
        ((DataAccount2)ds).applyPenalty();
        System.out.println("Account 1: a penalty charge of $15 has been applied to your account. Your current Balance is " + ((DataAccount2) ds).getBalance());
    }
}
