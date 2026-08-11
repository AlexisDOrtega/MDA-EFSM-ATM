package Output.StoreData;
import Data.Data;
import Data.DataAccount2;
/*
    Account 2 class for storing data upon opening an account
 */
public class StoreData2 extends StoreData {

//    public StoreData1(Data data) {
//        super(data);
//    }

    /*
     stores data from temporary area in data store to open an account with values for balance, pin, and id.
     */
    @Override
    public void storeData(Data ds){
        ((DataAccount2)ds).setPin();
        System.out.println("Account 1 pin is" + ((DataAccount2)ds).getPin());
    }
}