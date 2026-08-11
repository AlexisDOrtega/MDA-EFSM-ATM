package Output.MakeWithdraw;
import Data.Data;
import Data.DataAccount2;
/*
    This class serves as the MakeWithdraw class for Account 2
 */
public class MakeWithdraw2 extends MakeWithdraw {

    @Override
    public void makeWithdraw(Data ds) {
        ((DataAccount2)ds).withdraw();
        System.out.println("Account 1: Your current balance is now: " + ((DataAccount2) ds).getBalance());
    }
}
