package Output.NoFundsMsg;
/*
    Account 1 class for No Funds Message.
 */
public class NoFundsMsg1 extends NoFundsMsg{
    // Displays no sufficient funds msg
    @Override
    public void noFundsMsg(){
        System.out.println("Account 1: There are not sufficient funds to complete your transaction.");
    }
}
