package Output.MakeWithdraw;
import Data.Data;
import Data.DataAccount1;
/*
    This class serves as the MakeWithdraw class for Account 1
 */
public class MakeWithdraw1 extends MakeWithdraw {

    @Override
    public void makeWithdraw(Data ds) {
        ((DataAccount1)ds).withdraw();
        System.out.println("Account 1: Your current balance is now: " + ((DataAccount1) ds).getBalance());
    }
}
