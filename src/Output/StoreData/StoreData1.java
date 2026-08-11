package Output.StoreData;
import Data.Data;
import Data.DataAccount1;

/*
    Account 1 class for storing data upon opening an account
 */

public class StoreData1 extends StoreData {

//    public StoreData1(Data data) {
//        super(data);
//    }

    /*
     stores data from temporary area in data store to open an account with values for balance, pin, and id.
     */
    @Override
    public void storeData(Data ds){
        ((DataAccount1)ds).setPin();
        System.out.println("Account 1 pin is" + ((DataAccount1)ds).getPin());
    }
}
